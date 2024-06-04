package conteudo11;

import java.util.Scanner;

public class C011EX08 {
    public static void main(String[] args) {

        double horasTrabalhadas, salarioMaior = 0, premioPorProdutividade, somaFolhaPag = 0;
        int countAcimaCem = 0, countAcimaQuinhentos = 0, countAteCem = 0;
        String nome, nomeMaiorSalario = "", funcao, funcaoMaioarSalario = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Para finalizar o programa, digite 'fim' !! ");
        do {
            System.out.println("Nome -> ");
            nome = input.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.println("Função -> ");
                funcao = input.nextLine();

                System.out.println("Horas trabalhadas -> ");
                horasTrabalhadas = input.nextDouble();

                input.nextLine();

                if (horasTrabalhadas <= 100) {
                    premioPorProdutividade = 1000;
                    System.out.println("Premio por produtividade -> " + premioPorProdutividade);
                    countAteCem++;
                    somaFolhaPag += premioPorProdutividade;

                } else if (horasTrabalhadas > 100 && horasTrabalhadas <= 500) {
                    premioPorProdutividade = horasTrabalhadas * 10;
                    System.out.println("Premio por produtividade -> " + premioPorProdutividade);
                    countAcimaCem++;
                    somaFolhaPag += premioPorProdutividade;
                } else {
                    premioPorProdutividade = (horasTrabalhadas / 10) * 100;
                    System.out.println("Premio por produtividade -> " + premioPorProdutividade);
                    countAcimaQuinhentos++;
                    somaFolhaPag += premioPorProdutividade;
                }

                if (premioPorProdutividade > salarioMaior) {
                    salarioMaior = premioPorProdutividade;
                    nomeMaiorSalario = nome;
                    funcaoMaioarSalario = funcao;
                }
            }

        } while (!nome.equalsIgnoreCase("fim"));

        System.out.println("A pessoa que recebeu o maior salário foi " + nomeMaiorSalario + " com o cargo de " + funcaoMaioarSalario);
        System.out.println("Pessoas que trabalharam ate 100 horas -> " + countAteCem);
        System.out.println("Pessoas que trabalharam acima de 100 horas -> " + countAcimaCem);
        System.out.println("Pessoas que trabalharam acima de 500 horas -> " + countAcimaQuinhentos);       
        System.out.println("Valor da folha de pagamento -> " + somaFolhaPag);
        input.close();
    }
}
