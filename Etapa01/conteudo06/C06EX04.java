package D23683.conteudo06;

import java.util.Scanner;

public class C06EX04 {
    public static void main(String[] args) {
        double peso, altura, imc;
        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("digite seu peso: ");
        peso = teclado.nextDouble();
        System.out.println("digite sua altura: ");
        altura = teclado.nextDouble();

        imc = peso / Math.pow(altura, 2);
        if (imc < 18) {
            System.out.println("Nome: " + nome + " Altura: " + altura + " Peso: " + peso + " A pessoa está desnutrida!");
        } else {
            if (imc < 20) {
                System.out.println("Nome: " + nome + " Altura: " + altura + " Peso: " + peso + " A pessoa está abaixo do peso!");
            } else {
                if (imc <= 25) {
                    System.out.println("Nome: " + nome + " Altura: " + altura + " Peso: " + peso + " A pessoa está no peso ideal!");
                } else {
                    if (imc <= 30) {
                        System.out.println("Nome: " + nome + " Altura: " + altura + " Peso: " + peso + " A pessoa está acima do peso!");
                    } else {
                        System.out.println("Nome: " + nome + " Altura: " + altura + " Peso: " + peso + " A pessoa está obesa!");
                    }
            }
        }
        teclado.close();


    }
    }
}