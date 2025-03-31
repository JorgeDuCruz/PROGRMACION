package Geometria;

public abstract class Solido extends FiguraXeometrica {
    public Solido(){
        super();
    }

    public Solido(double x, double y) throws ExcepcionPuntoForaPrimeiroCadrante {
        super(x,y);
    }

    abstract double volumen();
}
