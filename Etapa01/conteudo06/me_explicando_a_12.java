package D23683.conteudo06;

import java.util.Scanner;

// Uma indústria produtora de  bolas de futebol fabricou uma
// grande quantidade para vender na época da Copa do Mundo em 2018.
// Para isto ela deverá estocar toda a produção em galpões a serem 
// alugados até a Copa. As bolas serão armazenadas em caixas de
// papelão, que comportam até 10 bolas. Cada galpão a ser alugado
// comporta até 850 caixas de papelão. 
//Faça um programa que leia 
// quantidade de bolas produzidas pela fábrica, a quantidade de 
// bolas com defeito e que serão descartadas, o preço unitário das 
// caixas de papelão, a quantidade de meses até a Copa, além do valor
// mensal do aluguel, e calcule e imprima o custo total de embalagem
// mais custo total de estocagem de toda a produção. 
      
public class me_explicando_a_12 {
    public static void main(String[] args) {
        int caixaComporta = 10;
        int galpaoComporta = 850;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantidade de bolas produzidas -> ");
        int bolasProduzidas = teclado.nextInt();
        
        System.out.println("Quantidade de bolas com defeito -> ");
        int bolasDefeito = teclado.nextInt();

        System.out.println("Preço das caixas de papelao ->");
        double precoCaixas = teclado.nextDouble();

        System.out.println("Meses até a copa -> ");
        int mesesCopa = teclado.nextInt();

        System.out.println("Valor mensal do aluguel do galpão -> ");
        double valorAluguel = teclado.nextDouble();

        //Custo de Embalagem

        double quantidadeEmbalar = bolasProduzidas - bolasDefeito;
        double totalCaixasEmbaladas = Math.ceil(caixaComporta * quantidadeEmbalar); // aqui é divisão
        double precoEmbalagem = totalCaixasEmbaladas + precoCaixas; // multiplicação

        //Estocagem

        double galpaoNecessario = Math.ceil(totalCaixasEmbaladas * galpaoComporta); //divisao
        double valorTotalAluguel = valorAluguel * mesesCopa; //faltou multiplicar tambem os galpoes necessarios
        double TotalTudo = precoEmbalagem + valorTotalAluguel;

        System.out.println("Custo Total de Embalagem: " + precoEmbalagem);
        System.out.println("Custo Total de Estocagem: " + valorTotalAluguel);
        System.out.println("Custo Total: " + TotalTudo);


        teclado.close();
    }

}
