import java.util.Scanner;

public class C010EX03 {
    public static void main(String[] args) {
        double r, pi = 3.1416, setorCircular = 0;
        int a = 5;

        Scanner input = new Scanner (System.in);

        do{
            System.out.println("Informe o valor de R (Digite -1 para sair)-> ");
            r = input.nextDouble();

            if(r != -1){
                setorCircular = (a * pi * (Math.pow(r, 2))) / 360;
                System.out.println(setorCircular);
            }

        } while( r != -1);
            System.out.println("a -> " + a);
            input.close();
        }
    }

