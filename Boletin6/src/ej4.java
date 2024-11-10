import java.util.Scanner;

/**
 * Este código te pide dias, horas y minutos y te devuelve los segundos que son en total
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class ej4 {
    public static void main(String[]args){
        int hora,dias,minutos,segundos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero de dias horas y minutos que quieres pasar a segundos");
        System.out.println("dias:");
        dias= sc.nextInt();
        System.out.println("horas:");
        hora= sc.nextInt();
        System.out.print("minutos:");
        minutos= sc.nextInt();
        sc.close();
        hora=hora+dias*24;
        minutos=minutos+hora*60;
        segundos=minutos*60;
        System.out.println("Eso son "+segundos+" segundos en total");
    }
}
