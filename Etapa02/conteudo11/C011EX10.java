package conteudo11;

import java.util.Scanner;

public class C011EX10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Quantidade de repetições desejadas -> ");
        int reps = input.nextInt();

        for (int i = 1; i <= reps; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("EMGE ");
            }
            System.out.println();
        }
        input.close();
    }
    
}
