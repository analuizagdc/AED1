package D23683.conteudo06;

import java.util.Scanner;

// Faça um programa que leia o nome e a altura (em metros) de uma pessoa e 
// calcule e imprima os pesos mínimo e máximo para que ela esteja dentro 
// faixa de peso ideal de acordo com a tabela de IMC (Índice de Massa Corporal) abaixo.

public class C06EX08 {
    public static void main(String[] args){

        double  altura, pesoMin, pesoMax;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();
        
        pesoMin = (20 * Math.pow(altura, 2));
        pesoMax = (25 * Math.pow(altura, 2));
        
        System.out.print("Altura: " + altura + " || Peso Mínimo:  " + pesoMin + " || Peso Máximo: " + pesoMax);

        teclado.close();
    }
}
