import java.util.Scanner;

public class C09EX09 {
    public static void main(String[] args) {
        double num = 0, den = 0, serie = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de termos que terá na série -> ");
        int quant = input.nextInt();

        for(int i = 1; i <= quant; i++){ 
            num = Math.pow(3, i) * 3;
            den = (i + 9) * Math.sqrt(Math.pow(Math.pow(i, 2), 2));

            serie += num / den;
        }

        serie = 100 - (Math.pow(serie, 3));
        System.out.println(serie);

        input.close();
    }
}
