package conteudo11;

import java.util.Scanner;

public class C011EX06 {
    public static void main(String[] args) {
        int canal, audiencia, somaAudienciaTotal = 0, countDoze = 0, countSete = 0, countTres = 0;
        boolean ligada;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {

            System.out.println("TV ligada? (true)-Sim (false)-Não ");
            ligada = input.nextBoolean();

            if (ligada = false) {
                continue;
            }

            System.out.println("Numero do canal -> ");
            canal = input.nextInt();

             if (canal == 3){
                countTres++;
             } 
             if (canal == 7){
                countSete++;
             }
             if (canal == 12){
                countDoze++;
             }

            System.out.println("Quantidade de pessoas assistindo -> ");
            audiencia = input.nextInt();

            somaAudienciaTotal += audiencia;
        }

        System.out.println(somaAudienciaTotal);
        input.close();
    }
}
