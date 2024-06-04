import java.util.Scanner;

public class C012EX18 {
    public static void main(String[] args) {

        int tamanhoVet = 10;
        int num[] = new int[tamanhoVet];

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        for(int i = 0; i < tamanhoVet; i++){
            System.out.println((i + 1) + "° ->" );
            num[i] = input.nextInt();
        }

        System.out.println("Informe um numero para multiplicar pelos outros -> ");
        double multiplicador = input.nextDouble();
        
        for(int i = 0; i < tamanhoVet; i++){
            double mult = num[i] * multiplicador;
            System.out.println(mult);
        }

        input.close();
    }
}