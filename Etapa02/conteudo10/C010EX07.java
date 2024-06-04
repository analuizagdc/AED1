import java.util.Scanner;

public class C010EX07 {
    public static void main(String[] args) {
        
        double contaminados = 1;
        int populacao, countDias = 0, anos, dias = 0, meses;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Quantidade de pessoas que vivem na região -> ");
        populacao = input.nextInt();

        do{
            contaminados += (contaminados * 0.003);
            countDias++;
            
        } while (contaminados <= populacao);    

        anos = countDias / 365;
        meses =  (countDias % 365) / 30;
        dias = (countDias % 365) % 30;

        System.out.println("Anos-> " + anos + " || Meses-> " + meses + " || Dias-> " + dias);

        input.close();
    }
}