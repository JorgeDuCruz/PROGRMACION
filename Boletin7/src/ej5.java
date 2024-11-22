import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa que genera una tabla de valores desordenados y te pide un numero,
 * luego comprueba si el numero esta en la tabla mediante una funcion extra y en caso de estar devuelve su indice
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class ej5 {
    public static void main(String[]args){
        int[] numeros=new int[30];
        for (int i=0;i<numeros.length;i++){
            numeros[i]=(int) Math.floor(Math.random()*101);
        }
        int numero;
        Scanner sc= new Scanner(System.in);
        System.out.println("Que número quieres buscar");
        numero= sc.nextInt();
        sc.close();
        System.out.println(Arrays.toString(numeros));
        int identificador=funcionRevisar(numeros,numero);
        System.out.println(identificador);
    }

    /**
     * Recibe una tabla y un numero, revisa en que posicion de la tabla esta el numero y lo muestra. Si no esta muestra -1
     * @param tabla conjunto de numeros sobre los que se buscara
     * @param numero numero que se buscar en la tabla
     * @return devuelve el identificador de la tabla en el que esta el numero
     */
    static int funcionRevisar(int[] tabla, int numero){
        int identificador=-1;
        for (int i=0;i<tabla.length;i++){
            if (tabla[i]==numero){
                identificador=i;
                break;
            }
        }
        return identificador;
    }
}
