package conteudo08;

// Um número inteiro é considerado triangular se for o produto 
// de três números inteiros consecutivos, como, por exemplo 120 = 4 x 5 x 6.
// Faça um programa que verifique e imprima os números triangulares 
// entre 1 e 1000. Ao final do programa deve ser impresso também a
// média destes números.

public class C08EX28 {

    public static void main(String[] args) {

        int triangular = 0, soma = 0; 
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j <= i; j++) {
                if ( i == j * (j + 1) * (j + 2)){
                    triangular += i;
                    soma++;
                    System.out.println(i);
                }
            }
            
        }
        double media = triangular / soma;
        System.out.println(media);
    }
}