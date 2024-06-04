package conteudo08;

import java.util.Scanner;

// Faça um programa que solicite ao usuário um número
//  inteiro de 1 a 9, e calcule e imprima 
//  a tabuada deste número, conforme mostrado abaixo.

public class C08EX18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um numero inteiro de 1 a 9");
        int num = input.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(i + " x " + num + " = " + (i * num));
        }
        input.close();
    } 
}

