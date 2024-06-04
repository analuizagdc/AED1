package EX10_Lista01;

public class C09EX10A {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for(int i = 1; i <= 100; i++){
            num = i;
            den = Math.sqrt(i * 2);

            serie +=  num / den;
        }

        System.out.println(serie);
    }
}
