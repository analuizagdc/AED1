
public class C09EX07 {
    public static void main(String[] args) {
        double num1 = 0, den = 1, serie = 0;
        for (int i = 0; i <= 5; i++) {
            num1 = (i * 2) + (( i + 1) * 3);
            den += 6;

            System.out.println(num1);
            serie += num1 / den;
        }

        System.out.println(serie);

    }
}