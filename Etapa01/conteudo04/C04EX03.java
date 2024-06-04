package D23683.conteudo04;
import java.util.Scanner;

public class C04EX03 {
    public static void main(String[] args){
        double ate, acima01, and, acima02, multa, multa2, multa03;

        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Quantidade de Poluente Emitido x Valor da Multa");

        System.out.println("Emição até: ");
        ate = teclado.nextDouble();

        System.out.println("A multa será de R$: ");
        multa = teclado.nextDouble();

        System.out.println("Emição entre: ");
        acima01 = teclado.nextDouble();
        System.out.println("e: ");
        and = teclado.nextDouble();

        System.out.println("A multa será de: ");
        multa2 = teclado.nextDouble();

        System.out.println("Emição acima de: ");
        acima02 = teclado.nextDouble();

        System.out.println("Multa de: ");
        multa03 = teclado.nextDouble();


        //Saida

        System.out.println("----------------------");
        System.out.println("Quantidade de Poluente Emitido x Valor da Multa");
        System.out.println(" ");
        System.out.println("Até " + ate + " multa de R$" + multa);
        System.out.println("Acima de " + acima01 + " até " + and +  " multa de R$" + multa2);
        System.out.println("Acima de " + acima02 + " multa de R$" + multa03);

        System.out.println("----------------------");

        teclado.close();
    }
}
