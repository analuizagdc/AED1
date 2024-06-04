import java.util.ArrayList;
import java.util.Scanner;

public class C013EXExtra03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> listNome = new ArrayList<>();
        ArrayList<Double> listSalario = new ArrayList<>();
        ArrayList<Integer> listDependentes = new ArrayList<>();
        ArrayList<Double> listImposto = new ArrayList<>();
        String nome;

        do {
            System.out.println("Digite seu nome -> ");
            nome = input.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                listNome.add(nome);

                System.out.println("Digite seu salario -> ");
                listSalario.add(input.nextDouble());

                System.out.println("Digite a quantidade de dependentes -> ");
                listDependentes.add(input.nextInt());
                input.nextLine();
            }

        } while (!nome.equalsIgnoreCase("fim"));

        calculoIRPF(listSalario, listDependentes, listImposto);
        ordenacaoAlfabetica(listNome, listImposto);

        System.out.println(listNome);
        System.out.println(listImposto);

        input.close();
    }

    static void calculoIRPF(ArrayList<Double> listSalario, ArrayList<Integer> listDependentes,
            ArrayList<Double> listImposto) {
        for (int i = 0; i < listSalario.size(); i++) {

            double faixaSalarial = listSalario.get(i) - (listDependentes.get(i) * 150);

            if (faixaSalarial <= 1000) {
                // System.out.println("Imposto Isento");
                listImposto.add(0.0);

            } else if (faixaSalarial > 1000 && faixaSalarial < 5000) {
                int imposto = (int) (faixaSalarial * 0.10);
                listImposto.add((double) imposto);
                // System.out.println("Imposto -> " + imposto);

            } else if (faixaSalarial > 5000 && faixaSalarial < 10000) {
                int imposto = (int) (faixaSalarial * 0.15);
                listImposto.add((double) imposto);
                // System.out.println("Imposto -> " + imposto);

            } else {
                int imposto = (int) (faixaSalarial * 0.20);
                listImposto.add((double) imposto);
                // System.out.printf("Imposto -> " + imposto);
            }
        }

    }

    static void ordenacaoAlfabetica(ArrayList<String> listNomes, ArrayList<Double> listaImposto) {
        for (int j = 0; j < listNomes.size() - 1; j++) {
            for (int i = 0; i < listNomes.size() - 1 - j; i++) {

                // alfabetica
                if (listNomes.get(i).compareToIgnoreCase(listNomes.get(i + 1)) > 0) {
                    // Swap names
                    String tempNome = listNomes.get(i);
                    listNomes.set(i, listNomes.get(i + 1));
                    listNomes.set(i + 1, tempNome);

                    // Swap corresponding impostos
                    double tempImposto = listaImposto.get(i);
                    listaImposto.set(i, listaImposto.get(i + 1));
                    listaImposto.set(i + 1, tempImposto);
                }
            }
        }
    }

}
