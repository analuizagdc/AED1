package D23683.conteudo06;

import java.util.Scanner;

public class C06EX07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double salario, plLiquido, plBruto, impostoRenda;

        System.out.println("Digite o salário: ");
        salario = teclado.nextDouble();

        if (salario < 300) {
            plBruto = 500 + (salario * 0.70);
        } else if (salario >= 300 && salario <= 1000) {
            plBruto = 200 + (salario * 0.50);
        } else {
            plBruto = salario * 0.30;
        }
    
        impostoRenda = 0.25 * plBruto;
        plLiquido = plBruto - impostoRenda;
        System.out.println("Salário: " + salario + " -> " + "PL Líquido: " + plLiquido);

        teclado.close();
    }
}
