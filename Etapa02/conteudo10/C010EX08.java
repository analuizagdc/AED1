import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C010EX08 {
    public static void main(String[] args) {
        String cidade, cidadeMenorPop = "";
        double populacao, eleitores, populacaoTotal = 0, populacaoMenor = 0;
        int quantMulheres, quantHomens, countCidades = 0, countCMulheres = 0, quantHomensTotal = 0, totalEleitores = 0;

        File leitor = new File("conteudo10/c10ex08.txt");
        Scanner arquivo = null;
        try {
            arquivo = new Scanner(leitor);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        do {
            cidade = arquivo.nextLine();
            populacao = Double.parseDouble(arquivo.nextLine());
            eleitores = Double.parseDouble(arquivo.nextLine());
            quantHomens = Integer.parseInt(arquivo.nextLine());
            quantMulheres = Integer.parseInt(arquivo.nextLine());

            // conta a quantidade de cidades
            countCidades++;

            // soma a populacao de todas as cidades
            populacaoTotal += populacao;

            totalEleitores += eleitores;

            // soma dos homens de todas as cidades
            quantHomensTotal += quantHomens;

            // soma de homens e mulheres de cada cidade
            double quantHM = quantMulheres + quantHomens;

            if (quantHM != populacao) {
                System.out.println("A soma dos homens e mulheres da cidade " + cidade + " é diferente da população");
                System.out.println("--------##--------");
            }

            if (quantMulheres > quantHomens) {
                countCMulheres++; // quantidade de cidades cuja populacao tem mais mulheres
            }

        } while (!cidade.equalsIgnoreCase("Zimbabue de Minas"));

        double percentEleitores = (totalEleitores / populacaoTotal) * 100;
        double mediaHomens = quantHomensTotal / countCidades;
        if (populacao > populacaoMenor) {
            populacaoMenor = populacao;
            cidadeMenorPop = cidade;
        }

        System.out.println("Total de cidades -> " + countCidades);
        System.out.println("População total -> " + populacaoTotal);
        System.out.println("Percentual de eleitores -> " + percentEleitores + "%");
        System.out.println("Quantidades de cidades cuja população tem mais mulheres -> " + countCMulheres);
        System.out.println("Media de homens -> " + mediaHomens);
        System.out.println("Cidade com menor população -> " + cidadeMenorPop);

        arquivo.close();
    }
}
