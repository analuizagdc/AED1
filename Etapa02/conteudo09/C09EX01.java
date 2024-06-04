public class C09EX01 {
    public static void main(String[] args) { 
        double numUm, numDois, den, serie = 0;

        for(int i = 1; i < 38; i++){
            numUm = 39 - i;
            numDois = 38 - i;
            den = i;
            serie += (numUm * numDois) / den;
        }

        System.out.println(serie);

    }
}
