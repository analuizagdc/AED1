package D23683.conteudo06;

import java.util.Scanner;

//Faça um programa que leia a hora inicial, minuto inicial,
//  hora final e minuto final de um jogo (cada valor em uma variável 
//  do tipo inteiro diferente). A seguir, calcule e imprima a 
//  duração do jogo, mostrando o resultado no seguinte formato:
// “O jogo durou xxx horas e yyy minutos”.
// Observação: O jogo terminou no mesmo dia em que ele começou.

public class C06EX13 {
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Hora Inicial -> ");
        int horaInicial = teclado.nextInt();

        System.out.println("Minuto Inicial -> ");
        int minutoInicial = teclado.nextInt();

        System.out.print("Hora Final -> ");
        int horaFinal = teclado.nextInt();

        System.out.print("Minuto Final -> ");
        int minutoFinal = teclado.nextInt();

        int duracaoHoras;
        int duracaoMinutos;

        if (horaFinal < horaInicial){
            duracaoHoras = 24 - horaInicial + horaFinal;
        } else{
            duracaoHoras = horaFinal - horaInicial;
        }

        if (minutoFinal < minutoInicial){
            duracaoHoras --; //diminui a duracaoHoras por 1
            duracaoMinutos = 60 - minutoInicial + minutoFinal;
        } else {
            duracaoMinutos = minutoFinal + minutoInicial;
        }


        System.out.println("Hora Inicio -> " + horaFinal + " || " + "Hora Fim -> " + horaInicial + " || " + " Duração -> " + duracaoHoras + "hrs " + duracaoMinutos + "min" );

        teclado.close();
        
    }
}
