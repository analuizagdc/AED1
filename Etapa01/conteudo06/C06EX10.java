package D23683.conteudo06;

import java.text.DecimalFormat;
import java.util.Scanner;

// Faça um programa que calcule o valor resgatado, 
// solicitando ao usuário o capital aplicado, o número 
// de dias que ficou aplicado e a taxa diária e calcule
//  e imprime o rendimento, o imposto de renda e o valor a ser resgatado.

public class C06EX10 {
    public static void main(String[] args){

        double valorPego, capitalAp, numDias, taxaDiaria, rendimento, imposto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o capital aplicado: ");
        capitalAp = teclado.nextDouble();

        System.out.println("Digite o numero de dias que ficou aplicado: ");
        numDias = teclado.nextDouble();

        System.out.print("Digite a taxa diaria: ");
        taxaDiaria = teclado.nextDouble();
        taxaDiaria = taxaDiaria / 100;

        int taxaAdm = 10;
        
        rendimento = capitalAp * taxaDiaria * numDias;
        imposto = 0.15 * rendimento;
        valorPego = capitalAp + rendimento - imposto - taxaAdm;

        DecimalFormat formato = new DecimalFormat("#,##0.00");

        System.out.println("Rendimento-> " + rendimento + " || Imposto de Renda -> " + imposto + " || Valor a ser resgatado -> " + (formato.format(valorPego)));

        teclado.close();
    }
}
