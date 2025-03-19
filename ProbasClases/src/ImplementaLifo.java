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
        int ult = obterValor(getTamanho()-1);
        eliminarUltimo();
        return ult;
    }
}
