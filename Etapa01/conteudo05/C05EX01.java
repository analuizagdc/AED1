
import java.util.Scanner;

//Fazer um programa que calcule e imprima o valor da 
//função abaixo, sendo o valor de x informado pelo 
//usuário.

public class C05EX01 {
    public static void main(String[] args){
        double x, conta;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        x = teclado.nextDouble();

        System.out.println("O valor da função é: ");

        conta = (Math.pow(x,3) + (4*x) + 10);
        System.out.println(conta);

        teclado.close();

    }
}