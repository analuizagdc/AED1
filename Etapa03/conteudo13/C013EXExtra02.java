import java.util.Scanner;

public class C013EXExtra02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu salario -> ");
        double salario = input.nextDouble();

        System.out.println("Digite a quantidade de dependentes -> ");
        int dependentes = input.nextInt();

        calculoIRPF(salario, dependentes);

        input.close();
    }

    static void calculoIRPF (double salario, int dependentes){

        double faixaSalarial = salario - (dependentes * 150);

        if (faixaSalarial <= 1000) {
            System.out.println("Imposto Isento");

        } else if (faixaSalarial > 1000 && faixaSalarial < 5000) {
            int imposto = (((int) faixaSalarial * 10) / 100);
            System.out.println("Imposto -> " + imposto);

        } else if (faixaSalarial > 5000 && faixaSalarial < 10000) {
            int imposto = (((int) faixaSalarial * 15) / 100);
            System.out.println("Imposto -> " + imposto);
        } else {
            int imposto = (((int) faixaSalarial * 20) / 100);
            System.out.printf("Imposto -> " + imposto);
        }
    }
}
