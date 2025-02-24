public class Nodo {
    private int valor;
    private Nodo punteiroSeguinte;

    //GETTERS
    public Nodo getPunteiroSeguinte() {
        return punteiroSeguinte;
    }

    public int getValor() {
        return valor;
    }

    //SETTERS

    public void setPunteiroSeguinte(Nodo seguinte) {
        this.punteiroSeguinte = seguinte;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    //CONSTRUCTOR

    public Nodo(int valor) {
        this.valor = valor;
    }

    public Nodo(int valor,Nodo seguinte) {
        this.punteiroSeguinte = seguinte;
        this.valor = valor;
    }
}
