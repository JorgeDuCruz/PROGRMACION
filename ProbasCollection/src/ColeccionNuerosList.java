import java.util.ArrayList;
import java.util.List;

public class ColeccionNuerosList {
    public static void main(String[] args) {
        List<Integer> listaEnteiros = new ArrayList<>();
        listaEnteiros.add(3);
        listaEnteiros.add(45);
        listaEnteiros.add(21);
        listaEnteiros.add(20);
        listaEnteiros.add(3);
        System.out.println(listaEnteiros);
        System.out.println(listaEnteiros.get(4));
        listaEnteiros.add(5,15);
        System.out.println(listaEnteiros.get(3));
        listaEnteiros.addAll(2,listaEnteiros);
        System.out.println(listaEnteiros.remove(1));
        System.out.println(listaEnteiros);

        List<Integer> listaPrueba = listaEnteiros.subList(listaEnteiros.indexOf(45), listaEnteiros.lastIndexOf(3) );
        //Revisar interface Comparator para el uso del metodos sort que permite ordenar la lista
        System.out.println(listaPrueba);
        System.out.println(listaEnteiros);
    }
}
