package conteudo08;

import java.util.Scanner;

// Uma indústria produtora de máquinas agrícolas coloca a 
// venda no mercado apenas 5 modelos de um determinado 
// equipamento, conforme tabela abaixo. Num determinado mês
// ela fez 1000 vendas de modelos diferentes. Cada cliente
// comprou apenas uma unidade de um determinado modelo. 
// Faça um programa que solicite ao usuário o código do modelo
// do equipamento vendido e calcule e imprima o faturamento
// total do período.

public class C08EX12 {
    public static void main(String[] args) {
        int quantVendas = 1000;
        double precoUnit = 0, faturamento = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o codigo do modelo -> ");
            int codigoModelo = input.nextInt();

            switch (codigoModelo) {
                case 1:
                    precoUnit = 1.565;
                    break;

                case 2:
                    precoUnit = 1.890;
                    break;
                case 3:
                    precoUnit = 2.150;
                    break;
                case 4:
                    precoUnit = 2.963;
                    break;
                case 5:
                    precoUnit = 3.750;
                    break;
                default:
                    System.out.println("Modelo Inválido!!");
                    break;
            }
            
            faturamento += quantVendas * precoUnit; 
        }

        System.out.println("Faturamento -> " + faturamento);
        input.close();
    }

}
