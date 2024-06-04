import java.util.Scanner;

public class C012EX25 {
    public static void main(String[] args) {

        // Faça um programa que leia uma frase curta e a imprima de novo com cada
        // palavra da frase em uma linha.

        String frase = "";
        String palavras[] = frase.split(" ");

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < frase.length(); i++){
            System.out.println("Digite uma frase -> ");
            frase = input.nextLine();

            System.out.println(palavras[i]);
        }

        input.close();
    }
}