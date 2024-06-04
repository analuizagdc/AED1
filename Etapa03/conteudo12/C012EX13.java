import java.util.Scanner;

public class C012EX13 {
    public static void main(String[] args) {

        int tamanhoVetor = 10;
        String nomes[] = new String[tamanhoVetor];

        Scanner input = new Scanner(System.in);

        // adicionando valores no vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome -> ");
            nomes[i] = input.nextLine();
        }

        // input de pesquisa de nomes que estao no vetor
        System.out.println("Digite o nome que procura -> ");
        String pesquisa = input.nextLine();

        int pos = -1;

        for(int i = 0; i < nomes.length; i++){
            if(pesquisa.equalsIgnoreCase(nomes[i])){
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Valor nao encontrado!");
        } else {
            System.out.println("Valor encontrado!! Sua posição é -> " + (pos + 1));
        }

        input.close();
    }
}
