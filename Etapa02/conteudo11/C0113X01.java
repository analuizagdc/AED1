package conteudo11;

import java.util.Scanner;

public class C0113X01 {
    public static void main(String[] args) {
        double funcao, soma = 0;
        int count = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero -> ");
        double x = input.nextDouble();
        
        for(int i = 1; i <= x; i++){
            if (i % 2 != 0){
                funcao = Math.pow(i, 2) + (((4 * i) - 2) / 5.0);
                System.out.println("F" + i + " = " + funcao);
                soma += funcao;
                count++;
            }
        }

        double media = soma / count;
        System.out.println(media); 

        input.close();
    }
}
