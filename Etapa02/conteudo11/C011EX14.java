package conteudo11;

public class C011EX14 {
    public static void main(String[] args) {
        double num = 1, den, serie = 0;
        int countReps = 0;

        while (!(serie > 3.1416 && serie < 3.1417)){
            countReps++;
            
            if (countReps % 2 == 0){
                den = (countReps * 2) - 1;
                serie -= (num / den);
            } else {
                den = (countReps * 2) - 1;
                serie += (num/den);
            }

            serie = 4 * (serie);
        }

        System.out.println("Valor de pi -> " + serie);
        System.out.println("Quantidade de termos -> " + countReps);
        
    }
}
