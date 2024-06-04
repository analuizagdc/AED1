
public class C09EX08 {
    public static void main(String[] args) {
        double num1 = 1, num2 = 1, den = 0, serie = 0;

        for(int i = 1; i <= 20; i++){
            num1 = (i * 2 ) + 1 ;
            num2 = (i * 4 ) + 1;
            den = Math.pow(5, i);
            
            serie += num1 * Math.sqrt(num2) / den;
        }

        serie = Math.pow(serie, 2);
        System.out.println(serie);
    }
}