package conteudo08;

import java.util.Scanner;

// O custo total de um projeto é determinado somando-se os custos 
// parciais (quantidade x preço unitário) de cada insumo consumido. 
// Faça um programa para ler o nome, o preço unitário e a quantidade 
// consumida de cada insumo (via console ou de um arquivo txt) e
//  calcule e imprima ao final:

//  O custo total do projeto.
//  A média dos custos parciais.
//  O nome do insumo de maior custo parcial.

// Observação: O número de insumos utilizados no projeto deverá ser 
// solicitado ao usuário no início do programa.

public class C08EX10 {
    public static void main(String[] args) {

        String nome, nomeMaior = "";
        double valorUnit = 0, custoParcial = 0, maiorCustoParc = 0, custoTotal = 0;
        int quantCons = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade de insumos que serão utilizados ->");
        int quantInsumo = input.nextInt();

        for (int i = 0; i < quantInsumo; i++) {
            input.nextLine();

            System.out.println("Nome do Insumo ->");
            nome = input.nextLine();

            System.out.println("Valor unitário ->");
            valorUnit = input.nextDouble();

            System.out.println("Quantidade consumida ->");
            quantCons = input.nextInt();

            // custo parcial
            custoParcial = quantCons * valorUnit;
            System.out.println("Custo parcial " + custoParcial);

            // custo total
            custoTotal += custoParcial;

            // nome do insumo de maior custo parcial
            if (i == 1 || custoParcial > maiorCustoParc) {
                maiorCustoParc = custoParcial;
                nomeMaior = nome;
            }
        }

        // media custo parcial
        double mediaCustoParcial = custoTotal / quantInsumo;

        System.out.println("-----------------//-----------------");
        System.out.println("Custo Total -> " + custoTotal);
        System.out.println("Media Custo Parcial " + mediaCustoParcial);
        System.out.println("Nome do ensumo de maior custo parcial -> " + nomeMaior);
        System.out.println("-----------------//-----------------");

        input.close();
    }
}
