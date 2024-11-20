/**
 * Este codigo genera 6 numeros aleatorios entre el 0 y el 50 y luego los muestra en orden inverso
 * @author Jorge Duran Cruz
 * @version 1.0
 */
public class ej1 {
    public static void main(String[]args){
        int[] numeros= new int[6];
        for (int i=0;i<numeros.length;i++){
            numeros[i] = (int) Math.floor(Math.random()*50)+1;
        }
        for (int i= numeros.length-1;i>=0;i--) System.out.println(numeros[i]);
    }
}
