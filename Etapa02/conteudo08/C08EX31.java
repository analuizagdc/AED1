package conteudo08;

import java.util.Scanner;

public class C08EX31 {
    public static void main(String[] args) {

        double salarioMin, engenheirosBemPagos = 0;
        int soma = 0;
        String codigoCargo;

        Scanner arquivo = new Scanner(C08EX31.class.getResourceAsStream("c08ex31.txt"));

        // while (arquivo.hasNextLine()) {
        //     String linha = arquivo.nextLine();
        //     System.out.println(linha);
        // }

       codigoCargo = arquivo.nextLine();
 

        // // a) Para cada engenheiro, a mensagem “ABAIXO DO SALÁRIO
        // // MÍNIMO” se o salário estiver abaixo do salário mínimo
        // // do cargo (não imprimir nenhuma mensagem para o cargo "Outros");

        // // mensagem pro engenheiro abaixo do salario minimo

        // double salarioMinA = 5.100;
        // double salarioMinP = 4.650;
        // double salarioMinC = 2.500;
        // // double salarioMinO = 3.200;

        // if (codigoCargo.equalsIgnoreCase("A") && salarioMin < salarioMinA
        //         || codigoCargo.equalsIgnoreCase("P") && salarioMin < salarioMinP
        //         || codigoCargo.equalsIgnoreCase("C") && salarioMin < salarioMinC) {
        //     System.out.println("Salario Abaixo ");
        // }

        // // b) A quantidade de engenheiros cujo salário está igual
        // // ou acima do salário mínimo de acordo com o cargo
        // // (exceto para o cargo "Outros");

        // if ((codigoCargo.equalsIgnoreCase("A") && salarioMin >= salarioMinA) ||
        //         (codigoCargo.equalsIgnoreCase("P") && salarioMin >= salarioMinP) ||
        //         (codigoCargo.equalsIgnoreCase("C") && salarioMin >= salarioMinC)) {
        //     soma += engenheirosBemPagos;
        // }

        arquivo.close();

    }
}
