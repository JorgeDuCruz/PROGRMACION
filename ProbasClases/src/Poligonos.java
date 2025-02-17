public class Poligonos extends Punto{
    private int caras;
    private double lado;

    //CONSTRUCTORES

    public Poligonos(int caras, double lado) {
        super();
        setCaras(caras);
        setLado(lado);
    }
    public Poligonos(int caras, double lado,double num) {
        super(num);
        setCaras(caras);
        setLado(lado);
    }
    public Poligonos(int caras, double lado,double x,double y) {
        super(x, y);
        setCaras(caras);
        setLado(lado);
    }
    public Poligonos() {
        super();
        setCaras(3);
        setLado(1);
    }

    //SETTERS

    public void setCaras(int caras) {
        if (caras>2)this.caras = caras;
        else this.caras=3;
    }

    public void setLado(double lado) {
        if (lado>0)this.lado = lado;
        else this.lado=lado*(-1);
    }

    //GETTERS

    public int getCaras() {
        return caras;
    }

    public double getLado() {
        return lado;
    }
}
