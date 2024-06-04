package conteudo08;

import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {
        String nome, cargo, nomeMaior = "", cargoMaior = "";
        double salario = 0, maiorSalario = 0;
        int idade, menorDezoito = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Nome -> ");
            nome = input.nextLine();
            
            System.out.println("Cargo -> ");
            cargo = input.nextLine();

            System.out.println("Salário -> ");
            salario = input.nextDouble();
            input.nextLine(); 

            System.out.println("Idade -> ");
            idade = input.nextInt();
            input.nextLine(); 

            if (salario >= 10000 && idade >= 50) {
                System.out.println("-----SÊNIOR-----");
            }

            if (idade <= 18){
                menorDezoito ++;
            }

            if (salario > maiorSalario){
                maiorSalario = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
        }

        double mediaSalario = salario / menorDezoito;

        System.out.println("A média dos salários dos funcionários com até 18 anos -> " + mediaSalario);
        System.out.printf("O funcionário %s do cargo %s tem o maior salário -> %.2f\n", nomeMaior, cargoMaior, maiorSalario);         

        input.close();
    }
}
