package D23683.conteudo07;

import java.util.Scanner;

public class C07EX03 {
    public static void main(String[] args){
        double multa;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Imposto ->");
        Double imposto = teclado.nextDouble();

        System.out.println("Dias de Atraso ->");
        int diasAtraso = teclado.nextInt();

        switch (diasAtraso) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Multa isenta"); 
                break;
            
            case 6: case 7: case 8:
                multa = (diasAtraso / 0.2) * 100;
                System.out.println("Multa de 2% = R$" + multa);
                break;

            case 9: case 10:
                multa = (imposto * 0.10) + ( 0.05 * diasAtraso );
                System.out.println("10% + 0,5% por dia de atraso = R$" + multa);
                break;
            
            default:
                if(diasAtraso > 10){
                    multa = (imposto * 1.5) + (1 * diasAtraso);
                    System.out.println("150% + R$1,00 por dia de atraso = R$" + multa );
                }
                break;
        }
        teclado.close();

    }
}
