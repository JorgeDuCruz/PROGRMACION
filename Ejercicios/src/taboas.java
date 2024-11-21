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

    /**
     * Recibe una tabla y un numero, revisa en que posicion de la tabla esta el numero y lo muestra. Si no esta muestra -1
     * @param tabla conjunto de numeros sobre los que se buscara
     * @param numero numero que se buscar en la tabla
     */
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
