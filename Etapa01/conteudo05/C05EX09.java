
// Faça um programa que leia as 3 notas de um aluno e calcule e imprima
// a média final deste aluno. Considerar que a média é ponderada e que 
// o peso das notas é: 2, 3 e 5, respectivamente.

import java.util.Scanner;

public class C05EX09 {
    public static void main(String[] args){
        double nota1, nota2, nota3, media;
        double peso1 = 2, peso2 = 3, peso3 = 5;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = teclado.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = teclado.nextDouble();

        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3);
        media = media / (peso1 + peso2 + peso3);
        System.out.println("Media = " + media);
        teclado.close();
    }
}
