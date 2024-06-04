package conteudo08;

import java.util.Scanner;

// Faça um programa que calcule e imprima todos os
// números compreendidos entre 1000 e 9999 que são
// palíndromos. Um palíndromo é uma sequência de 
// caracteres que é lida da esquerda para a direita
// ou da direita para a esquerda resultando no mesmo
// valor final. Ao final imprima a média destes números.

public class C08EX23 {
    public static void main(String[] args) {
        int soma = 0, count = 0, invertido = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 1001; i <= 9999; i++) {
            // inverter os numeros
            int num01 = i % 10;
            int num02 = (i % 100 / 10) * 10;
            int num03 = (i % 1000 / 100) * 100;
            int num04 = (i / 1000) * 1000;

            // inversao do numero lido no for
            invertido = num04 + num03 + num02 + num01;

            // se o i for igual ao numero invertido, a variavel soma vai receber o valor e o
            // count vai contar quantas vezes algo entrou no if e ficou (para dps ser feita
            // a media)
            if (i == invertido) {
                soma += i;
                count++;
            }
        }

        // tirar a media
        double media = (soma / count);
        System.out.println("Média -> " + media);
        input.close();
    }

}
