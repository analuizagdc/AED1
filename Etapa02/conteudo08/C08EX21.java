package conteudo08;

import java.util.Scanner;

// Faça um programa que solicite ao usuário sua 
// altura em metros (uma única vez), e calcule e 
// imprima uma lista (tabela) com o peso, seu IMC 
// e sua situação corpórea (conforme tabela abaixo)
// com os pesos variando de 60 a 100 kg (não se 
// esqueça do cabeçalho). 

public class C08EX21 {
    public static void main(String[] args) {
        double imc = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma altura em metros -> ");
        double altura = input.nextDouble();

        for (int peso = 60; peso <= 100; peso++) {
            imc = peso / Math.pow(altura, 2);
            System.out.println("PESO -> " + peso);
            System.out.println("IMC -> " + imc);
            if (imc <= 20) {
                System.out.println("Abaixo do Peso");
            } else if (imc >= 20 && imc <= 25) {
                System.out.println("Peso Ideal");
            } else {
                System.out.println("Acima do Peso");
            }

            System.out.println("------------##------------");
        }

        input.close();
    }
}
