package D23683.conteudo06;

import java.util.Scanner;

// Faça um programa que leia os nomes das equipes (equipe 1 e equipe 2) 
// e o placar de um jogo (sets ganhos da equipe 1 e sets ganhos da equipe 2)
//  e calcule e imprima os pontuação que cada equipe ganhou na partida. 

public class C06EX11 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        String equipe01, equipe02;
        int setEq1, setEq2;

        System.out.println("Digite o nome do time 1: ");
        equipe01 = teclado.nextLine().toUpperCase();

        System.out.println("Digite o nome do time 2: ");
        equipe02 = teclado.nextLine().toUpperCase();

        System.out.println("Digite quantos sets a equipe 1 ganhou: ");
        setEq1 = teclado.nextInt();

        System.out.println("Digite quantos sets a equipe 2 ganhou: ");
        setEq2 = teclado.nextInt();
    
        if (setEq1 == 3 && (setEq2 == 0 || setEq2 == 1)){
            System.out.println("-> Pontos " + equipe01 + " = 3" + " || Pontos " + equipe02 + " = 0");
        }      
        else if (setEq2 == 3 && (setEq1 == 0 || setEq1 == 1)){
            System.out.println("-> Pontos " + equipe01 + " = 3" + " || Pontos " + equipe02 + " = 0");
        }  
        else if (setEq1 == 3 && setEq2 == 2 ){
            System.out.println("-> Pontos " + equipe01 + " = 2" + " || Pontos " + equipe02 + " = 1");
        }  
        else if (setEq1 == 2 && setEq2 == 3){
            System.out.println("-> Pontos " + equipe02 + " = 2" + " || Pontos " + equipe01 + " = 1");
        }else{
            System.out.println("Error!");
        }
        teclado.close();
    }
}
