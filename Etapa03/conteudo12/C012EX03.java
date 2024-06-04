
import java.util.Scanner;

public class C012EX03 {
    public static void main(String[] args) {
        
        int numeros[] = new int[10];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Numeros -> ");
            numeros[i] = input.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int) Math.pow(numeros[i], 2);
            System.out.println("Valores elevados ao quadrado -> " + numeros[i]);
        }
        
        input.close();
    }
}
