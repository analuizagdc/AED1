package conteudo11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C011EX09 {
    public static void main(String[] args) {
        String nome, setor = "", nomePrimAdimitido = "";
        int registroFunc, anoAdmitido, setorOndeTrabalha, tamanhoRegistroFunc, countAdm = 0, countGerencia = 0,
                countObras = 0, countPesquisa = 0, countDezAdm = 0;

        File leitor = new File("conteudo11/c11ex9.txt");
        Scanner arquivo = null;
        
        try {
            arquivo = new Scanner(leitor);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        do {
            nome = arquivo.nextLine();
            registroFunc = Integer.parseInt(arquivo.nextLine());

            String registroFuncString = String.valueOf(registroFunc);
            tamanhoRegistroFunc = registroFuncString.length();

            if (tamanhoRegistroFunc != 6) {
                System.out.println("Funcionario " + nome + " seu registro é inválido !!");
                continue;
            }

            // dezena do ano em que o funionario foi admitido sabendo que a empresa foi fundada em 2010
            anoAdmitido = registroFunc / 10000;

            if (anoAdmitido < 10 || anoAdmitido > 14) {
                System.out.println("Funcionario " + nome + " seu ano é inválido !!");
                continue;
            }

            // setor onde trabalha
            setorOndeTrabalha = (registroFunc / 1000) % 10;

            // nomeando cada setor
            if (setorOndeTrabalha == 1) {
                setor = "Gerencia";
                countGerencia++;

            } else if (setorOndeTrabalha == 2) {
                setor = "Administração";
                countAdm++;

            } else if (setorOndeTrabalha == 3) {
                setor = "Pesquisa";
                countPesquisa++;

            } else if (setorOndeTrabalha == 4) {
                setor = "Obras";
                countObras++;

            } else {
                System.out.println("Funcionario " + nome + " seu registro é inválido !!");
            }

            // contagem de funcionarios de adm que foram admitidos no ano de 2010
            if (anoAdmitido == 10 && setor.equals("Administração")) {
                countDezAdm++;
            }

            // nome do setor que tem mais funcionairos alocados
            if (anoAdmitido == 10 && nomePrimAdimitido.isEmpty()) {
                nomePrimAdimitido = nome;
            }
            if (anoAdmitido > 10 && anoAdmitido > 14) {
            }
        
        } while ((!nome.equalsIgnoreCase("Guilherme")));

        System.out.println("Quandidade de funcionarios por setor: \n" + "Gerencia -> " + countGerencia + "\n" + "Administração -> " + countAdm);
        System.out.println("Pesquisa -> " + countPesquisa + "\n" + "Obras -> " + countObras);
        System.out.println("Funcionarios admitidos em 2010 que trabalham na adm -> " + countDezAdm);
        System.out.println("Primeiro funcionario admitido -> " + nomePrimAdimitido + "\n" + "Ultimo funcionario admitido -> " + nomePrimAdimitido);

        arquivo.close();
    }
    

}
