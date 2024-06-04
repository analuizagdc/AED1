package conteudo08;
import java.util.Scanner;

// Faça um programa para ler a nota final e o total de faltas 
// de todos os 50 alunos de uma disciplina. A cada aluno lido 
// o programa deverá verificar e informar se o aluno foi APROVADO ou REPROVADO.
// Se o aluno tiver obtido nota igual ou superior a 65 e não tiver
// faltado a mais de 16 aulas ele foi aprovado, senão ele foi reprovado. 
// Ao final do programa deverão ser informados quantos alunos foram
// aprovados e quantos foram reprovados.

public class C08EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contA = 0;
        int contB = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.println("Nota Final -> ");
            int notaFinal = teclado.nextInt();
            
            if (notaFinal == -1){
                System.out.println("Nota Inválida!");
                break;
            }

            System.out.println("Total de Faltas -> ");
            int totalFaltas = teclado.nextInt();

            if (notaFinal >= 65 && totalFaltas < 16) {
                System.out.println("Nota-> " + notaFinal + " || " + "Falta-> " + totalFaltas + " -> " + "Aluno Aprovado!!");
                contA++;
            } else {
                System.out.println("Nota-> " + notaFinal + " || " + "Falta-> " + totalFaltas + " -> " + "Aluno Reprovado!!");
                contB++;
            }
        }
        System.out.print("Alunos aprovados: " + contA + " || " + "Alunos reprovados: " + contB);

        teclado.close();
    }
}

