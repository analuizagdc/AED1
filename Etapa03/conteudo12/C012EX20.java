import java.util.Scanner;

public class C012EX20 {
    public static void main(String[] args) {
        int tamanhoVet = 10, countSomados = 0;
        int num[] = new int[tamanhoVet];
        double soma = 0.0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < tamanhoVet; i++) {
            System.out.println("Digite um numero -> ");
            num[i] = input.nextInt();
        }

        int ultimo = num[tamanhoVet - 1];

        for (int i = 0; i < tamanhoVet; i++) {
            if(num[i] > ultimo){
                soma+=num[i];
                System.out.println(soma);
                countSomados++;
            }
        }
        double media = soma / (double)countSomados;
        System.out.println(media);

        input.close();
    }

    
}
