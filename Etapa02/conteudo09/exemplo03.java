import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args) {
        double num, den, serie = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos termos tera a serie -> ");
        int termos = input.nextInt();

        for (int i = 1; i <= termos; i++) {
            num = Math.pow(7, i) + Math.sqrt(i * 2 + 3);
            den = Math.pow(termos + 9, i);
            serie += num / den;
        }

        serie = 100 + 2/3 * (Math.pow(serie, 5));
        System.out.println(serie);
        input.close();
    }
}
