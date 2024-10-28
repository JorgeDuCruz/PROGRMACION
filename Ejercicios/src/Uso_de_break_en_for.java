import java.util.Scanner;

/**
 * Este código te pide 10 números y te devuelve la suma, pero si quieres parar de introducir números debes escribir 999
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class Uso_de_break_en_for {
    public static void main(String[] args){
        int sum=0,numeroSum;
        Scanner sc= new Scanner(System.in);
        for (int i =1;i<=10;i++){
            System.out.println("Dame el numero "+i+" que quieres sumar (Para parar escribe 999)");
            numeroSum= sc.nextInt();
            if (numeroSum==999) break;
            sum=sum+numeroSum;
        }
        sc.close();
        System.out.println("La suma de tus numeros es "+sum);
    }
}
