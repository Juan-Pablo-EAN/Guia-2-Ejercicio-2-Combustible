package combustible;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Combustible {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat ("#.000");
        int galon = 0;
        
        System.out.println("Hola, escribe el valor en millas por galón (MPG) que deseas convertir a litros por kilómetro (LPK)");
        galon = entrada.nextInt();
        double resultado = (double)(235.21/galon);
        System.out.println("Resultado:" + " " + galon + " " + "mi/gal" + " " + "equivale a" + " " + decimales.format(resultado) + " " + "lt/km");
        System.out.println("");
        System.out.println("Gracias por tu participación");
    }
    
}
