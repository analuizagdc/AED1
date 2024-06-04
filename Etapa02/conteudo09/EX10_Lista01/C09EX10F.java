package EX10_Lista01;

public class C09EX10F {
    public static void main(String[] args) {
        double num, den = 1, serie = 0;

        for(int i = 1; i <= 100; i++){
            num = (i * i);
            den = Math.pow((i * 2), 2);

            serie += num/den;
        }

        System.out.println(serie);
    }
}
