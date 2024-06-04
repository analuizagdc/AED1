import java.util.Scanner;

public class C012EX21 {
    public static void main(String[] args) {
        int tamanhoVetor = 20;
        int[] numeros = new int[tamanhoVetor];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro -> ");
            numeros[i] = input.nextInt();
        }

        // impressao dos numeros impares
        for (int i = 0; i < tamanhoVetor; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i]);
            }
        }
        
        // impressao dos numeros pares
        for (int i = 0; i < tamanhoVetor; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i]);
            }
        }


        input.close();
    }
}
