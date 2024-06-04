package conteudo08;

import java.util.Scanner;

public class C08EX24 {
    public static void main(String[] args) {
        double conta = 0;
        Scanner input = new Scanner(System.in);

        for (int pot = 1; pot <= 99; pot += 2) {
            conta =+ Math.pow(2, pot);
        }
        
        double serie = (1/3) + conta;
        System.out.println(serie);
        input.close();
    }
}
