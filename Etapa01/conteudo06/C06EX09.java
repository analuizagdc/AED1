package D23683.conteudo06;
import java.util.Scanner;

// Tendo como dados de entrada a altura (em metros) e o sexo de uma pessoa
//(“F” para feminino e “M” para masculino), faça um programa que calcule
// o peso ideal da mesma, utilizando as seguintes fórmulas:

public class C06EX09 {
    public static void main(String[] args) {
        double altura, pesoFem, pesoMasc;
        String sexo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();

        System.out.println("Digite seu sexo -> (F) para feminino e (M) para masculino: ");
        sexo = teclado.next().toUpperCase();

        if (sexo.equals("F")) {
            pesoFem =  ((62.1 * altura) - 44.7);
            System.out.printf("Peso ideal:  %.3fkg", pesoFem );

        } else if (sexo.equals("M")) {
            pesoMasc = ((72.7 * altura) - 58);
            System.out.printf("Peso ideal:  %.3fkg", pesoMasc );

        } else {
            System.out.println("Sexo inválido.");
        }

        teclado.close();
    }
}
