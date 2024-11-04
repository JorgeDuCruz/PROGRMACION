import java.util.Scanner;

/**
 * Este código te devuelve el área de un cubo o su volumen en funcion de lo que quieras y el lado que le des
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class ej3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres calcular el área (1) o el volumen (2) del cubo?");
        int opcion= sc.nextInt();
        System.out.println("Cual es el lado del cubo en metros?");
        double lonxitude= sc.nextDouble();
        if (opcion==1) calcularArea(lonxitude);
        if (opcion==2)calcularVolumen(lonxitude);
        sc.close();
    }

    /**
     * Esta funcion calcula y muestra el area de un cubo dada la lonjitud del lado
     * @param lonxitude tamaño del lado del cubo
     */
    static void calcularArea(double lonxitude){
        double area = lonxitude*lonxitude*6;
        System.out.println("El área del cubo es "+area+" m²");
    }

    /**
     * Esta funcion y muestra el volumen de un cubo dada la longitud del lado
     * @param lonxitude tamaño del lado del cubo
     */
    static void calcularVolumen(double lonxitude){
        double volumen = lonxitude*lonxitude*lonxitude;
        System.out.println("El volumen del cubo es "+volumen+"m³");
    }
}
