import java.util.Scanner;

public class C013EX08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;

        //corrigir 

        System.out.println("Digite seu nome -> ");
        nome = input.nextLine();

        String[] separarNome = nome.split(" ");

        //ultimo nome
        String ultimoNome = separarNome[separarNome.length - 1];
        System.out.println(ultimoNome);

        //primeira inicial
        String primInicial = separarNome[separarNome.length - 3];
        char primLetra = primInicial.charAt(0);
        System.out.println(primLetra);

        //segunda inicial
        String segInicial = separarNome[separarNome.length - 2];
        char primLetraSeg = segInicial.charAt(0);
        System.out.println(primLetraSeg);
        
        input.close();
    }
}
