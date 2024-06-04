package EX10_Lista01;

public class C09EX10B {
    public static void main(String[] args) {
        double num = 0, den = 0, serie = 0;

        for(int i = 1; i <= 100; i++){
            num = (i * 2);
            den = (i * 3);

            serie += num/den;
        }

        serie = 1 + Math.sqrt(serie);
        System.out.println(serie);
    }
}
