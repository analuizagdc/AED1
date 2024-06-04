import java.util.Scanner;

public class C012EX24 {
    public static void main(String[] args) {

        // variaveis
        int tamanhoVet = 3, temp, pos = -1;
        String pesquisaEquipe, situacao = "";

        // vetores
        String nomeEquipe[] = new String[tamanhoVet];
        int pontFinal[] = new int[tamanhoVet];

        Scanner input = new Scanner(System.in);

        // leitura dos dados
        for (int i = 0; i < tamanhoVet; i++) {
            System.out.println("Nome da equipe -> ");
            nomeEquipe[i] = input.nextLine();

            System.out.println("Pontuação final -> ");
            pontFinal[i] = input.nextInt();
            input.nextLine();
        }

        // metodo da bolha para ordenar a pontuacao das equipes em ordem decrescente
        for (int j = 0; j < tamanhoVet - 1; j++) {
            for (int i = 0; i < tamanhoVet - 1; i++) {
                if (pontFinal[i] > pontFinal[i + 1]) {
                    temp = pontFinal[i];
                    pontFinal[i] = pontFinal[i + 1];
                    pontFinal[i + 1] = temp;
                }
            }
        }

        System.out.println("Digite o nome da equipe para saber sua posição -> ");
        pesquisaEquipe = input.nextLine();

        for (int i = 0; i < tamanhoVet; i++) {
            if (pesquisaEquipe.equalsIgnoreCase(nomeEquipe[i])) {
                pos = i;
                break;
            }
        }

        if (pos == -1)
            System.out.println("Equipe inexistente!");
        else
            System.out.println("Equipe na posição -> " + (pos + 1));

        // posicao e situacao da equipe

        if (pos >= 1 && pos <= 4) {
            situacao = "Copa libertadores";
            System.out.println(situacao);

        } else if (pos >= 5 && pos <= 12) {
            situacao = "Copa Sul-Americana";
            System.out.println(situacao);

        } else if (pos >= 17 && pos <= 20) {
            situacao = "Rebaixada";
            System.out.println(situacao);
        }

        input.close();
    }
}
