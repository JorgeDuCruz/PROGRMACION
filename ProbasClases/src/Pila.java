public class Pila extends ListaV2 implements Lifo{

    public Pila() {
        super();
    }

    public Pila(Nodo inicio) {
        super(inicio);
    }

    @Override
    public void apilar(int valor) {
        engadirUltimo(valor);
    }

    @Override
    public int desapilar() {
        int pri = obterPrimeiro();
        elimiarPrimeiro();
        return pri;
    }
}
