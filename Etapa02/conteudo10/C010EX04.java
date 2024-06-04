import java.util.Scanner;

public class C010EX04 {
    public static void main(String[] args) {
        double bdi, taxaBDI, custoParcial = 0, custoTotal = 0;
        String nome;
        Scanner input = new Scanner(System.in);

        System.out.println("Taxa de BDI em porcentagem -> ");
        taxaBDI = input.nextDouble();
        do {
            input.nextLine();
            System.out.println("Nome do produto -> (Digite fim para fechar)");
            nome = input.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {

                System.out.println("---##---");
                System.out.println("Quantidade -> ");
                double quantidade = input.nextDouble();

                System.out.println("Preço unitario");
                double precoUnit = input.nextDouble();

                // conta do custo parcial
                custoParcial = quantidade * precoUnit;

                // conta do custo total
                custoTotal += custoParcial;

                System.out.println("Custo Parcial -> " + custoParcial);
                System.out.println("---##---");

            }

        } while (!nome.equalsIgnoreCase("fim"));

        // conta do bdi
        bdi = custoTotal * taxaBDI / 100;

        // conta preco final
        double precoFinal = custoTotal + bdi;

        // prints
        System.out.println("---##---");
        System.out.println("Custo Total -> " + custoTotal);
        System.out.println("---##---");
        System.out.println("BDI -> " + bdi);
        System.out.println("---##---");
        System.out.println("Preço Final -> " + precoFinal);

        input.close();

    }
}
