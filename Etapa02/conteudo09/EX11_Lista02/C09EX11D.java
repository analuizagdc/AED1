package EX11_Lista02;

public class C09EX11D {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 10; i++){
            num = Math.pow(i, 3);
            den = Math.pow(10, i - 1);

            serie += num/den;
        }

        System.out.println(serie);
    }
}
