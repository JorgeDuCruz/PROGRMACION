import java.util.Arrays;

public class TablasAnhadir {
    public static void main(String[]args){
        int[] numeros={5,9,11,31,44};
        int n =12;
        if (Arrays.binarySearch(numeros,n)>=0) System.out.println("Ya existe el valor "+n);
        else numeros=copiarTabla(numeros,n);
        System.out.println(Arrays.toString(numeros));
    }

    private static int[] copiarTabla(int[] numeros, int numero) {
        int[] copia = new int[numeros.length+1];
        int posicion=-(Arrays.binarySearch(numeros,numero)+1);
        if(posicion==0){
            copia[0]=numero;
            System.arraycopy(numeros,0,copia,1,numeros.length);
        }
        else {
            copia=Arrays.copyOfRange(numeros,0,posicion);
            copia[posicion]=numero;
            //copia=copiarDesdeHasta(numeros,posicion,copia,posicion+1,numeros.length);
        }
        return copia;
    }

}
