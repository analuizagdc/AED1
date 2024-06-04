package D23683.conteudo04;
import java.util.Scanner;
public class Exemplo01 {
    public static void main(String[] args){
        String nome;
        int idade;
        double salario;  //double é um float
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Informe seu salario: ");
        salario = teclado.nextDouble();

        //Saida de Dados

        System.out.println(nome + ", cuja idade é " + idade + ", recebe o salario de R$" + salario);

        teclado.close();
    }
}
