
import java.util.Scanner;

//Faça um programa que calcule e imprima o valor a ser retido 
//de Imposto de Renda de uma pessoa de acordo com as fórmulas
// abaixo. O salário e o número de dependentes serão informados pelo usuário.

public class C05EX03 {
    public static void main(String[] args){
        double liquido, impostoRenda, salario, quantDependentes;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do Salário: ");
        salario = teclado.nextDouble();

        System.out.println("Digite a quantidade de dependentes: ");
        quantDependentes = teclado.nextDouble();

        liquido = (salario - (quantDependentes * 60.0));
        impostoRenda = (0.15 * liquido);
        System.out.println("Imposto de Renda: " + impostoRenda);
        
        teclado.close();
        
    }
}
