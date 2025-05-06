import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class ColeccionEnterosSet {
    //Conjunto de 20 numero enteros entre 1 y 10
    //UN conjunto sin numeros repetidos
    //Un conjunto con numeros repetidos
    //UN conjunto con los numeros que solo aparecen 1 vez
    public static void main(String[] args) {
        Collection<Integer> conxOri = new ArrayList<>();
        for (int i = 0 ;i<20;i++){
            conxOri.add((int)Math.floor(Math.random()*10)+1);
        }
        System.out.println(conxOri);

        TreeSet<Integer> conxSinRep = new TreeSet<>();
        conxSinRep.addAll(conxOri);
        System.out.println(conxSinRep);

        TreeSet<Integer> conxUnaVez = new TreeSet<>();
        TreeSet<Integer> repetidos = new TreeSet<>();
        boolean repetido;
        for (Integer num:conxOri){
            repetido = conxUnaVez.add(num);
            if (!repetido){
                repetidos.add(num);
            }
        }
        conxUnaVez.removeAll(repetidos);
        System.out.println(conxUnaVez);
    }
}
