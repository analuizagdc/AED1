package conteudo08;

import java.util.Scanner;

// Faça um programa que leia dois valores inteiros e positivos,
// X e Y. Por meio de multiplicações sucessivas, calcule e imprima
// a função de exponenciação XY.

// Observação: Não deve ser utilizado nenhuma função 
// (ou método) para se calcular a potência.

public class C08EX29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resultado = 1;

        System.out.print(" X = ");
        int x = input.nextInt();

        System.out.print(" Y = ");
        int y = input.nextInt();
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }

        System.out.println(x + "^" + y + " = " + resultado);

        input.close();

    }
}

// x*x e auxiliar maior que y