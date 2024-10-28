
import java.util.Scanner;

public class Boletin2_3_2 {
    public static void main(String[] args) {
        String cambio, euros;
        double dolares;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos euros tienes?");
        euros = sc.next();
        System.out.println("¿Cual es el cambio euro dolar actualmente?");
        cambio = sc.next();
        dolares = Double.parseDouble(euros) * Double.parseDouble(cambio);
        System.out.println("Tienes "+dolares+"$");
        sc.close();
    }
}
