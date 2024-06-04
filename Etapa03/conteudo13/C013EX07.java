
import java.util.Scanner;

public class C013EX07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome completo -> ");
        String nome = input.nextLine();
        
        //separa o nome em partes 
        String[] nomeSeparado = nome.split(" ");

        //acessa o ultimo elemento da array 
        String ultimoNome = nomeSeparado[nomeSeparado.length - 1];
        
        System.out.println("Seu ultimo nome é -> " + ultimoNome);


        input.close();
    }

}
