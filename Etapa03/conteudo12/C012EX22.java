import java.util.Scanner;

public class C012EX22 {
    public static void main(String[] args) {

        int tamanhoVet = 100, pos = -1, pesquisaPlaca;
        int placaCarro[] = new int[tamanhoVet];
        String nomeDonoDaVaga[] = new String[tamanhoVet];
        String escolha, pesquisaNome;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < tamanhoVet; i++) {
            System.out.println("Placa do carro -> ");
            placaCarro[i] = input.nextInt();

            // Limpa o buffer após a leitura do número para evitar problemas com a leitura da próxima linha
            input.nextLine();

            System.out.println("Nome do dono da vaga -> ");
            nomeDonoDaVaga[i] = input.nextLine();
        }

        System.out.println("Procurar por placa |P|  Procurar por nome do morador |M|");
        escolha = input.nextLine().toUpperCase();

        if (escolha.equalsIgnoreCase("P")) {
            System.out.println("Digite o número da placa -> ");
            pesquisaPlaca = input.nextInt();

            for (int i = 0; i < tamanhoVet; i++) {
                if (pesquisaPlaca == placaCarro[i]) {
                    pos = i;
                    System.out.println("Vaga do carro com placa " + pesquisaPlaca + " é -> " + (pos + 1));
                    break;
                }
            }

            if (pos == -1) {
                System.out.println("Carro com placa " + pesquisaPlaca + " não encontrado.");
            }

        } else {
            System.out.println("Digite o nome do motorista -> ");
            pesquisaNome = input.nextLine();

            for (int i = 0; i < tamanhoVet; i++) {
                if (pesquisaNome.equalsIgnoreCase(nomeDonoDaVaga[i])) {
                    pos = i;
                    System.out.println("Vaga do carro no nome de " + pesquisaNome + " é -> " + (pos + 1));
                    break;
                }
            }

            if (pos == -1) {
                System.out.println("Carro no nome de " + pesquisaNome + " não encontrado.");
            }

        }

        input.close();

    }

}
