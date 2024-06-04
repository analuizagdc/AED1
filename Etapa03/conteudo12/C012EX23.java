import java.util.Scanner;

public class C012EX23 {
    public static void main(String[] args) {
        int tamanhoVet = 10, contador = 0;;
        int num[] = new int[tamanhoVet];
        int divPorTres[] = new int[tamanhoVet];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < tamanhoVet; i++) {
            System.out.println("Digite um número inteiro -> ");
            num[i] = input.nextInt();
        }

        // verificacao divisiveis por 3
        for (int i = 0; i < tamanhoVet; i++) {
            if (num[i] % 3 == 0) {
                divPorTres[contador] = num[i];
                contador++;
            }
        }

        // impressao divisiveis por 3
        System.out.println("Divisíveis por 3 -> ");
        for (int i = 0; i < contador; i++) {
            System.out.println(divPorTres[i]);
        }

        input.close();
    }
}
