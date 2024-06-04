package D23683.conteudo03;

import java.util.Scanner;

public class C03EX01 {
    public class CalculaFatorial {
        // Função : Calcular o fatorial de um número
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.print("Informe um número: ");
      long numero = teclado.nextLong();
      long fatorial = 1L;
      for(long contador = 2; contador <= numero; contador++) {
         fatorial = fatorial * contador;
      }
      System.out.println("Fatorial = " + fatorial);
      teclado.close();
   }
    }
}
