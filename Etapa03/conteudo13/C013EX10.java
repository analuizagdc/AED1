
import java.util.Scanner;

public class C013EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome -> ");
        String nome = input.nextLine().toUpperCase();

        String[] letras = nome.split("");
        for(int i = 0; i < letras.length; i++)
            System.out.println(letras[i]);
        
            input.close();
    }
}
