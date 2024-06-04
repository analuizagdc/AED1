package exemplos;
public class exemplo02 {
    public static void main(String[] args){
        double num, den, serie = 0;
            for(int i = 1; i <= 100; i++){
                num = Math.pow(i, 2);
                den = (i * 2);
                serie += num / den;
            }

            serie = 375 + (Math.pow(serie, 4));
            System.out.println(serie);

    }
}
