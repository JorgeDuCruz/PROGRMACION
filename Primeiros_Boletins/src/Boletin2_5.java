import java.util.Scanner;

/**
 * Este código te pide una distancia en millas marinas y te devuleve la distancia en metros
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class Boletin2_5 {
    public static void main(String[]args){
        int distancia;
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime la distnacia en millas marinas");
        distancia = sc.nextInt();
        sc.close();
        distancia = distancia*1852;
        System.out.println("Eso son "+distancia+" metros");
    }
}
