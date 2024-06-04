package conteudo08;

import java.util.Scanner;

// Refaça, complementando o programa anterior, prevendo que poderá haver empate
// triplo ou duplo entre os candidatos, e, se houver empates, continue o programa
// fazendo um segundo turno somente com os candidatos que empataram.
// Também faça o programa contar os votos nulos (diferentes de 1, 2 ou 3) e,
// se a quantidade de votos nulos for maior do que a quantidade de votos válidos
// (soma dos votos dados aos candidatos 1, 2 e 3), o programa deverá informar 
// que a eleição, inclusive a de segundo turno, está anulada.

public class C08EX05A {
    public static void main(String[] args) {
        int cont1 = 0, cont2 = 0, cont3 = 0, contNulo = 0;
        Scanner teclado = new Scanner(System.in);

        for (int countVoto = 0; countVoto < 4; countVoto++) {

            System.out.println("Escolha o candidato -> 1 - Fulano || 2 - Ciclano || 3 - Beltrano || 4 - Nulo");
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
                case 4:
                    contNulo++;
                    break;
                default:
                    System.out.println("Sua escolha não exite - Seu voto foi registrado como nulo!");
            }
        }

        int votosValidos = cont1 + cont2 + cont3;
        int votosTotal = votosValidos - contNulo;

        if (cont1 > cont2 && cont1 > cont3) {
            System.out.println("candidato Fulano venceu!!");
        } else if (cont2 > cont1 && cont2 > cont3) {
            System.out.println("Candidato Ciclano venceu!!");
        } else if (cont3 > cont1 && cont3 > cont2) {
            System.out.println("Candidato Beltrano venceu!!");
        } else {
            System.out.println("");
        }

        if (contNulo > votosValidos) {
            System.out.println("Eleição Anulada por falta de votos validos!");
        }

        // caso de empate
        int maxVotes = Math.max(cont1, Math.max(cont2, cont3));

        
        // Segundo Turnp

        for (int countVoto = 0; countVoto < 4; countVoto++) {
            System.out.println("------Segundo Turno------");
            System.out.println("Escolha o candidato -> 1 - Fulano || 2 - Ciclano || 3 - Beltrano");
            int voto = teclado.nextInt();

            if (cont1 == -1 || cont2 == -1 || cont3 == -1) {
                System.out.println("Este candidato não está participando do segundo turno");
            }

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
                case 4:
                    contNulo++;
                    break;
                default:
                    System.out.println("Voto Inválido -> Nulo");
                    break;
            }

            if (cont1 > cont2 && cont1 > cont3) {
                System.out.println("candidato Fulano venceu!!");
            } else if (cont2 > cont1 && cont2 > cont3) {
                System.out.println("Candidato Ciclano venceu!!");
            } else if (cont3 > cont1 && cont3 > cont2) {
                System.out.println("Candidato Beltrano venceu!!");
            } else {
                System.out.println("");
            }
        }
        teclado.close();
    }
}
