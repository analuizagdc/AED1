package EX11_Lista02;

public class C09EX11B {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for(int i = 1; i <= 100; i++){
            num = (3 * (i - 1)) + 1;
            den = Math.sqrt((3 * (i + 1)) + 1);
            
            serie += num/den;
        }

        serie = 5/3.0 * (serie);
        System.out.println(serie);
    }
}
