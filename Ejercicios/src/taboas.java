import java.util.Arrays;
import java.util.Scanner;

/**
 * Funcion que recibe 2 parametros, una tabla y un valor y revise si en la tabla esta el valor si existe devuelve el indice si no devuelve -1
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class taboas {
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
        funcionRevisar(numeros,numero);
    }
    static void funcionRevisar(int[] tabla, int numero){
        int identificador=-1;
        for (int i=0;i<tabla.length;i++){
            if (tabla[i]==numero){
                identificador=i;
                break;
            }
        }
        System.out.println(identificador);
    }
}
