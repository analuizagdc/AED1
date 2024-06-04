import java.util.Scanner;

public class C012EX07 {
    public static void main(String[] args) {
        
        String nome[] = new String[4];
        int notaFinal[] = new int[4];
        String conceito;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < nome.length; i++){
            System.out.println("Nome do aluno -> ");
            nome[i] = input.nextLine();

            System.out.println("Nota final -> ");
            notaFinal[i] = input.nextInt();
            input.nextLine();
            System.out.println("-------##-------");

        }

        for(int i = 0; i < nome.length; i++){

            if (notaFinal[i] < 30){
                conceito = "D";
            } else if (notaFinal [i] > 31 && notaFinal[i] < 60){
                conceito = "C";
            } else if (notaFinal[i] > 61 && notaFinal[i] < 80){
                conceito = "B";
            } else {
                conceito = "A";
            }

            System.out.print("Aluno-> " + nome[i] + " || Conceito-> " + conceito + "\n");
        }

        input.close();       

    }
}
