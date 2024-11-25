import java.util.Arrays;

public class ej8 {
    public static void main(String[]args){
        int[] numeros=new int[(int)(Math.random()*101)];
        for (int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*101);
        }
        int[] numPares=arrayPares(numeros);
        System.out.println(Arrays.toString(numPares));
    }

    static int[] arrayPares(int[] base){
        int pares=0;
        for (int numero:base){
            if (numero%2==0) pares++;
        }
        int[] numPares=new int[pares];
        for (int i=0, posicion=0;i< base.length;i++){
            if (base[i]%2==0){
                numPares[posicion]=base[i];
                posicion++;
            }
        }
        return numPares;
    }
}
