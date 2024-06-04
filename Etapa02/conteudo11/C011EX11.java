package conteudo11;

import java.util.Scanner;

public class C011EX11 {
    public static void main(String[] args) {
        int reps = 5;

        Scanner input = new Scanner (System.in);
        
        for (int i = 1; i <= reps; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
