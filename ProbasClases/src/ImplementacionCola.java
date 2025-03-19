public class ImplementacionCola extends ListaV2 implements Cola{

    public ImplementacionCola() {
        super();
    }

    public ImplementacionCola(Nodo inicio) {
        super(inicio);
    }

    @Override
    public void encolar(int valor) {
        engadirUltimo(valor);
    }

    @Override
    public int desencolar() {
        int pri = getNodo(0);
        elimiarPrimeiro();
        return pri;
    }
}
