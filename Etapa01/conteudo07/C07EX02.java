package D23683.conteudo07;
import java.util.Scanner;

public class C07EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota01, nota02, nota03;

        do {
            System.out.println("Nota 01 (Entre 0 a 10) -> ");
            nota01 = teclado.nextInt();

            System.out.println("Nota 02 (Entre 0 a 10) -> ");
            nota02 = teclado.nextInt();

            System.out.println("Nota 03 (Entre 0 a 10) -> ");
            nota03 = teclado.nextInt();

            if (nota01 < 0 || nota01 > 10 || nota02 < 0 || nota02 > 10 || nota03 < 0 || nota03 > 10) {
                System.out.println("Digite notas válidas (entre 0 e 10) !!!!");
            }
        } while (nota01 < 0 || nota01 > 10 || nota02 < 0 || nota02 > 10 || nota03 < 0 || nota03 > 10);

        double media = (nota01 + nota02 + nota03) / 3.0;
        int mediaInteiro = (int) media; 

        switch (mediaInteiro) {
            case 9: case 10:
                System.out.println("Conceito -> A");
                break;

            case 8:
                System.out.println("Conceito -> B");
                break;

            case 7: 
                System.out.println("Conceito -> C");
                break;

            case 5: case 6:
                System.out.println("Conceito -> D");
                break;

            case 1: case 2: case 3: case 4: 
                System.out.println("Conceito -> E ");            
        }
        
        teclado.close();
    }
}
