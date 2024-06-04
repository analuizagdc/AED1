import java.util.Scanner;

public class C012EX09 {
    public static void main(String[] args) {

        int num[] = new int[10];
        int soma = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Numero inteiro-> ");
            num[i] = input.nextInt();
            System.out.println("----##----");
        }
 
        for (int i = 0; i < num.length; i++) {
            soma += num[i];
        }

        for (int i = 0; i < num.length; i++) {
            if (soma % (i+1) == 0){
                System.out.println(num[i]);
            }
        }

        input.close();      

    }
}
