package EX11_Lista02;

public class C09EX11A {
    public static void main(String[] args) {
        double num = 0, den, serie = 0;

        for (int i = 1; i <= 100; i++) {
            num = i + ((7 * (i - 1)) + 1) ;
            den = Math.pow(4, i - 1);

            serie += num / den;
            System.out.println(serie);
        }

        serie = Math.pow(serie, 1/3.0);
        System.out.println(serie);
    }
}
