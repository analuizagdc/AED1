import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C012EX26 {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<String>();
        List<Double> listaSalarios = new ArrayList<Double>();

        double salarios, valorReajuste;
        String nomes;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite o nome do funcionario (Digite 'x' para encerrar) -> ");
            nomes = input.nextLine();

            if (!nomes.equalsIgnoreCase("x")) {
                System.out.println("Digite o salário do funcionario -> ");
                salarios = input.nextDouble();

                input.nextLine(); // passar para a proxima linha

                // verificacao se o salario e menor que 1000
                if (salarios < 1000) {
                    System.out.println("Digite a porcentagem do reajuste -> ");
                    valorReajuste = input.nextDouble();
                    input.nextLine();

                    salarios += salarios * (valorReajuste / 100);
                }

                // adicionando os valores as listas
                listaNomes.add(nomes);
                listaSalarios.add(salarios);

            } else
                System.out.println("Programa Finalizado !");

        } while (!nomes.equalsIgnoreCase("x"));

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Funcionario -> " + listaNomes.get(i) + " \n Salario -> " + listaSalarios.get(i));
        }

        input.close();
    }
}
