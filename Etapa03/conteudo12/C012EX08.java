import java.util.Scanner;

public class C012EX08 {
    public static void main(String[] args) {
        
        int num[] = new int[20];
        int soma = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.println("Numero inteiro-> ");
            num[i] = input.nextInt();
        }

        for(int i = 0; i < num.length / 2; i++){
            soma = num[i] + num[i + 10];
            System.out.println("soma-> " + soma);
        }

        
        input.close();
    }
}
