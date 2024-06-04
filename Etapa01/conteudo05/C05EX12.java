
// Faça um programa que leia o tempo de duração de um evento expresso 
// em segundos e mostre-o expresso em horas, minutos e segundos.

import java.util.Scanner;

public class C05EX12 {
    public static void main(String[] args){

        double hora, minutos, segundos, seg;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os segundos: ");
        segundos = teclado.nextDouble();

        hora = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        seg = (segundos % 3600) % 60;

        System.out.println("Segundos -> " + (int)segundos + ", Horas = " + (int)hora + ", Minutos = " + (int)minutos + ", Segundos = " + (int)seg);
        teclado.close();
    }
}
