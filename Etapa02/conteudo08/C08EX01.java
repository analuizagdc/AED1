package conteudo08;

import java.util.Scanner;

// Faça um programa para calcular e imprimir a área de 10 círculos,
// cujos raios serão informados pelo usuário. Use o valor de igual a 3.1416.

public class C08EX01 {
    public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);

            for (int i =  1; i <= 50; i ++){
                System.out.println("Digite o valor do raio -> ");
                int raio = teclado.nextInt(); 
                double area = (3.1416 * Math.pow(raio, 2));

                System.out.println("Raio - > " + area);
            }

            teclado.close();
    }
}
