
// Fazer um programa que calcule a conversão de temperaturas. 
// O usuário informará o valor de uma temperatura em Celsius e 
// o programa irá calcular e imprimir esta mesma temperatura em Kelvin e Fahrenheit.          

import java.util.Scanner;

public class C05EX05 {
    public static void main(String[] args) {
        double celsius, kelvin, fahrenheit;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = teclado.nextDouble();

        kelvin = celsius + 273;
        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura em Kelvin: " + kelvin);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        teclado.close();

    }
    
}