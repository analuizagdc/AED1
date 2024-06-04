package exemplos;
import java.util.Scanner;

public class exemplo04 {
    public static void main(String[] args) {
        double num, den, serie = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro -> ");
        int inteiro = input.nextInt();
        
        for(int i = 1; i <= inteiro; i++){
            num = i;
            den = 1; 
            serie *= num / den;
        }
        System.out.println(serie);

        input.close();

    }
}
