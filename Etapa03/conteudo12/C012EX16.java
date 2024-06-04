import java.util.Scanner;

public class C012EX16 {
    public static void main(String[] args) {
        int tamanhoVet = 100;

        //declaracao de vetores
        String cidade[] = new String[tamanhoVet];
        String estado[] = new String[tamanhoVet];
        int populacao[] = new int[tamanhoVet];

        int maiorPopulacao = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < tamanhoVet; i++){
            System.out.println("Nome da cidade -> ");
            cidade[i] = input.nextLine();

            System.out.println("Nome do estado -> ");
            estado[i] = input.nextLine();

            System.out.println("População -> ");
            populacao[i] = input.nextInt();
            System.out.println("------##-------");
            input.nextLine();

            if(populacao[i] > maiorPopulacao){
                maiorPopulacao = populacao[i];
            }
        }

        System.out.println("Estados com a maior população");
        for(int i = 0; i < tamanhoVet; i++){
            if(populacao[i] == maiorPopulacao){
                System.out.println("Estado -> " + estado[i] + "\nCidade -> " + cidade[i] + "\nPopulação -> " + populacao[i]);
            }
        }
        input.close();
    }
}
