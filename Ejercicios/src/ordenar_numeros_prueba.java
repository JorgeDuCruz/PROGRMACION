import java.util.Arrays;

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
                for (int j=0;j<numeros.length;j++){
                    if (numeros[j]>limite) limite=numeros[j];
                }
            }
            else {
                for (int j=0;j<numeros.length;j++){
                    if (numeros[j]<limite){
                        if (numeros[j]>numMax)numMax=numeros[j];
                    }
                }
            }
            limite=(numMax!=0)? numMax:limite;
            numerosOrden[i]=limite;
            numMax=0;
        }
        System.out.println("Los numeros desordenados son "+ Arrays.toString(numeros) +" y los numeros ordenados son "+Arrays.toString(numerosOrden));
    }
}
