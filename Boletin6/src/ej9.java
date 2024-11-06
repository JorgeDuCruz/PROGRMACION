import java.util.Scanner;

/**
 * Este código te pide un número n y te devuelve los n primeros numeros de la serie de Fibonaci
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class ej9 {
    public static void main(String[]args){
        int resultado;
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuantos numeros de Fibonaci quieres?");
        int numerosFionaci= sc.nextInt();
        sc.close();
        resultado=serieFibonaci(numerosFionaci);

    }
    static int serieFibonaci(int n){
        int res;
        if (n==1) res=1;
        else res =1+serieFibonaci(n-1);
        return res;
    }
}
