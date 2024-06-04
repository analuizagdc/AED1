package D23683.conteudo04;

//showMessageDialog;
//showInputDialog;
//showConfirmDialog;
//showOptionDialog.

import javax.swing.*;

public class C04EX04 {
    public static void main(String [] args){
         String primNome, nomeMeio, sobrenome, idade;

         primNome = JOptionPane.showInputDialog(null, "Digite seu primeiro nome:", JOptionPane.QUESTION_MESSAGE);
         nomeMeio = JOptionPane.showInputDialog(null, "Digite seu nome do meio:", JOptionPane.QUESTION_MESSAGE);
         sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome:", JOptionPane.QUESTION_MESSAGE);
         idade = JOptionPane.showInputDialog(null, "Digite sua idade:", JOptionPane.QUESTION_MESSAGE);

        System.out.println(sobrenome + ", " + primNome + " " + nomeMeio);
        System.out.println("Idade: " + idade + " anos.");

    }
}
