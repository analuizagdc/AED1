package conteudo11;

import java.util.Scanner;

public class C011EX05 {
    public static void main(String[] args) {
        String nome;
        int codigo, countMatricIngles = 0, countMatriculas = 0, mensalidadeIngles = 0, mensalidadeEspanhol = 0,
                mensalidadeFrances = 0;
        double valorMensalidade = 0, somaMensalidade = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("---------##---------");
            System.out.println("Nome do aluno -> ");
            nome = input.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.println("Codigo do idioma -> (1)-Ingles (2)-Francês (3)-Espanhol ");
                codigo = input.nextInt();
                input.nextLine();

                switch (codigo) {
                    case 1:
                        valorMensalidade = 100;
                        System.out.println("Valor da mensalidade de inglês -> " + valorMensalidade);
                        countMatricIngles++;
                        mensalidadeIngles += valorMensalidade;
                        somaMensalidade += valorMensalidade;
                        break;

                    case 2:
                        valorMensalidade = 150;
                        System.out.println("Valor da mensalidade de francês -> " + valorMensalidade);
                        mensalidadeFrances += valorMensalidade;
                        somaMensalidade += valorMensalidade;
                        break;

                    case 3:
                        valorMensalidade = 120;
                        System.out.println("Valor da mensalidade espanhol -> " + valorMensalidade);
                        mensalidadeEspanhol += valorMensalidade;
                        somaMensalidade += valorMensalidade;
                        break;

                    default:
                        System.out.println("Código invalido!!!");
                        break;
                }
                countMatriculas++;
            }

        } while (!nome.equalsIgnoreCase("fim"));

        System.out.println("Alunos matriculados em inglês -> " + countMatricIngles);

        // mensalidade media da escola
        double mensalidadeMedia = somaMensalidade / countMatriculas;
        System.out.println("Mensalidade media da escola -> " + mensalidadeMedia);

        if (mensalidadeIngles > 0) {
            System.out.println("Mensalidade total em ingles -> " + mensalidadeIngles);
        }

        if (mensalidadeFrances > 0) {
            System.out.println("Mensalidade total em frances -> " + mensalidadeFrances);
        }

        if (mensalidadeEspanhol > 0) {
            System.out.println("Mensalidade total em espanhol -> " + mensalidadeEspanhol);
        }
        
        input.close();
    }
}
