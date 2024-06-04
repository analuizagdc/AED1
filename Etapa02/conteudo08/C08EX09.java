package conteudo08;

// Faça um programa que leia o nome, idade e sexo (“M” para masculino 
// e “F” para feminino) de diversas pessoas e ao final imprima a idade
//  média das mulheres e a idade média dos homens. A quantidade de pessoas
//   deve ser informada no início do programa pelo usuário.

import java.util.Scanner;

public class C08EX09 {
    public static void main(String[] args) {
        int countF = 0, countM = 0, idade, rep, idadeM = 0, idadeF = 0;
        String nome, sexo;

        Scanner input = new Scanner(System.in);

        System.out.println("Indique a quantidade de pessoas -> ");
        rep = input.nextInt();

        for (int count = 1; count <= rep; count++) {

            System.out.println("Seu nome-> ");
            nome = input.nextLine();
            input.nextLine();

            System.out.println("Sua idade-> ");
            idade = input.nextInt();
            input.nextLine();

            System.out.println("Seu sexo |F|Feminino |M| Masculino-> ");
            sexo = input.nextLine().toUpperCase();

            // verificacao e contagem de sexo
            if (sexo.equalsIgnoreCase("F") && idade > 0) {
                countF++;
                idadeF += idade;
            } 
            
            if (sexo.equalsIgnoreCase("M") && idade > 0){
                countM++;
                idadeM += idade;
            } 

        }

        double mediaM = idadeM / (double)countM;
        double mediaF = idadeF / (double) countF;

        System.out.println("Media homens-> " + mediaM);
        System.out.println("Media mulheres-> " + mediaF);
        input.close();
    }
}
