import java.util.Scanner;

public class C09EX03 {
    public static void main(String[] args) {
        double num, den, serie = 0, rep;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de reps -> ");
        rep = input.nextDouble();

        for (int i = 1; i < rep; i++) {
            num = 4 * i;
            den = 3 * i;
            serie += Math.sqrt(num) / den; 
        }
        
        System.out.println(serie);
        input.close();
    }
}
