import java.util.Scanner;

public class C010EX05 {
    public static void main(String[] args) {
        int countPessoas = 0, countMulheres = 0, countHomens = 0, countMenorPeso = 0;
        double alturaMedia = 0, altura, peso;
        String sexo;

        Scanner input = new Scanner(System.in);
        System.out.println("Aviso!! O programa somente aceita altura abaixo de dois metros!!");

        do {
            System.out.println("-----------##-----------");

            System.out.println("Altura -> ");
            altura = input.nextDouble();

            if (altura < 2.00) {
                System.out.println("Peso -> ");
                peso = input.nextDouble();
                input.nextLine(); 

                System.out.println("Sexo - (F) Feminino (M) Masculino ->");
                sexo = input.next().toUpperCase();
                countPessoas++;
                
                // contagem de mulheres e homens
                if (sexo.equals("F")) {
                    countMulheres++;
                } else {
                    countHomens++;
                    alturaMedia += altura; 
                }
                
                if (peso < 60 && sexo.equals("F")) {
                    countMenorPeso++;
                }
            }

        } while (altura < 2.00);

        // Calcula a média de altura dos homens
        if (countHomens > 0) {
            alturaMedia /= countHomens;
        }

        // prints
        System.out.println("Quantidade de pessoas pesquisadas -> " + countPessoas);
        System.out.println("Quantidade de mulheres -> " + countMulheres);
        System.out.println("Altura média dos homens -> " + alturaMedia);
        System.out.println("Mulheres com peso menor que 60 -> " + countMenorPeso);

        input.close();
    }
}
