import java.util.Scanner;

public class C013EX03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro -> ");
        int num = input.nextInt();

        System.out.println("Digite a posicao do numero que procura -> ");
        int pos = input.nextInt();

        inverter(num, pos);
        
        input.close();

    }

    static void inverter(int num, int pos) {

        int posicao = pos-1;
        int cont=0;
        String numStr = String.valueOf(num);
        String vet[] = numStr.split("");
        String novoVet[] = new String[vet.length];

        for (int j = vet.length-1; j >= 0; j--) {
            novoVet[cont] = vet[j];
            cont++;
        }

        System.out.println("Numero da posição: " + novoVet[posicao]);
    }
}

