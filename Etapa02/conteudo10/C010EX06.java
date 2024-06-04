import java.util.Scanner;

public class C010EX06 {
    public static void main(String[] args) {
        double a, b, c, Xo, Yo, distancia, num, den;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a -> ");
        a = input.nextDouble();

        System.out.println("Digite o valor de b -> ");
        b = input.nextDouble();

        System.out.println("Digite o valor de c -> ");
        c = input.nextDouble();

        do {
            System.out.println("Digite as coordenadas de Xo -> ");
            Xo = input.nextDouble();

            System.out.println("Digite as coordenadas de Yo -> ");
            Yo = input.nextDouble();

            num = (a * Xo) + (b * Yo) + c; // conta do numerador
            den = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2))); // conta do denominador
            distancia = num / den; // funcao da distancia
            System.out.println("D = " + distancia);

        } while (distancia != 0);
        System.out.println("O ponto p coincide com o ponto x !!!");

        input.close();
    }
}
