import java.util.Scanner;

public class C012EX15 {
    public static void main(String[] args) {

        int tamanhoVet = 4;
        String temp;
        String meses[] = new String[tamanhoVet];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < meses.length; i++) {
            System.out.print("Informe um mes -> ");
            meses[i] = input.nextLine();
        }

        for (int i = 0; i < meses.length - 1; i++)
            for (int j = 0; j < meses.length - 1; j++)
                if (meses[j].compareToIgnoreCase(meses[j + 1]) > 0) {
                    temp = meses[j];
                    meses[j] = meses[j + 1];
                    meses[j + 1] = temp;
                }

        for (int i = 0; i < meses.length; i++)
            System.out.println((i + 1) + " - " + meses[i]);

        input.close();

    }
}
