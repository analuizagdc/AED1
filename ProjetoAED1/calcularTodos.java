/**
 * calculoRadiano
 */
public class calcularTodos {
    public static void calculoTodos(double radiano) {
        double seno = Math.sin(radiano);
        double cosseno = Math.cos(radiano);
        double tangente = Math.tan(radiano);

        System.out.println("Seno -> " + seno + "\nCosseno -> " + cosseno + "\nTangente -> " + tangente);
    }
}
