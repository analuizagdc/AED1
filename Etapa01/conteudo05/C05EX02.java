import java.util.Scanner;

//A área da superfície esférica e o volume de uma esfera
//são calculados a partir das fórmulas abaixo. Faça
//um programa que leia o raio R de uma esfera e 
//calcule e imprima a sua área e volume. Utilizar 
//o valor PI = 3.1416

public class C05EX02 {
    public static void main(String[] args){
        double raio, area, volume;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        raio = teclado.nextDouble();
        
        area = ((4 * 3.1416) * Math.pow(raio,3));
        System.out.println("O valor da área é: " + area);
        
        volume = ((4.0/ 3) * 3.1416 * Math.pow(raio,3));
        System.out.println("O valor do volume é: " + volume);
        
        teclado.close();

    }
}