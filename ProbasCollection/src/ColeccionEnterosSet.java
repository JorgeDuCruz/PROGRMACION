import java.util.*;

public class ColeccionEnterosSet {
    //Conjunto de 20 numero enteros entre 1 y 10
    //UN conjunto sin numeros repetidos
    //Un conjunto con numeros repetidos
    //UN conjunto con los numeros que solo aparecen 1 vez
    public static void main(String[] args) {
        List<Integer> conxOri = new ArrayList<>();
        for (int i = 0 ;i<20;i++){
            conxOri.add((int)Math.floor(Math.random()*10)+1);
        }
        Comparator<Integer> c = Comparator.naturalOrder();
        conxOri.sort(c);
        System.out.println(conxOri);

        HashSet<Integer> conxSinRep = new HashSet<>();
        conxSinRep.addAll(conxOri);
        System.out.println(conxSinRep);

        HashSet<Integer> conxUnaVez = new HashSet<>();
        HashSet<Integer> repetidos = new HashSet<>();
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
