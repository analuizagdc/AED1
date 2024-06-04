import java.util.Scanner;

public class C012EX19 {
    public static void main(String[] args) {
        
        int tamanhoVet = 3;
        int primVetor[] = new int[tamanhoVet];
        int segVetor[] = new int[tamanhoVet];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < tamanhoVet; i++){
            System.out.println("Digite um numero -> ");
            primVetor[i] = input.nextInt();
            segVetor[i] = primVetor[i];
        }

        for(int i = tamanhoVet - 1; i >= 0; i--){
            System.out.println(segVetor[i]);
        }

        input.close();  
    }
}
