package conteudo08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// Para cada cidade, escrever uma mensagem na tela se a soma de homens e mulheres diferir da população da cidade;
// Para cada cidade, percentual de eleitores em relação a sua população;
// Quantidade total de cidades com população acima de 1 milhão de habitantes; 
// Quantidade total de cidades cuja população tem mais mulheres;
// O nome da cidade de menor população.

public class C08EX13 {
    public static void main(String[] args) {
        String cidade, menorCidade = "";
        double populacao = 0, eleitores = 0, homens = 0, mulheres = 0, somaHM = 0, percentEleitores = 0;
        int cidadesComMaisMulheres = 0, menorPopulacao = Integer.MAX_VALUE, cidadesComMaisDeUmMilhao = 0;

        File leitor = new File("Etapa02/conteudo08/c08ex13.txt");
        Scanner arquivo = null;
        try {
            arquivo = new Scanner(leitor);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        }

        for (int i = 0; i < 5; i++) {
            cidade = arquivo.nextLine();
            populacao = arquivo.nextDouble();
            eleitores = arquivo.nextDouble();
            homens = arquivo.nextDouble();
            mulheres = arquivo.nextDouble();
            arquivo.nextLine();

            somaHM = homens + mulheres;

            percentEleitores = (eleitores / populacao) * 100;
            System.out.println("Percentual de Eleitores -> " + percentEleitores);

            // Soma de homem e mulher difere ou nao a população da cidade
            if (somaHM != populacao) {
                System.out.println("A soma de homens e mulheres difere a população da cidade!");
            }

            // Verificar se a população da cidade tem mais mulheres
            if (mulheres > homens) {
                cidadesComMaisMulheres++;
            }

            // Verificar se a população da cidade é maior que 1 milhão
            if (populacao > 1000000) {
                cidadesComMaisDeUmMilhao++;
            }

            // Verificar se essa é a menor cidade em população
            if (populacao < menorPopulacao) {
                menorPopulacao = (int) populacao;
                menorCidade = cidade;
            }
        }

        System.out.println("Quantidade total de cidades com população acima de 1 milhão de habitantes: " + cidadesComMaisDeUmMilhao);
        System.out.println("Quantidade total de cidades cuja população tem mais mulheres: " + cidadesComMaisMulheres);
        System.out.println("O nome da cidade de menor população: " + menorCidade);

        
        arquivo.close();
    }
}
