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
        int numerosFionaci= sc.nextInt(); // Recibe la cantidad de numeros que quiere escribir
        sc.close();
        serieFibonaci(numerosFionaci,0,1); // La serie empieza con 0 y 1 asi que mandamos esos numeros primeros

    }

    /**
     * Esto escribe la serie de Fibonaci
     * @param n cantidad de numeros que hay que escribir
     * @param n1 numero que se va a escribir
     * @param n2 siguiente numero en escribirse
     */
    static void serieFibonaci(int n, int n1, int n2){
        if (n!=0){ // Se asegura de que solo escriba cuando queden numeros por escribir

            System.out.print(n1+","); // Escribe el primer numero y deja espacio para el siguiente

            serieFibonaci(n-1,n2,n1+n2); // llama de nuevo a la funcion teniendo que escribir un numero nuevo
                                                // y actuaizando los numero que se tinene que escribir
        }
    }
}
