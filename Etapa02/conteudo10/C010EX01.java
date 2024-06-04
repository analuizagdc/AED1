import java.util.Scanner;

public class C010EX01 {
    public static void main(String[] args) {
        int valor, count = 0, soma = 0;
        double media;
        Scanner input = new Scanner(System.in);
        do{
           System.out.println("Valor financeiro (Digite -1 para sair) -> ");
           valor = input.nextInt();

           if (valor != -1){
            double valorMulta = valor / 10.0;
            System.out.println("Multa -> " + valorMulta);
            soma += valor;
            count++;
           }

        } while (valor != -1);
            media = (double) soma / count; 
            System.out.println("Média -> " + media);
            input.close();
        
    }
}
