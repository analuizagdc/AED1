package D23683.conteudo04;

import java.util.Scanner;

/*
Faça um programa que solicite ao usuário o seu primeiro  nome, seu nome do meio,
seu sobrenome, sua idade e depois imprima todos estes dados de acordo com o layout abaixo:
Sobrenome, PrimeiroNome SegundoNome
Idade: 99 anos.

Exemplo de saída de dados (console):
Freitas, Ricardo Luiz
Idade: 50 anos.
*/

public class C04EX01 {
    public static void main(String[] args){

        String nome, nomemeio, sobrenome;
        int idade;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe seu nome do meio: ");
        nomemeio = teclado.nextLine();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = teclado.nextLine();
        System.out.println("Informe sua idade: ");
        idade = teclado.nextInt();

    //    System.out.println(sobrenome + ", " + nome + " " + nomemeio + "\n" + "Idade: " + idade + " anos");
        System.out.println(sobrenome + ", " + nome + " " + nomemeio);
        System.out.println("Idade: " + idade + " anos");
        teclado.close();
    }

}
