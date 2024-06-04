import java.util.Scanner;

public class C012EX17 {
    public static void main(String[] args) {

        int tamanhoVet = 10, soma = 0, count = 0;
        int num[] = new int[tamanhoVet];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < tamanhoVet; i++) {
            System.out.println("Numeros -> ");
            num[i] = input.nextInt();
        }

        for (int i = 0; i < tamanhoVet; i++) {
            if (num[i] % 2 == 0) {
                soma += num[i];
                count++;
                System.out.println("Numeros pares -> " + num[i]);
            }
        }

        double media = soma / count;
        System.out.println("Media -> " + media);

        input.close();
    }
}