import java.util.Scanner;

public class C013EX05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angulo;

        System.out.println("Digite um ângulo para calcular ->");
        angulo = input.nextDouble();

        calculo(angulo);
        input.close();
    }

    static void calculo(double angulo){
        double radiano = Math.toRadians(angulo);

        double seno = Math.sin(radiano);
        double cosseno = Math.cos(radiano);
        double tangente = Math.tan(radiano);

        double arcoSeno = 1/seno;
        double arcoCosseno = 1/cosseno;
        double arcoTangente = 1/tangente;

        System.out.println("Radiano -> " + radiano + "\nCosseno -> " + cosseno + " \nRadiano -> " + radiano);
        System.out.println("Arco Seno -> " + arcoSeno + "\nArco Cosseno -> " + arcoCosseno + "\nArco Tangente -> " + arcoTangente);
    }
}
