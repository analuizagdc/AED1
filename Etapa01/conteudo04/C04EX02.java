package D23683.conteudo04;
import java.util.Scanner;
public class C04EX02 {
    public static void main(String[] args){
        String nome, nome_empresa, cpf, titulo_eleit, cart_mot;
        double identidade, salario;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine().toUpperCase();

        System.out.println("Informe o nome de sua empresa: ");
        nome_empresa = teclado.nextLine();

        System.out.println("Informe seu cpf: ");
        cpf = teclado.nextLine();

        System.out.println("Informe seu titulo de eleitor: ");
        titulo_eleit = teclado.nextLine();

        System.out.println("Informe sua carteira de motorista: ");
        cart_mot = teclado.nextLine();

        System.out.println("Informe seu RG: ");
        identidade = teclado.nextDouble();

        System.out.println("Informe seu salário: ");
        salario = teclado.nextDouble();

        System.out.println(" ");
        System.out.println("Ficha funcional de: " + nome + "\n");
        System.out.println("Documentos: ");

        System.out.println("CPF_________________________" + cpf);
        System.out.println("C.I_________________________" + identidade);
        System.out.println("Título de Eleitor___________" + titulo_eleit);
        System.out.println("Carteira de Motorista_______" + cart_mot+ "\n");
        System.out.println("Empresa: " + nome_empresa);
        System.out.println("Salário: " + salario);

        teclado.close();
    }
}
