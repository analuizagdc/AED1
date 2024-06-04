package D23683.conteudo07;

import java.util.Scanner;

public class C07EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome do apostador -> ");
        String apostador = teclado.nextLine();

        int acertos;

        do {
            System.out.println("Quantos jogos acertados -> ");
            acertos = teclado.nextInt();
            if (acertos < 1 || acertos > 13){
                System.out.println("Digite um valor de prêmio válido!!!!");
            }
        } while (acertos < 1 || acertos > 13);

        switch (acertos) {
            case 0: case 1: case 2: case 3: case 4: case 5: 
                System.out.println("Nenhum prêmio!!");
                break;
            case 11:
                System.out.println("Prêmio de R$100,00!!");
                break;
            case 12:
                System.out.println("Prêmio de R$1.000,00!!");
                break;
            case 13:
                System.out.println("Prêmio de R$50.000,00!!");
                break;

            default:
                if(acertos >= 6 && acertos <= 10){
                    System.out.println("Ganhou outro cartão!!");
                }          
        }
        teclado.close();
    }
}
