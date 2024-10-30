import java.util.Scanner;

/**
 * Este código te pide 10 números para sumar pero si escribes 999 en alguno de ellos deja de pedir numeros y te devueve la suma hasta ahi
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class ej8 {
    public static void main(String[]args){
        int sum=0,numeroSum;
        Scanner sc= new Scanner(System.in);
        for (int i =1;i<=10;i++){
            System.out.println("Dame el "+i+"º numero  que quieres sumar (Para parar escribe 999)");
            numeroSum= sc.nextInt();
            if (numeroSum==999) break;
            sum=sum+numeroSum;
        }

        System.out.println("La suma de tus numeros es "+sum);
    }
}
