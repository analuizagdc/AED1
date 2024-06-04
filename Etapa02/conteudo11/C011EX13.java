package conteudo11;

import java.util.Scanner;

public class C011EX13 {
    public static void main(String[] args) {
        int countReps = 0, reps = 20;
        double num, den, serie = 0;

        Scanner input = new Scanner(System.in);

        // System.out.println("Digite quantos termos terá a série -> ");
        // reps = input.nextInt();

        do {
            countReps++;

            num = countReps * Math.pow((countReps * 9) + 1, 2 * countReps);
            den = Math.pow(7, (countReps - 1));

            serie += num / den;
        } while (countReps != reps);

        serie = 71 + Math.pow(serie, 1.0 / 3.0);
        System.out.println(serie);
        input.close();
    }
}
