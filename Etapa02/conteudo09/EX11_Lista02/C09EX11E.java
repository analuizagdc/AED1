package EX11_Lista02;

public class C09EX11E {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for(int i = 1; i <= 100; i++){
            num = Math.pow(i, 2) * Math.sqrt(i * 2 + 3);
            den = Math.pow(i + 1, i);

            serie += num/den;
        }

        serie = 2/3.0 * serie;
        System.out.println(serie);
    }
}
