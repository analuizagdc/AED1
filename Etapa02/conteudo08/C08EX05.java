package conteudo08;
import java.util.Scanner;

// Faça um programa para apurar as eleições para prefeito de uma cidade. 
// Para o cargo se candidataram 3 pessoas: Fulano, Ciclano e Beltrano.
// O programa deverá ler todos os votos, calcular e imprimir a quantidade 
// de votos obtido por cada candidato e o nome do candidato vencedor.
// A cidade tem 100 eleitores e todos votaram.
// Observações:
// 1) O voto será computado pelo número do candidato e não pelo seu nome de acordo com a codificação abaixo: 
// 1 - Fulano, 2 - Ciclano e 3 - Beltrano
// 2) Não haverá votos em branco ou nulos.
// 3) Não haverá empate entre candidatos.

public class C08EX05 {
    public static void main(String[] args) {
        int cont1 = 0, cont2 = 0, cont3 = 0;
        Scanner teclado = new Scanner(System.in);

        for (int countVoto = 0; countVoto < 4; countVoto++) {
           
            System.out.println("Escolha o candidato -> 1 - Fulano || 2 - Ciclano || 3 - Beltrano");
            int voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                default:
                    System.out.println("Batata");
                    break;
            }
        }
        if (cont1 > cont2 && cont1 > cont3) {
            System.out.println("candidato Fulano venceu!!");
        } else if (cont2 > cont1 && cont2 > cont3) {
            System.out.println("Candidato Ciclano venceu!!");
        } else {
            System.out.println("Candidato Beltrano venceu!!");
        }
        teclado.close();
    }
}
