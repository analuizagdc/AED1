package EX11_Lista02;

public class C09EX12 {
    public static void main(String[] args) {
        double num, den, pi = 0;

        for(int i = 1; i <= 10000; i++){
            num = 1.0;
            den = i * 2 + 1;

            if (i % 2 == 0){
                pi -= num/den;
            } else {
                pi += num/den;
            }
        }

        pi = 4 * (pi);
        System.out.println("Valor de pi -> " + pi);
    }
}
