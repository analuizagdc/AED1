package D23683.conteudo06;

import java.util.Scanner;

public class C06EX17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Responda as perguntas abaixo com VERDADEIRO (V) ou FALSO (F):");

        System.out.print("Você tem curso técnico de programação? ");
        boolean cursoTecnico = teclado.next().equalsIgnoreCase("V");

        System.out.print("Você tem curso superior de programação? ");
        boolean cursoSuperior = teclado.next().equalsIgnoreCase("V");

        System.out.print("Você tem menos de 3 anos de experiência em programação? ");
        boolean menosDe3Anos = teclado.next().equalsIgnoreCase("V");

        System.out.print("Você se considera uma pessoa criativa? ");
        boolean criativo = teclado.next().equalsIgnoreCase("V");

        System.out.print("Você prefere liderar a ser liderado? ");
        boolean prefereLiderar = teclado.next().equalsIgnoreCase("V");

        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe? ");
        boolean prefereSozinho = teclado.next().equalsIgnoreCase("V");

        System.out.print("Você é autodidata (aprende sozinho)? ");
        boolean autodidata = teclado.next().equalsIgnoreCase("V");

        System.out.print("Você aceitaria uma remuneração inicial de R$1500? ");
        boolean aceitaRemuneracao = teclado.next().equalsIgnoreCase("V");

        System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
        boolean aceitaTrabalharBH = teclado.next().equalsIgnoreCase("V");

        if ((cursoTecnico && !menosDe3Anos)
                || (cursoSuperior && !menosDe3Anos && criativo && !prefereLiderar && !aceitaRemuneracao) 
                || (autodidata && !aceitaTrabalharBH)) {
            System.out.println("Parabéns! Você está apto para a função de programador na empresa.");
        } else {
            System.out.println("Desculpe, você não está apto para a função de programador na empresa.");
        }

        teclado.close();
    }
}
