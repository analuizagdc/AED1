package conteudo08;
import java.util.Scanner;

// Faça um programa para ler a nota final e o total de faltas de 
// todos os 50 alunos de uma disciplina. A cada aluno lido o programa 
// deverá verificar e informar se o aluno foi APROVADO ou REPROVADO.
// Se o aluno tiver obtido nota igual ou superior a 65 e não tiver 
// faltado a mais de 16 aulas ele foi aprovado, senão ele foi reprovado.

public class C08EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

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
            } else {
                System.out.println("Nota-> " + notaFinal + " || " + "Falta-> " + totalFaltas + " -> " + "Aluno Reprovado!!");
            }
        }

        teclado.close();
    }
}
