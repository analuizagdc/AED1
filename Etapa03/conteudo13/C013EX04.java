// Faça um programa para o usuário descobrir um número aleatório gerado pelo
// computador entre 0 e 100. Ao longo das tentativas o programa deverá informar
// se o número informado pelo usuário está acima ou abaixo do número gerado 
// pelo computador. No final o programa informará quantas tentativas foram
// necessárias até se chegar ao número gerado.

 //import java.util.ArrayList;
import java.util.Scanner;

public class C013EX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countChutes = 0, chute;
      //  ArrayList<Integer> numerosChutados = new ArrayList<>();

        int numAleatorio = (int) (Math.random() * 10);

        System.out.println(" ----- Escolha um numero que foi escolhido pelo computador (entre 0 e 100) ----- ");

        do {
            System.out.println("Chute -> ");
            chute = input.nextInt();

            System.out.println("----##----");

            distancia(chute, numAleatorio);

            if (chute != numAleatorio) {
                countChutes++;
            }

        } while (numAleatorio != chute);

        System.out.println(" Foram feitos " + countChutes + " chutes até o acerto !!");
        input.close();
    }

    static void distancia(int chute, int numAleatorio) {
        if (chute > numAleatorio) {
            System.out.println("Menor !!");
            
        } else if (chute < numAleatorio) {
            System.out.println("Maior !!");
        } 


    }
}
