package conteudo08;

import java.util.Scanner;

// Faça um programa que calcule e imprima a média 
// dos números ímpares que estejam dentro do intervalo
//  de 1000 a 2000.

// Dica: Use o operador aritmético %.
// Se X % 2 diferente de 0 então X é ímpar.

//fazer um for onde i vai de 1000 a 2000
// dentro do for verificar se i e impar e quantos
//impares tem dentro do for.
//feito isso, agora eu vou fazer a media dos impares.
//para fazer a media dos impares, tenho que ter a quantidade
//de numeros impares e dividir pela soma de numeros impares 

public class C08EX16 {
    public static void main(String[] args) {
        double quantImpares = 0, media = 0, somaImpares = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1000; i < 2000; i++) {
            if (i % 2 != 0) {
                quantImpares++;
                somaImpares += i;
            }
        }
        
        media = somaImpares/quantImpares;
        System.out.println("Media dos numeros impares: " + media);
        input.close();
    }

}
