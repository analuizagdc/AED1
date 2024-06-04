import java.util.Scanner;

public class C013EX01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x1, x2, y1, y2;

        System.out.println(" ----- Insert the values -----");

        System.out.println("X1: ");
        x1 = input.nextDouble();

        System.out.println("Y1: ");
        y1 = input.nextDouble();

        System.out.println("X2: ");
        x2 = input.nextDouble();

        System.out.println("Y2: ");
        y2 = input.nextDouble();

        System.out.println("Distance: " + distance(x1, y1, x2, y2));
        input.close();
    }

    static double distance(double x1, double y1, double x2, double y2) {
        double result = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return result;
    }

}