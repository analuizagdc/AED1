package EX10_Lista01;

public class C09EX10C {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for ( int i = 1; i <= 100; i++){
            num = ((i * 2) - 1);
            den = (i * 2);

            serie += num/den; 
            System.out.println(num);
        }

        serie = (1/3.0) * Math.pow(serie, 2);
        System.out.println(serie);
    }
}
