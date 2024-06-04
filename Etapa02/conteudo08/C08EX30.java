package conteudo08;

import java.util.Scanner;

public class C08EX30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double conta = 0, serie = 0;

        System.out.print("X -> ");
        double x = input.nextDouble();

        System.out.print("N -> ");
        double n = input.nextDouble();

        for (int i = 2; i <= n; i++) {
            double valorX = Math.pow(x, i);
            conta += valorX / i;
            serie = x + conta;
        }
        System.out.println("O valor da conta é: " + serie);

        input.close();
    }
}
