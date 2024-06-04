import java.util.Scanner;

public class C012EX12 {
    public static void main(String[] args) {

        int quantidade = 3;
        String nome[] = new String[quantidade];
        int nota[] = new int[quantidade];
        int notaMaior = 0;
        Scanner input = new Scanner(System.in);

        // Entrada de dados: nome e nota de cada aluno
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Nome do aluno -> ");
            nome[i] = input.nextLine();

            System.out.print("Nota do aluno -> ");
            nota[i] = input.nextInt();

            input.nextLine();

            // Verifica se a nota é maior que a nota máxima encontrada até agora
            if (nota[i] > notaMaior) {
                notaMaior = nota[i];
            }
        }

        // imprime todos os alunos que obtiveram a maior nota
        System.out.println("Alunos com a maior nota -> ");
        for (int i = 0; i < nome.length; i++) {
            if (nota[i] == notaMaior) {
                System.out.println("Nome -> " + nome[i] + " - Nota -> " + nota[i]);
            }
        }

        input.close();
    }
}
