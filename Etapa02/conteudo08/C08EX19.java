package conteudo08;

import java.util.Scanner;

public class C08EX19 {
    public static void main(String[] args) {
        int prog, countProg = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            prog = (int) Math.pow(i, 2);
            countProg += prog;
        }

        System.out.println( "Soma dos 100 primeiros termos -> " + countProg);
        input.close();
    }
}
