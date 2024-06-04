package conteudo08;

import java.util.Scanner;

// Fazer um programa para ler o nome e a idade de todos os 50 alunos de uma turma e calcular e imprimir:
//  Quantos alunos tem até 12 anos;
//  Quantos alunos tem acima de 30 anos;
//  A média das idades informadas.

public class C08EX07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countA = 0, idade, countDoze = 0, countTrinta = 0, countResto = 0, somaIdades = 0, idades = 0; // contador
                                                                                                           // Aluno,
                                                                                                           // contador
                                                                                                           // maior de
                                                                                                           // 12 anos e
                                                                                                           // contador
                                                                                                           // maior de
                                                                                                           // trinta

        for (countA = 0; countA < 50; countA++) {
            System.out.println("Nome do aluno -> ");
            String nome = input.nextLine();

            System.out.println("Idade -> ");
            idade = input.nextInt();

            // testar alunos ate 12
            if (idade <= 12) {
                countDoze++;
            } else if (idade > 30) {
                countTrinta++;
            }

            // Soma das idades
            somaIdades += idade;
        }

        // conta da media de idades

        double mediaIdade = somaIdades / (double) countA;

        System.out.println("São " + countDoze + " alunos até 12 anos");
        System.out.println("São " + countTrinta + " alunos acima de 30 anos");
        System.out.println("Media -> " + mediaIdade);

        input.close();
    }
}
