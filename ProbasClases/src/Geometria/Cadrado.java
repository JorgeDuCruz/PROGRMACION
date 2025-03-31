package Geometria;

public class Cadrado extends FiguraXeometrica{
    private double lado;

    public Cadrado(){
        super();
        lado = 1;
    }
    public Cadrado(double lado){
        super();
        setLado(lado);
    }
    public Cadrado(double lado, double x, double y) throws ExcepcionPuntoForaPrimeiroCadrante {
        super(x, y);
        setLado(lado);
    }

    public void setLado(double lado) {
        if (lado>0) this.lado = lado;
        else this.lado=lado*(-1);
    }
    public double obterArea(){
        return lado*lado;
    }
    public String aCadea(){
        return "Geometria.Cadrado de lado "+lado+" e centro en ("+getX()+","+getY()+")";
    }
    public double obterPerimetro(){
        return lado*4;
    }

}
