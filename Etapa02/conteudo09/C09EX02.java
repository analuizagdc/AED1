public class C09EX02 {
    public static void main(String[] args) {
        double num, den, serie = 0;
        
        for(int i = 1; i <= 100; i++){
            den = Math.pow(i, 2);
            num = i ;
            serie += (num / (den + (i - 1) ));

        }  // REVISAR PQ O RESULTADO DIFERENCIOU UM POUCO DO FINAL 
        System.out.println(serie);

    }
}
