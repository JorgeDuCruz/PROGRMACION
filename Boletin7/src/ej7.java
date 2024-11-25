import java.util.Arrays;

/**
 * Codigo que llama a una funcion para copiar una tabla
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class ej7 {
    public static void main(String[]args){
        int[] numeros={1,2,54,78};
        int[] copia=copiarTablaNum(numeros);
        System.out.println(Arrays.toString(copia));
    }

    /**
     * Copia los parametros de una tabla con valores int en otra tabla
     * @param base tabla que se quiere copiar
     * @return copia de la tabla base
     */
    static int[] copiarTablaNum(int[] base){
        int[] copia=new int[base.length];
        for (int i=0;i<base.length;i++){
            copia[i]=base[i];
        }
        return copia;
    }
}
