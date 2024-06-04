import java.util.Scanner;

public class C012EX10 {
    public static void main(String[] args) {

        int quantidade = 50;
        String nome[] = new String[quantidade];
        int nota[] = new int[quantidade];
        double somaNotas = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < nome.length; i++){
            System.out.print("Nome -> ");
            nome[i] = input.nextLine();

            System.out.print("Nota -> ");
            nota[i] = input.nextInt();
            System.out.println("------##------");

            input.nextLine();
        }

        for(int i = 0; i < nota.length; i++){
            somaNotas += nota[i];
        }

        double media = somaNotas / (quantidade);
        System.out.println(media);

        for(int i = 0; i < nota.length; i++){
            if(nota[i] > media){
                System.out.println(nome[i] + " com a nota " + nota[i] + " ficou acima da media!");
            }
        }

        input.close();

    }
}
