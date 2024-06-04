package D23683.conteudo06;

import java.util.Scanner;

public class C06EX05 {
    public static void main(String[] args){
        double numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        numero = teclado.nextDouble();

        if (numero % 5 == 0 && numero % 7 == 0) {
            System.out.println("O numero é divisivel! ");
        } else {
            System.out.println("O numero é impar");
        }
        teclado.close();


    }
}
