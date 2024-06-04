package conteudo11;

public class C011EX12 {
    public static void main(String[] args) {
        int rep = 5;

        for (int i = 1; i <= rep; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
