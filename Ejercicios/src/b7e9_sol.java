import java.util.Arrays;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class b7e9_sol {
    public static void main(String[]args){
        int[] tabla={2,4,4,2,5,6,9,2,3,4};

        tabla=senRepetidos(tabla);
        System.out.println(Arrays.toString(tabla));
    }
    static int[] senRepetidos(int[] taboa){
        int[] temporal = new int[1];
        for (int elemento: taboa){
            if (busquedaBinaria(temporal,elemento) ==- 1){
                int[] novo = new int[temporal.length+1];
                for (int i=0;i<temporal.length;i++){
                    novo[i]=temporal[i];
                }
                novo[temporal.length] = elemento;
                temporal=novo;
            }
        }
        return temporal;
    }

    static int busquedaBinaria(int[] base,int valor){
        int medio, linf = 0,lsup=base.length-1, indice=-1;
        while (linf!=lsup){
            medio=(lsup-linf)/2;
            if (base[medio+linf]==valor){
                indice=medio+linf;
                break;
            }
            if (base[medio+linf]>valor){
                lsup=medio+linf-1;
            }
            else {
                linf=medio+linf+1;
            }
        }
        if (base[linf]==valor){
            indice=linf;
        }
       return indice;
    }
}
