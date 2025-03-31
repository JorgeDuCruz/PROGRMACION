package Geometria;

public abstract class FiguraXeometrica extends PuntoAbstracto {

    public FiguraXeometrica(){
        super();
    }
    public FiguraXeometrica(double x,double y) throws ExcepcionPuntoForaPrimeiroCadrante {
        super(x, y);
    }

    abstract public double obterArea();
    public double obterPerimetro(){
        return 0;
    }
}
