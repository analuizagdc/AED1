package D23683.conteudo06;

import java.util.Scanner;

// Faça um programa que leia a quantidade de bolas produzidas pela fábrica, a quantidade de bolas 
// com defeito e que serão descartadas, o preço unitário das caixas de papelão, a quantidade de meses 
// até a Copa, além do valor mensal do aluguel, e calcule e imprima o custo total de embalagem mais 
// custo total de estocagem de toda a produção. 

public class C06EX12 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de bolas produzidas ->");
        int quantiBolas = teclado.nextInt();

        System.out.println("Digite a quantidade de bolas com defeito  ->");
        int bolasDefeito = teclado.nextInt();

        System.out.println("Digite o preço unitário das caixas de papelão ->");
        double precoCaixas = teclado.nextDouble();

        System.out.println("Digite a quantidade de meses até a Copa ->");
        int mesesCopa = teclado.nextInt();

        System.out.println("Digite o valor mensal do aluguel ->");
        double valorAluguel = teclado.nextDouble();

        int espacosCaixas = 10;
        int quantGalpao = 850;

        double quantEmbalar = quantiBolas - bolasDefeito;
        double totalCaixasEmbalar = Math.ceil(quantEmbalar / espacosCaixas);
        double custoEmbalagem = totalCaixasEmbalar * precoCaixas;
        
        double galpoesNecessarios = Math.ceil(totalCaixasEmbalar / quantGalpao);
        double custoEstocagem = mesesCopa * valorAluguel * galpoesNecessarios;
        double custoTotal = custoEmbalagem + custoEstocagem;

        System.out.println("Produção de bolas -> " + quantiBolas + " || Bolas com defeito -> " + bolasDefeito);
        System.out.println("Preço das caixas -> " + precoCaixas + " || Aluguel Mensal -> " + valorAluguel);
        System.out.println("Meses para a copa -> " + mesesCopa + " || Custo Total -> " + custoTotal);


        teclado.close();
    }
}
