
// Nos cheques bancários, o número do cheque de um determinado banco
// é composto pelo código do banco (3 dígitos), mais o código da 
// agência (3 dígitos), mais um sequencial numérico (3 dígitos).
// Faça um programa que leia um número de cheque deste banco e 
// extraia e imprima dele o código do banco, o código da agência 
// e o sequencial do cheque.

import java.util.Scanner;

public class C05EX11 {
    public static void main(String[] args){
        int numCheque, banco, agencia, sequencial;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero do cheque:");
        numCheque = teclado.nextInt();

        banco = numCheque / 1000000;
        agencia = (numCheque / 1000) % 1000;
        sequencial = (numCheque / 100) % 100;
        
        String formatprint = String.format("Banco = %d, Agência = %d, Sequencial = %d",banco,agencia,sequencial);
        System.out.println(formatprint);
        
        teclado.close();

    }
}   //243154233

