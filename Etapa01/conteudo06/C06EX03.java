package D23683.conteudo06;

import java.util.Scanner;

public class C06EX03 {
    public static void main(String[] args){
        double poluente;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de poluente emitido: ");
        poluente = teclado.nextDouble();

        if (poluente <= 1500){
            System.out.println("Poluentes: " + poluente + ". Isento de multa");
            
        }
        else if (poluente > 1500 && poluente <= 3500){
            System.out.println("Poluentes: " + poluente + ". Multa de R$ 3.000,00");            
        }
        else{
            System.out.println("Poluentes: " + poluente + ". Multa de R$" + 5000 * poluente);
        }

        teclado.close();
    }
}

