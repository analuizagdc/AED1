package conteudo08;

import java.util.Scanner;

// Fazer um programa para ler o nome e a idade de todos os
//  50 alunos de uma turma e calcular e imprimir:
// Quantos alunos tem até 18 anos
// Quantos alunos tem acima de 18 anos

public class C08EX04 {
    public static void main(String[] args) {
        
        int contA = 0;
        int contM = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {

            System.out.print("Nome -> ");
            String nome = teclado.nextLine();

            System.out.print("Idade -> ");
            int idade = teclado.nextInt();

            if (idade <= 18)
                contA++;

            if (idade > 18)
                contM++;
            teclado.nextLine();
        }

        System.out.printf("Até de 18 -> %d || Acima de 18 -> %d", contA, contM);
        teclado.close();
    }
}
