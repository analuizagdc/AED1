import java.util.Scanner;

public class C012EX01 {
    public static void main(String[] args) {

        int numeros[] = new int[10];
        int count = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero inteiro -> ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 5 == 0 && numeros[i] % 7 == 0) {
                count++;
            }
        }

        System.out.println("Quantidade de divisores de 5 a 7 -> " + count);

        input.close();
    }

}
