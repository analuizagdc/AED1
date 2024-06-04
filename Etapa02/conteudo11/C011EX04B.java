package conteudo11;

import java.util.Scanner;

public class C011EX04B {
    public static void main(String[] args) {

        String nome = "", nomeMenorIdade = "", sexo;
        int idade, idadeMenor = 0, countIdade = 0, pontosPerdidos, somaIdade = 0, countHomensMultados = 0, countMultados = 0, countFPerdeuPontos = 0;
        double valorMulta, somaMulta = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("------------##------------");
            System.out.println("Nome -> ");
            nome = input.nextLine();

            if (!nome.equalsIgnoreCase("x")) {

                System.out.println("idade -> ");
                idade = input.nextInt();
                input.nextLine();

                System.out.println("sexo -> (F)-Feminino  (M)-Masculino");
                sexo = input.nextLine().toUpperCase();

                System.out.println("Quantidade de pontos perdidos -> ");
                pontosPerdidos = input.nextInt();

                System.out.println("Valor da Multa -> ");
                valorMulta = input.nextDouble();
                input.nextLine();

                // dados media de idade
                somaIdade += idade;
                countIdade++;

                // valor total multas
                somaMulta += valorMulta;

                countMultados++;

                if (sexo.equalsIgnoreCase("M") && valorMulta > 0) {
                    countHomensMultados++;
                }

                if (sexo.equalsIgnoreCase("F") && pontosPerdidos == 7) {
                    countFPerdeuPontos++; // quantidade de mulheres que perderam sete pontos
                }

                // nome e idade da pessoa mais velha
                if (idade > idadeMenor) {
                    idadeMenor = idade;
                    nomeMenorIdade = nome;
                }
            }
            
        } while (!nome.equalsIgnoreCase("x"));

        // conta idade media dos condutores
        double idadeMediaCondut = somaIdade / countIdade;
        System.out.println("Idade media dos condutores -> " + idadeMediaCondut);

        // valor total das multas aplicadas
        System.out.println("Valor total das multas aplicadas -> " + somaMulta);

        // percentual de homens multados
        double percentHomensMult = (countHomensMultados / countMultados) * 100;
        System.out.println("Percentual de homens multados -> " + percentHomensMult);

        // quantidade de mulheres que perderam sete pontos
        System.out.println("Mulheres que perderam sete pontos -> " + countFPerdeuPontos);

        // nome e idade da pessoa mais velha
        System.out.println("A pessoa mais velha é " + nomeMenorIdade + " com " + idadeMenor + " anos");

        input.close();
    }
}
