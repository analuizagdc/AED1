import java.util.Scanner;

public class C012EX06 {
    public static void main(String[] args) {
        String meses[] = new String[6];

        Scanner input = new Scanner(System.in);

        //lendo e adicionando os valores dentro do vetor 
        for(int i = 0; i < meses.length; i++){
            System.out.println("Meses -> ");
            meses[i] = input.nextLine();
        }

        //i vai comecar com o tamanho do vetor, menos um para nao exceder o tamanho do vetor
        //i maior ou igual a zero, i --, oq vai fazer com que o programa corra o vetor 
        //de forma contraria
        for(int i = meses.length - 1; i >= 0; i--){
            System.out.println(meses[i]);
        }
        
        input.close();

    }
}
