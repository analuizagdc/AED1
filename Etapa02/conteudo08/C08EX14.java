package conteudo08;

import java.util.Scanner;

// Faça um programa que leia um número n (entre 1 e 20) e um símbolo
//  qualquer, e imprima uma matriz de tamanho “n x n”, conforme exemplo abaixo. 

public class C08EX14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o simbolo que será imprimido -> ");
        String simbolo = input.nextLine();

        System.out.println("Escolha um numero de 1 a 20 -> ");
        int n = input.nextInt();

        for (int rep = 0; rep < n; rep++) {
            for (int rep2 = 0; rep2 < n; rep2++) {
                System.out.printf(simbolo, " ");
            }
            System.out.println();
        }
        input.close();
    }
}
