package exemplos;


public class exemplo01 {
    public static void main(String[] args){
        double num, den, serie = 0;
        for( int i = 1; i <= 50; i++){
            num = i;
            den = 51 - i; 
            serie += num / den;
        }
        System.out.println(serie);
    }
}