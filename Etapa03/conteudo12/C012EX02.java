import java.util.Scanner;

public class C012EX02 {
    public static void main(String[] args) {

        int numeros[] = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero inteiro -> ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 5 && numeros[i] < 10) {
                System.out.print(numeros[i] + " ");
            }
        }

        input.close();
    }
}
