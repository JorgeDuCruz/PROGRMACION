package Geometria;

public class Cubo extends Solido {
    private double lado;

    public Cubo(){
        super();
        lado=1;
    }

    public Cubo(double lado){
        super();
        setLado(lado);
    }
    public Cubo(double lado, double x, double y) throws ExcepcionPuntoForaPrimeiroCadrante {
        super(x, y);
        setLado(lado);
    }

    public void setLado(double lado) {
        this.lado = Math.abs(lado);
    }

    public double obterArea() {
        return lado*lado*6;
    }

    public double volumen() {
        return lado*lado*lado;
    }

    public String aCadea() {
        return "Geometria.Cubo de lado "+lado+" y centro en ("+getX()+","+getY()+")";
    }

}
