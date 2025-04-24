public class Contedor <T> {
    private T obxecto;
    public Contedor (){

    }

    public void gardar(T novoObxecto){
        obxecto = novoObxecto;
    }
    public T extraer (){
        T res = obxecto;
        obxecto = null;
        return res;
    }
}
