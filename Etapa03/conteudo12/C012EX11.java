import java.util.Scanner;

public class C012EX11 {
    public static void main(String[] args) {

        int quantidade = 50;
        String nome[] = new String[quantidade], nomeMaior = "";
        int nota[] = new int[quantidade];
        double notaMaior = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Nome -> ");
            nome[i] = input.nextLine();

            System.out.print("Nota -> ");
            nota[i] = input.nextInt();
            System.out.println("------##------");

            input.nextLine();
        }

        //verificacao de qual o nome e a nota do aluno com maior nota
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > notaMaior) {
                notaMaior = nota[i];
                nomeMaior = nome[i];
            }
        }
        
        System.out.println("Nome da pessoa com a maior nota -> " + nomeMaior);


    

        input.close();

    }
}
