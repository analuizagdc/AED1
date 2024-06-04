import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe um numero inteiro -> ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
            input.close();
        }
    }
}