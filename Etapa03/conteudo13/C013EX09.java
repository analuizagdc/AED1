import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C013EX09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // le a frase o usuario
        System.out.print("Digite uma frase curta: ");
        String frase = input.nextLine().toLowerCase();

        // imprimindo o que foi feito na class correcao frase
        System.out.println(correcaoFrase(frase));

        input.close();
    }

    public static String correcaoFrase(String frase) {
        List<String> listFrases = new ArrayList<>();
        // separar as palavras
        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            // Capitaliza a primeira letra da palavra e adiciona à lista
            listFrases.add(palavra.substring(0, 1).toUpperCase() + palavra.substring(1));
        }

        // Juntar as palavras corrigidas em uma única string
        return String.join(" ", listFrases);
    }
}
