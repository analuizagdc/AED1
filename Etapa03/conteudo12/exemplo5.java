import java.util.Scanner;

public class exemplo5 {
    public static void main(String[] args) {

        int quant = 3;
        int pos = -1;
        int numero[] = new int[quant];

        Scanner input = new Scanner(System.in);

        //adicionando os valores do input dentro do vetor 
        for (int aux = 0; aux < numero.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            numero[aux] = input.nextInt();
        }

        //variavel que sera usada para pesquisa do vetor 
        System.out.print("Informe número a ser pesquisado na relação: ");
        int pesq = input.nextInt();

        
        do {
            pos++; //ficar somando o valor da pos a cada iteracao
        } while (pos < numero.length && pesq != numero[pos]); //enquanto o valor da pos for menor que o lenght de numero 
        //e o numero de pesquisa for diferente da posicao do numero pesquisado.

        if (pos == numero.length) {
            System.out.println("Valor nao encontrado!!");
        } else {
            System.out.println("Valor encontrado -> " + (pos + 1));
        }

        input.close();
    }
}