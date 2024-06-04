package EX10_Lista01;

public class C09EX10D {
    public static void main(String[] args) {
        double num, den = 0, serie = 0;

        for(int i = 1; i <= 100; i++){
            num =  i + (i - 1);
            den = (i * i);
            
            serie += num/den;
        }

        System.out.println(serie);

    }
}
