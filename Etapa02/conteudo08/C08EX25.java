package conteudo08;

// Faça um programa que gere a sequência de impressão ao lado por 10 vezes:

public class C08EX25 {
    public static void main(String[] args) {
        
        for (int rep = 1; rep <= 10; rep++) { // repetindo a quantidade de vezes que pediu no exercicio (10 vezes)
            for (int j = 1; j <= 5; j++) { 
                for (int i = 1; i <= j; i++)
                    System.out.print("*");
                System.out.println();
            }
            for (int j = 5; j >= 1; j--) {
                for (int i = 1; i <= j; i++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
