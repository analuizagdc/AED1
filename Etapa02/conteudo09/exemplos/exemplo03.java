package exemplos;
import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args) {
        double num;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quant de reps -> ");
        int rep = input.nextInt();

        for (int i = 1; i < rep; i++) {
            num = Math.pow(i, 7);
            System.out.println(num);
        }

        input.close();
    }
}
