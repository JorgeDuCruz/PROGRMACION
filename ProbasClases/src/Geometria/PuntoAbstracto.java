package Geometria;

public abstract class PuntoAbstracto {
    private double x;
    private double y;

    public PuntoAbstracto(){
        y=0;
        x=0;
    }
    public PuntoAbstracto(double x,double y) throws ExcepcionPuntoForaPrimeiroCadrante {
        setX(x);
        setY(y);
    }

    public void setX(double x) throws ExcepcionPuntoForaPrimeiroCadrante {
        if (x<0)  throw new ExcepcionPuntoForaPrimeiroCadrante();
        else this.x = x;
    }

    public void setY(double y) throws ExcepcionPuntoForaPrimeiroCadrante {
        if (y<0) throw new ExcepcionPuntoForaPrimeiroCadrante();
        else this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract String aCadea();
}
