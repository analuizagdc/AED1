
import java.util.Scanner;

public class C05EX04 {
    public static void main(String[] args){
        double x1, x2, y1, y2, distancia;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor de X1: ");
        x1 = teclado.nextDouble();
        System.out.println("Insira o valor de X2: ");
        x2 = teclado.nextDouble();
        System.out.println("Insira o valor de Y1: ");
        y1 = teclado.nextDouble();
        System.out.println("Insira o valor de Y2: ");
        y2 = teclado.nextDouble(); 

        distancia = (Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2))));
        System.out.println("Ponto 1 (" + x1 + "," + y1 + ")"); 
        System.out.println("Ponto 2 (" + x2 + "," + y2 + ")");
        System.out.println("Distância: " + distancia);
        teclado.close();
    }
}
  