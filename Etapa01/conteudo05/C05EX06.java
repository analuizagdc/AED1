
// A distância entre um ponto P e uma reta R é dado pela função abaixo.
//  Faça um programa que solicite ao usuário os valores de A, B e C da reta 
//  R e as coordenadas x e y do ponto P e calcule e imprima o valor da distância.

import java.util.Scanner;

public class C05EX06 {
    public static void main(String[] args){

        double a, b, c, x, y, dist;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        a = teclado.nextDouble();
        System.out.println("Insira o valor de B: ");
        b = teclado.nextDouble();
        System.out.println("Insira o valor de C: ");
        c = teclado.nextDouble();
        System.out.println("Insira o valor de X: ");
        x = teclado.nextDouble();
        System.out.println("Insira o valor de Y: ");
        y = teclado.nextDouble();

        dist = (a*x + b*y + c) / Math.sqrt(( Math.pow(a,2) + Math.pow(b,2)));
        System.out.println("Distância: " + dist);

        teclado.close();
    }
}
