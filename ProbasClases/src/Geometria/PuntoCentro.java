package Geometria;

public class PuntoCentro extends PuntoAbstracto {
    public PuntoCentro() {
        super();
    }

    public PuntoCentro(double x, double y) throws ExcepcionPuntoForaPrimeiroCadrante {
        super(x, y);
    }
    public String aCadea(){
        return "("+getX()+","+getY()+")";
    }
}
