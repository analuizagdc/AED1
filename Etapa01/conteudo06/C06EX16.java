package D23683.conteudo06;

import java.util.Scanner;

public class C06EX16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int faltas, idade, peso1, peso2;
        float nota1, nota2, nota3, notatrabFinal, media, notaFinal;

        System.out.print("Digite a quantidade de faltas: ");
        faltas = teclado.nextInt();

        System.out.println("Digite a nota do trabalho final: ");
        notatrabFinal = teclado.nextFloat();

        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();

        System.out.println("Digite a nota da prova 1: ");
        nota1 = teclado.nextFloat();

        System.out.println("Digite a nota da prova 2: ");
        nota2 = teclado.nextFloat();

        System.out.println("Digite a nota da prova 3: ");
        nota3 = teclado.nextFloat();

        if (nota1 < nota2 && nota1 < nota3) {
            media = (nota2 + nota3) / 2;
        } else if (nota2 < nota1 && nota2 < nota3) {
            media = (nota1 + nota3) / 2;
        } else {
            media = (nota1 + nota2) / 2;
        }

        if (faltas <= 5)
            peso1 = 3;
        if (faltas > 5 && faltas <= 10)
            peso1 = 2;
        else
            peso1 = 1;

        if (idade <= 17)
            peso2 = 1;
        if (idade > 17 && idade <= 50)
            peso2 = 2;
        else
            peso2 = 3;

        notaFinal = (media * peso1) + (notatrabFinal * peso2);

        if (notaFinal <= 50)
            System.out.println("Reprovado - Resultado: " + notaFinal);
        else if (notaFinal > 50 && notaFinal <= 70)
            System.out.println("Regular - Resultado: " + notaFinal);
        else if (notaFinal > 70 && notaFinal <= 80)
            System.out.println("Bom - Resultado: " + notaFinal);
        else if (notaFinal > 80 && notaFinal <= 90)
            System.out.println("Muito Bom - Resultado: " + notaFinal);
        else
            System.out.println("Excelente - Resultado: " + notaFinal);

        teclado.close();
    }
}
