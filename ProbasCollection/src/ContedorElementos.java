import java.util.Arrays;

public class ContedorElementos <T> implements Pila<T>, Cola<T>{
    private T[] obxectos;

    public ContedorElementos(T[] obxectos){
        this.obxectos=obxectos;
    }

    @Override
    public void apilar(T novo) {
        obxectos = Arrays.copyOf(obxectos,obxectos.length+1);
        obxectos[obxectos.length-1] = novo;
    }

    @Override
    public T desapilar() {
        T aux = null;
        if (obxectos.length > 0) {
            aux = obxectos[obxectos.length-1];
            obxectos = Arrays.copyOf(obxectos,obxectos.length-1);
        }
        return aux;
    }

    @Override
    public void encolar(T novo) {
        apilar(novo);
    }

    @Override
    public T desencolar() {
        T aux = null;
        if (obxectos.length > 0) {
            aux = obxectos[0];
            obxectos = Arrays.copyOfRange(obxectos,1,obxectos.length);
        }
        return aux;
    }
}
