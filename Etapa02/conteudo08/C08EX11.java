package conteudo08;
import javax.swing.JOptionPane;

public class C08EX11 {
    public static void main(String[] args) {
        String nome, nomeMaior = "";
        double salario, maiorSalario = 0, maiorSalarioH = 0, menorSalarioH = 0;
        int idade, corOlhos = 0, countLA = 0, estadoCivil = 0, sexo = 0, corCabelo = 0, escolaridade = 0;

        String[] optionSexo = {"M - Mulher", "M - Homem"};
        String[] optionEstadoCivil = {"C - Casado", "S - Solteiro", "O - Outro"};
        String[] optionCorOlhos = {"A - Azul", "C - Castanho", "P - Preto", "O - Outro"};
        String[] optionCorCabelos = {"L - Loiro", "P - Preto", "C - Castanho", "R - Ruivo", "O - Outro"};
        String[] optionEscolaridade = {"1 - Analfabeto", "2 - Ensino Fundamental", "3 - Ensino Médio", "4 - Superior"};

        for (int i = 0; i < 3; i++) {
            nome = JOptionPane.showInputDialog(null, "Nome", "Titulo");
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário", "Titulo"));
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade", "Titulo"));
            sexo = JOptionPane.showOptionDialog(null, "Sexo: ", "Titulo", 0, JOptionPane.PLAIN_MESSAGE, null, optionSexo, optionSexo[0]);
            estadoCivil = JOptionPane.showOptionDialog(null, "Estado Civil", "Titulo", 0, JOptionPane.PLAIN_MESSAGE, null, optionEstadoCivil, optionEstadoCivil[0]);
            corOlhos = JOptionPane.showOptionDialog(null, "Cor dos Olhos", "Titulo", 0, JOptionPane.PLAIN_MESSAGE, null, optionCorOlhos, optionCorOlhos[0]);
            corCabelo = JOptionPane.showOptionDialog(null, "Cor do Cabelo", "Titulo", 0, JOptionPane.PLAIN_MESSAGE, null, optionCorCabelos, optionCorCabelos[0]);
            escolaridade = JOptionPane.showOptionDialog(null, "Escolaridade", "Titulo", 0, JOptionPane.PLAIN_MESSAGE, null, optionEscolaridade, optionEscolaridade[0]);

            if (sexo == 0 && corCabelo == 0 && corOlhos == 0 && idade >= 18 && idade <= 25 && estadoCivil == 1 && salario >= 10000 && escolaridade == 3) {
                countLA++;
            }

            if (salario > maiorSalario){
            maiorSalario = salario;
            nomeMaior = nome; 
            }

            if (sexo == 1) {
                if (salario > maiorSalarioH) {
                    maiorSalarioH = salario;
                }
                if (salario < menorSalarioH || menorSalarioH == 0) {
                    menorSalarioH = salario;
                }
            }
        }

        // letra a 
        System.out.println("Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo -> " + countLA);

        //letra b
        System.out.println("Nome da pessoa com maior salário -> " + nomeMaior);

        //letra c 

        double diferencaSalarioH = maiorSalarioH - menorSalarioH;
        System.out.println("Diferença de salario -> " + diferencaSalarioH);
    }
}
