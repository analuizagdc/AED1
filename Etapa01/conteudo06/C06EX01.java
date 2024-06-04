package D23683.conteudo06;

import java.util.Scanner;

public class C06EX01 {
    public static void main(String[] args){
        double x, primOp, segOp, terOp;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o valor de X: ");
        x = teclado.nextDouble();

        primOp = ((5 * x) + 3) / (Math.sqrt(16 - (Math.pow(x, 2))));
        segOp = 0;
        terOp = ((5 * x) + 3) / (Math.sqrt(Math.pow(x, 2) - 16));

        if (x < 4){
            System.out.println("O resultado da função é: " + primOp);
        }
        else if (x == 4){
            System.out.println("O resultado da função é: " + segOp);    
        }
        else {
            System.out.println("O resultado da função é: " + terOp);
        }
        teclado.close();
    }
}
