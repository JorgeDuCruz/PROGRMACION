import java.util.ArrayList;
import java.util.Collection;

public class NumerosAleatoriosMasivo {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        for (int i = 0; i<100;i++){
            numeros.add((int) Math.floor(Math.random()*10)+1);
        }
        System.out.println(numeros);
        Collection<Integer> numerosEliminado = new ArrayList<>();
        numerosEliminado.add(5);
        numerosEliminado.add(7);
        numeros.removeAll(numerosEliminado);
        System.out.println(numeros);
    }
}
