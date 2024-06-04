package conteudo08;

import java.util.Scanner;

// Faça um programa que calcule os valores da função abaixo,
//  com x variando de 3 até 12. Os dados deverão ser 
//  impressos da seguinte forma:

public class C08EX17 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        for(int i = 3; i <= 12; i++){ 
            double fdeX = Math.sqrt(Math.pow(i, 2) - 3);
            System.out.println("x = " + i);
            System.out.println("F(x) = " + fdeX);
            System.out.println("----------##----------");
        }
        input.close();
    }
}
