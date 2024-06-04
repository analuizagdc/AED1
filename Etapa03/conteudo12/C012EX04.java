import java.util.Scanner;

public class C012EX04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] chegadaCorredores = new int[10];

        // Registro da chegada dos corredores na primeira bateria
        System.out.println("Registre a chegada dos corredores na primeira bateria:");
        for (int i = 0; i < chegadaCorredores.length; i++) {
            System.out.print((i + 1)+ "° -> ");
            chegadaCorredores[i] = input.nextInt();
        }

        // Imprimindo a ordem de largada das duplas
        System.out.println("Ordem de largada das duplas:");
        for (int i = 0; i < chegadaCorredores.length / 2; i++) {
            System.out.println("Dupla " + (i + 1) + ": " + chegadaCorredores[i] + " / " + chegadaCorredores[i + 5]);
        }

        input.close();
    }
}