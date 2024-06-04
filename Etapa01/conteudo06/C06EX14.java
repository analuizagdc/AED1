package D23683.conteudo06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class C06EX14 {
    public static void main(String[] args){
        int num1, num2, num3, num4;
        Scanner teclado = new Scanner(System.in);

        while (true){
            System.out.println("Numero com 4 digitos ->");
            String numero = teclado.nextLine();
            
            if (numero.length() == 4){
                int numeroInt = Integer.parseInt(numero);
                System.out.println("Numero digitado -> " + numeroInt);

                num1 = numeroInt / 1000;
                num2 = numeroInt / 100 % 10;
                num3 = numeroInt / 10 % 10;
                num4 = numeroInt / 1 % 10; 

                System.out.println("Impressão contrária -> " + num4 + num3 + num2 + num1);

                break;
            } else{
                System.out.println("Numero Inválido!!");
            }
        }
        teclado.close();
    }    
}
