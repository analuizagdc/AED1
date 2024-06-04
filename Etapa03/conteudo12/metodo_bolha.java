import java.util.Scanner;


/**
 * exemplo09
 */
public class metodo_bolha {
    public static void main(String[] args) {

        int vet[] = new int[4];
        int temp;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite os numeros -> ");
            vet[i] = input.nextInt();
        }

        for (int aux = 0; aux < vet.length - 1; aux++) { //repete ate terminar pra todos ficarem em ordem
            for (int i = 0; i < vet.length - 1; i++) { // -1 pq vetor comeca com o espaco
                if (vet[i] > vet[i + 1]) {  // se o valor atual do vetor i for maior que o vetor j - 1 (se a primeira posicao for menor que a segunda)
                    temp = vet[i]; // tem vai armazenar o valor de j
                    vet[i] = vet[i + 1]; // o valor que tiver no j, vai passar para uma posicao
                    vet[i + 1] = temp; // o valor armazenado em temp vai passar pra posicao do
                }
            }
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        input.close();
    }
}