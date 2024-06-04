package D23683.conteudo06;

import java.util.Scanner;

public class C06EX06 {
    public static void main(String[] args){
        double a, b, c, delta, raiz1, raiz2; 
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = teclado.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = teclado.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = teclado.nextDouble();

        delta =  (Math.pow(b, 2) - (4 * a * c));

        if (delta > 0){
            raiz1 = (-b + (Math.sqrt(delta))) / (2 * a);
            raiz2 = (-b - (Math.sqrt(delta))) / (2 * a); 
            System.out.println("Teremos duas raízes: " + " Primeira raiz: " + raiz1 + " ||" + " Segunda raiz" + raiz2);
        } else {
            if (delta == 0 ){
                raiz1 = (-b + (Math.sqrt(delta))) / (2 * a);
                System.out.println("Teremos uma raíz = " + raiz1);
            } else {
                System.out.println("Não tem raizes!");
            }
        }

        teclado.close();
       }
}
