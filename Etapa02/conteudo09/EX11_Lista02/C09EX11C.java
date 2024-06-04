package EX11_Lista02;

public class C09EX11C {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for(int i = 1; i <= 100; i++){
            num = (2 * i + 1) * Math.sqrt(4 * i + 1);
            den = Math.pow(5, i);
            
            serie += num/den;
        }

        System.out.println(serie);
    }
}
