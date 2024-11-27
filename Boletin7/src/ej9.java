import java.util.Arrays;

/**
 * funcion que reciba una tabla y devuelva otra sin numeros repetidos
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class ej9 {
    public static void main(String[]args){
        int[] tabla=new int[10];
        for (int i=0;i<tabla.length;i++){
            tabla[i]=i/3;
        }
        tabla=tablaSinRepetir(tabla);
        System.out.println(Arrays.toString(tabla));
    }

    static int[] tablaSinRepetir(int[] base){
        int[] copiaBase=new int[base.length];
        int lonxitude= base.length;
        for (int i=0;i< base.length;i++){
            for (int u=i+1;u<base.length;u++){
                if (base[i]==base[u] && copiaBase[u]!=-1){
                    copiaBase[u]=-1;
                    lonxitude--;
                    break;
                }
            }
        }
        int[] tabla=new int[lonxitude];
        for (int i=0,posicion=0;i<base.length;i++){
            if (copiaBase[i]==0){
                tabla[posicion]=base[i];
                posicion++;
            }
        }

        return tabla;
    }
    /*

    static int[] tablaNoRepetir(int[] base){
        int[] copia=new int[base.length];
        int[] auxiliar=new int[base.length];
        for (int i=0;i< base.length;i++){
            for (int u=0;u<base.length;u++){
                if (base[i]==base[u] && i!=u){
                    copia=new int[copia.length-1];
                    System.arraycopy(base,0,copia,0,u-1);
                    System.arraycopy(base,u+1,copia,u,copia.length-u);
                    System.arraycopy(copia,0,auxiliar,0,copia.length);
                }
            }
        }
        return base;
    }
    */
}
