package conteudo11;

import java.util.Scanner;

public class C011EX07 {
    public static void main(String[] args) {

        double temperatura, menorTemperatura = 0, maiorTemperatura = 0, somaTemp = 0, mediaTempRegistrada;
        int countTempRegistrada = 0, countMaiorTemp = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 121; i++) {
            System.out.println("---- Dia " + i + " ----");

            System.out.println("Temperatura -> ");
            temperatura = input.nextDouble();

            somaTemp += temperatura;
            countTempRegistrada++;

            //maior temperatura registrada
            if (i == 1 || temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
                countMaiorTemp++;
            }            
            // menor temperatura registrada
            if (i == 1 || temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            } 

        }

        System.out.println("-----##------");
        System.out.println("Menor temperatura -> " + menorTemperatura);
        System.out.println("Maior temperatura -> " + maiorTemperatura);

        //media das temp registradas
        mediaTempRegistrada = somaTemp/countTempRegistrada;
        System.out.println("Media das temperaturas registradas -> " + mediaTempRegistrada);

        //quant dias com maior temp 
        System.out.println("Quantidade de dias com a maior temperatura -> " + countMaiorTemp);
        input.close();
    }

}
