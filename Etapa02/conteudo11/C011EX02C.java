package conteudo11;

import java.util.Scanner;

/**
 * C011EX02C
 */
public class C011EX02C {
    public static void main(String[] args) {
        String nome = "", nomeMenor = "";
        double valorAp, soma = 0, menorValor = Double.MAX_VALUE, valorTotalAplic = 0;
        int countBronze = 0, countPrata = 0, countOuro = 0;

        Scanner input = new Scanner(System.in);

        while (!nome.equalsIgnoreCase("re")) {
            System.out.println("Digite o nome -> ");
            nome = input.nextLine();

            System.out.println("Digite o valor aplicado -> ");
            valorAp = input.nextDouble();
            if (valorAp < menorValor) {
                menorValor = valorAp;
                nomeMenor = nome; // nome do cliente que fez a menor aplicacao
            }

            if (valorAp <= 1000) {
                System.out.println(" --Bronze-- ");
                System.out.println("-------##-------");
                countBronze++;
                soma += valorAp; // soma dos valores aplicados por bronze

            } else if (valorAp > 1000 && valorAp <= 5000) {
                System.out.println(" --Prata--");
                System.out.println("-------##-------");

                countPrata++;

            } else if (valorAp > 5000) {
                System.out.println("--Ouro--");
                System.out.println("-------##-------");

                countOuro++;
            }

            // conta do valor aplicado
            valorTotalAplic += valorAp;
            input.nextLine(); // Limpar o buffer do scanner
        }

        // print da quantidade de clientes por classificacao
        System.out.println("Clientes bronze -> " + countBronze);
        System.out.println("Clientes prata -> " + countPrata);
        System.out.println("Clientes ouro -> " + countOuro);

        // media dos valores aplicados dos clientes bronze
        double media = countBronze != 0 ? soma / countBronze : 0; // evita divisão por zero
        System.out.println("Media das aplicações dos clientes bronze -> " + media);

        // volume total de aplicacoes
        System.out.println("Valor total de aplicações -> " + valorTotalAplic);

        System.out.println("Cliente que faz a menor aplicação -> " + nomeMenor);

        input.close();
    }
}