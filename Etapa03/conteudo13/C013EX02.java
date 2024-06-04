import java.util.Scanner;

public class C013EX02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Type the value of X (-1 to exit)");
            double x = input.nextDouble();

            if (x == -1) {
                System.out.println("Program Ended");
                break;
            }

            System.out.println("Result of is -> " + calculator(x));
        }

        input.close();
    }

    static double calculator(double x) {
        double result;

        if (x < 4) {
            result = ((5 * x) + 3) / Math.sqrt(16 - Math.pow(x, 2));
        } else if (x == 4) {
            result = 0;
        } else {
            result = ((5 * x) + 3) / Math.sqrt(Math.pow(x, 2) - 16);
        }

        return result;
    }
}
