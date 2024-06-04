package conteudo08;

public class C08EX27 {
    public static void main(String[] args) {
        for (int rep = 1; rep <= 10; rep++) {

            for (int j = 1; j <= 7; j++) {
                for (int i = 0; i < Math.pow(2, j - 1); i++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int j = 7; j >= 1; j--) {
                for (int i = 0; i < Math.pow(2, j - 1); i++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
}
