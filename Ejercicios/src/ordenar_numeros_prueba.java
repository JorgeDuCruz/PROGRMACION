import java.util.Arrays;

/**
 * Este codigo genera una matriz de numeros aleatorios y luego los ordean de mayor a menor,
 * actualmente hay un fallo si un numero se repite lo contabiliza como  solo uno
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class ordenar_numeros_prueba {
    public static void main(String[]args){
        int[] numeros=new int[5];
        int numMax=0,limite=0;
        for (int i=0;i<numeros.length;i++) {
            numeros[i] = (int) Math.floor(Math.random() * 51);
        }
        int[] numerosOrden=new int[numeros.length];
        for (int i=0;i<numeros.length;i++){
            if (i==0){
                for (int j=0;j<numeros.length;j++){//en este for se comprueba cual es el numeros más grande
                    if (numeros[j]>limite) limite=numeros[j];
                }
            }
            else {
                for (int j=0;j<numeros.length;j++){// En este for se comprueba cual es el numero más grande que sea menor al anterior numero más grande
                    if (numeros[j]<limite){
                        if (numeros[j]>numMax)numMax=numeros[j];
                    }
                }
            }
            limite=(numMax!=0)? numMax:limite; // dado que en la primera iteracion el limite es el numero más grande se asegura de que mantiene su valor mientras que en el resto de iteraciones el numero mas grande es el numMax
            numerosOrden[i]=limite;//escribe los numeros de manera ordenada
            numMax=0;//reinicia el conteo del numMax para la siguiente iteracion
        }
        System.out.println("Los numeros desordenados son "+ Arrays.toString(numeros) +" y los numeros ordenados son "+Arrays.toString(numerosOrden));
    }
}
