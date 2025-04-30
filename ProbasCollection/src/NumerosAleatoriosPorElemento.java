import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NumerosAleatoriosPorElemento {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        for (int i = 0; i<100;i++){
            numeros.add((int) Math.floor(Math.random()*10)+1);
        }
        System.out.println(numeros);
        Iterator<Integer> iterador =  numeros.iterator();
        int numAux;
        while (iterador.hasNext()) {
            numAux = iterador.next();
            if (numAux==5 || numAux==7){
                iterador.remove();
            }
        }
        System.out.println(numeros);
    }
}
