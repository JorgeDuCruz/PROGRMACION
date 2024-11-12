import java.util.Scanner;

/**
 * Este código te pide un número n y te devuelve los n primeros numeros de la serie de Fibonaci
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class ej9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuantos numeros de Fibonaci quieres?");
        int numerosFionaci= sc.nextInt();
        sc.close();
        serieFibonaci(numerosFionaci,0,1);

    }
    static void serieFibonaci(int n, int n1, int n2){
        if (n!=0){
            System.out.print(n1+",");
            serieFibonaci(n-1,n2,n1+n2);
        }
    }
}
