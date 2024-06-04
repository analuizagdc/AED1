
// Faça um programa que leia um número inteiro de 5 dígitos e o imprima na vertical.

import java.util.Scanner;

public class C05EX10 {
    public static void main(String[] args){
        int num, num1, num2, num3, num4, num5;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero de cinco digitos: ");
        num = teclado.nextInt();

        num1 = num / 10000;
        num2 = num / 1000 % 10;
        num3 = num / 100 % 10;
        num4 = num / 10 % 10;
        num5 = num / 1 % 10; 

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        teclado.close();
    }
}
