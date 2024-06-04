import java.util.Scanner;

public class C09EX05 {
    public static void main(String[] args) {
        double num = 0, den = 1, serie = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos termos terá a série -> ");
        int termos = input.nextInt();
        System.out.println("-------------##-------------");

        for (int i = 0; i <= termos; i++) {
            num += (i * 2) + ((i + 1) * 3);
            den += 6;

            serie += num / den;
        }

        serie = 5 * (serie);
        System.out.println(serie);
        
        input.close();
    }
}
