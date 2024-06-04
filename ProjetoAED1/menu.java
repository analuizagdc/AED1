import java.util.Scanner;

public class menu {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Qual operação deseja realizar? \n1 - Seno \n2 - Cosseno \n3 - Tangente \n4 - Todos");
        int operacao = input.nextInt();

        System.out.print("Ângulo -> ");
        double angulo = input.nextDouble();

        double radiano = Math.toRadians(angulo);

        switch (operacao) {
            case 1 -> calcularSeno.calculoSeno(radiano);
            case 2 -> calcularCosseno.calculoCosseno(radiano);
            case 3 -> calcularTangente.calculoTangente(radiano);
            case 4 -> calcularTodos.calculoTodos(radiano);
            default -> System.out.println("Opção Inexistente !!!");
        }
    }
}
