public class Pila extends ListaV2 implements Cola{

    public Pila() {
        super();
    }

    public Pila(Nodo inicio) {
        super(inicio);
    }

    @Override
    public void encolar(int valor) {
        engadirUltimo(valor);
    }

    @Override
    public int desencoalr() {
        int ult = obterPrimeiro();
        elimiarPrimeiro();
        return ult;
    }
}
