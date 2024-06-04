import java.util.Scanner;

public class C010EX02 {
    public static void main(String[] args) {
        double recebidos, totalReceb = 0;
        int countReceb = 0, countValorA = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Digite os valores recebidos (Digite 0 para sair) -> ");
            recebidos = input.nextDouble();

            // somar o valor total de recebidos
            if (recebidos != 0) {
                countReceb++;
                totalReceb += recebidos;
            }

            // verificar a quantidade de valores recebidos
            // acima de 1000
            if (recebidos >= 1000) {
                countValorA++;
            }
        } while (recebidos != 0);

        // calculo da media
        double media = totalReceb / countReceb;

        System.out.println("Valores recebidos -> " + recebidos);
        System.out.println("Valor total recebido -> " + totalReceb);
        System.out.println("Media dos valores recebidos -> " + media);
        System.out.println("Quandidade de valores acima de R$1000 -> " + countValorA);

        input.close();
    }
}
