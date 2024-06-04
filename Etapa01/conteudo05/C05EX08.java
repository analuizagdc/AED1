
// Faça um programa que solicite ao usuário o valor de S (área de um setor circular) 
// e α (ângulo) e calcule e imprima o valor de R (raio). Utilizar o valor PI = 3.1416.

import java.util.Scanner;

public class C05EX08 {
    public static void main(String[] args){
        double s, a, r;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a Área do setor circular: ");
        s = teclado.nextDouble();

        System.out.println("Digite o valor do ângulo: ");
        a = teclado.nextDouble();

        r = (a * 3.1416 * Math.pow(s, 2)) / 360;
        System.out.println("Raio = " + r);

        teclado.close();
    }
    
}
