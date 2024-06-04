package EX11_Lista02;

public class C09EX11F {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 100; i++) {
            num = (Math.pow(2, i + 1)) * (i * 2 - 1);
            den = Math.pow((i * 5 - 3), 2);
            
            serie += num/den;
        }

        serie = Math.pow(serie, 1/5.0);
        System.out.println(serie);
    }
}
