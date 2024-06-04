package D23683.conteudo04;

import javax.swing.*;

public class CO4EX5 {
    public static void main(String[] args) {
        String nome, nome_empresa, cpf, titulo_eleit, cart_mot, identidade, salario;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", JOptionPane.QUESTION_MESSAGE);
        nome_empresa = JOptionPane.showInputDialog(null, "Digite o nome da sua empresa:", JOptionPane.QUESTION_MESSAGE);
        cpf = JOptionPane.showInputDialog(null, "Digite seu CPF: ", JOptionPane.QUESTION_MESSAGE);
        titulo_eleit = JOptionPane.showInputDialog(null, "Digite seu titulo de eleitor: ", JOptionPane.QUESTION_MESSAGE);
        cart_mot = JOptionPane.showInputDialog(null, "Digite sua cnh: ", JOptionPane.QUESTION_MESSAGE);
        identidade = JOptionPane.showInputDialog(null, "Digite seu RG: ", JOptionPane.QUESTION_MESSAGE);
        salario = JOptionPane.showInputDialog(null, "Digite seu salário: ", JOptionPane.QUESTION_MESSAGE);

        System.out.println("FICHA FUNCIONAL DE: " + nome);
        System.out.println(" ");
        System.out.println("Documentos: ");
        System.out.println("CPF______________________ " + cpf);
        System.out.println("C.I______________________ " + identidade);
        System.out.println("Título de Eleitor________ " + titulo_eleit);
        System.out.println("Carteira de Motorista______________________" + cart_mot);
        System.out.println(" ");
        System.out.println("Empresa______________________" + nome_empresa);
        System.out.println("Salário__________________R$" + salario);

    }


}
