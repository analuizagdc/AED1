package conteudo08;

import java.util.Scanner;

// Faça um programa que imprima os n primeiros
//  termos da progressão numérica abaixo. 
//  No final imprima a soma destes termos. 

public class C08EX20 {
    public static void main(String[] args) {
        double mult = 0, soma = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 100; i++) {
            mult = Math.pow(2, i);
            System.out.println(mult);
        }
        // System.out.println(soma);
        input.close();
    }
}

//sem usar math.pow

// System.out.println("Digite a quantidade de termos da progressão:");
// int n = input.nextInt();

// double mult = 1, soma = 0;

// for (int i = 0; i < n; i++) {
//     System.out.println(mult);
//     soma += mult;
//     mult *= 2;
// }

// System.out.println("Soma dos termos: " + soma);
// input.close();
// 
