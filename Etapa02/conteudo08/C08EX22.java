package conteudo08;

import java.util.Scanner;
 
public class C08EX22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro maior que 1 -> ");
        int numero = input.nextInt();
       
        for (int i = 2; i <= numero; i++) {
            int divisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                System.out.println("Os numeros primos são: ");
                System.out.print(i + " ");
            }
        }

       
        input.close();
    }
}