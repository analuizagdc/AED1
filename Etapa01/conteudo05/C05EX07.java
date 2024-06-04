
// Faça um programa que solicite ao usuário o valor de x e calcule e imprima o valor da função f(x).

import java.util.Scanner;

public class C05EX07 {
    public static void main(String[] args){
        double x, funcao;

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o valor de X: ");
        x = teclado.nextDouble();

        funcao = Math.sqrt(Math.pow(x/4 + 1 ,2)  + (x/5));
        System.out.println("O valo da função f(x) é: " + funcao);
        teclado.close();
    }
}
