package conteudo08;
import java.util.Scanner;
public class C08EX08 {
    public static void main(String[] args){
        int countAp = 0, countMFalta = 0, somaAp = 0;
        Scanner input = new Scanner(System.in);

        
        for (int countInfo = 0; countInfo < 3; countInfo++) {
            
            System.out.println("Sua nota final foi ->");
            int notaFinal = input.nextInt();

            System.out.println("Seu total de faltas ->");
            int totalFaltas = input.nextInt();

            // Verificação de aprovados e reprovados 

            if (notaFinal >= 65 && totalFaltas < 16) {
                System.out.println("Aprovado!!");
                countAp++;
                somaAp += notaFinal;
            } else {
                System.out.println("Reprovado!!");
            }

            //verificação faltas acima de 16 

            if (totalFaltas > 16){
                countMFalta++;
            } 
        }

        int mediaAprov = somaAp / countAp;

        System.out.println("Media alunos aprovados: " + mediaAprov);
        System.out.println("Alunos com mais de 16 faltas: " + countMFalta);

        input.close();
      
    }
}
