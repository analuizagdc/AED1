import java.util.Scanner;

public class C012EX14 {
    public static void main(String[] args) {
        
        int bilhetePremiado, valorBilhete = 0, tamanhoVetor = 3;
        int numeroBilhetes[] = new int[tamanhoVetor];


        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numeroBilhetes.length; i++){
            System.out.println("Numero dos bilhetes -> ");
            numeroBilhetes[i] = input.nextInt();
        }

        System.out.println("Digite o numero do bilhete premiado -> ");
        bilhetePremiado = input.nextInt();

        //percorrendo o vetor para saber se tem algum valor igual ao valor de bilhetePremiado
         for(int i = 0; i < numeroBilhetes.length; i++){
            if(bilhetePremiado == numeroBilhetes[i]){
                    valorBilhete = bilhetePremiado; //valorBilhete esta recebendo bilhetePremiado para passar o print fora da estrutura de repeticao
             } 
        }

        if (valorBilhete == bilhetePremiado){
            System.out.println("Voce foi premiado!!");
        } else {
        System.out.println("Voce nao foi premiado!!");
        }

        input.close();
    }
}
