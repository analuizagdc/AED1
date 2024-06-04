import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C013EX06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> listNomes = new ArrayList<>();
        String nome, nomeFamiliar;
        int countPertencentes = 0;

        System.out.println("Digite um nome de família -> ");
        nomeFamiliar = input.nextLine().toUpperCase();

        for (int i = 0; i < 100; i++) {
            System.out.println("Digite um nome completo -> ");
            nome = input.nextLine();

            listNomes.add(nome);

            if (nome.toUpperCase().endsWith(nomeFamiliar))
                countPertencentes++;
        }

        System.out.println("Pessoas na família -> " + countPertencentes);

        input.close();
    }
}
