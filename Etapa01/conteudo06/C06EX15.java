package D23683.conteudo06;

import java.util.Scanner;

public class C06EX15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o código do pacote (1-Basic, 2-Advanced, 3-Premium): ");
        int codigoPacote = teclado.nextInt();

        System.out.println("Digite a quantidade de dias de consumo de canais pay-per-view: ");
        int diasPPV = teclado.nextInt();

        System.out.println("Digite o valor dos serviços extras: ");
        double valorExtras = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Digite a cidade (BH, SP, RJ ou Outra): ");
        String cidade = teclado.nextLine();

        double valorFixo = 0;
        double valorPPV = 0;
        double imposto = 0;

        switch (codigoPacote) {
            case 1:
                valorFixo = 65.00;
                valorPPV = 1.20 * diasPPV;
                if (valorPPV >= 65){
                    valorPPV = 65;
                }
                break;
            case 2:
                valorFixo = 104;
                valorPPV = 2.10 * diasPPV;
                break;
            case 3:
                valorFixo = 137;
                valorPPV = 0.0;
                break;
            default:
                System.out.println("Código de pacote inválido!");
                return; 
        }

        double valorConta = valorFixo + valorPPV + valorExtras;

        switch (cidade.toUpperCase()) {
            case "BH":
                imposto = valorConta * 0.0;
                break;
            case "SP":
                imposto = valorConta * 0.01;
            case "RJ":
                imposto = valorConta * 0.015;
                break;
            default:
                imposto = valorConta * 0.02;
                break;
        }

        double totalConta = valorConta + imposto;

        System.out.println("O valor total da conta é: R$" + totalConta);

    teclado.close(); 
    }
}
