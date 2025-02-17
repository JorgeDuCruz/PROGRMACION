public class Prisma extends Poligonos{
    private double altura;

    //CONSTRUCTORES
    public Prisma() {
        super();
        setAltura(1);
    }
    public Prisma(double h) {
        super();
        setAltura(h);
    }
    public Prisma(double h, Poligonos pol) {
        super(pol.getCaras(), pol.getLado(), pol.getX(), pol.getY());
        setAltura(h);
    }
    public Prisma(double h, int caras, double lado, Punto punto) {
        super(caras,lado, punto.getX(), punto.getY());
        setAltura(h);
    }
    public Prisma(double h, int caras, double lado, double x, double y) {
        super(caras,lado, x, y);
        setAltura(h);
    }

    //STTERTS

    public void setAltura(double altura) {
        if (altura>0)this.altura = altura;
        else this.altura=altura*(-1);
    }

    //GETTERS

    public double getAltura() {
        return altura;
    }
}
