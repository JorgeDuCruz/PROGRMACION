public class ImplementaLifo extends ListaV2 implements Lifo{
    public ImplementaLifo(){
        super();
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
