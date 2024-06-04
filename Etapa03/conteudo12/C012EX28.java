import java.util.ArrayList;
import java.util.Scanner;

/**
 * C012EX28
 */
public class C012EX28 {
    public static void main(String[] args) {
        ArrayList<Integer> listaRA = new ArrayList<>();
        ArrayList<String> listNomes = new ArrayList<>();

        int ra, tempRA;
        String nome, tempNome, pesquisaNome;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite seu nome (Digite 'fim' para finalizar) -> ");
            nome = input.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.println("Digite o RA (Registro Academico) do aluno ->");
                ra = input.nextInt();
                input.nextLine();

                // adicionando os valores as listas
                listaRA.add(ra);
                listNomes.add(nome);

                for (int j = 0; j < listNomes.size() - 1; j++)
                    for (int i = 0; i < listNomes.size() - 1; i++)
                        // ordenacao alfabetica
                        if (listNomes.get(i).compareToIgnoreCase(listNomes.get(i + 1)) > 0) {
                            tempNome = listNomes.get(i);
                            listNomes.set(i, listNomes.get(i + 1));
                            listNomes.set(i + 1, tempNome);

                            // ordenacao numerica
                            tempRA = listaRA.get(i);
                            listaRA.set(i, listaRA.get(i + 1));
                            listaRA.set(i + 1, tempRA);
                        }
            }

        } while (!nome.equalsIgnoreCase("fim"));

        // conferindo se a ordenacao esta certa
        // System.out.println(listNomes);
        // System.out.println(listaRA);

        while (true) {
            System.out.println("Digite o nome do aluno que procura (Digite 'fim' para finalizar) -> ");
            pesquisaNome = input.nextLine();

            int pos = -1;

            if (pesquisaNome.equalsIgnoreCase("fim"))
                break;

            for (int i = 0; i < listNomes.size(); i++)
                if (pesquisaNome.equals(listNomes.get(i))) {
                    pos = listNomes.indexOf(pesquisaNome);
                    System.out.println("Aluno encontrado, seu RA é -> " + listaRA.get(i) + " e está na posição "
                            + (pos + 1) + " da lista! ");

                    // a corrigir
                } else {
                    System.out.println("Nome nao encontrado!! Deseja procurar outro aluno |S|-Sim  |N|-Nao ?");
                    String prosseguir = input.nextLine().toUpperCase();

                    if (prosseguir.equalsIgnoreCase("S"))
                        break;
                    else
                        System.out.println("Programa finalizado!");

                }
            input.close();
        }

    }
}
