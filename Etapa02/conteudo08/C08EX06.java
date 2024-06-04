package conteudo08;

import java.util.Scanner;

// Faça um programa para solicitar ao usuário 10 números inteiros e calcular e imprimir:

//  Para cada número lido se ele é par ou ímpar
//  A soma dos números divisíveis por 4
//  A quantidade de números divisíveis por 3

public class C08EX06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0, num, soma = 0, countInput = 1, cont3 = 0;

        System.out.println("Digite 10 numeros inteiros-> ");

        for (count = 1; count <= 10; count++) {
            System.out.println(countInput + "° numero: ");
            num = input.nextInt();
            countInput++;

            // Verificacao de numero par ou impar e a quantidade de divisiveis por tres
            if (num % 2 == 0) {
                System.out.println("Numero Par!");
            } else if (num % 2 == 1) {
                System.out.println("Numero Impar!");
            }

            if (num % 3 == 0)
                cont3++;

            // soma dos numeros divisiveis por quatro
            if (num % 4 == 0) {
                soma += num;
            }
        }

        System.out.println("Divisivel por 4 -> " + soma);
        System.out.println("Divisiveis por 3 -> " + cont3);
        input.close();

    }
}