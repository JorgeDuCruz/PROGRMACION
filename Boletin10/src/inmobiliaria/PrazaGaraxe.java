package inmobiliaria;

public class PrazaGaraxe extends Inmoble{
    private double ancho;
    private double largo;
    private int numPlaza;

    public PrazaGaraxe(String rua, int num, String localidade, double prezo, boolean venta, double ancho, double largo, int numPlaza) {
        super(rua, num, localidade, prezo, venta);
        setAncho(ancho);
        setLargo(largo);
        setNumPlaza(numPlaza);
    }

    public double calcularGanancia() {
        if (isAluguer()) return getPrezo();

        else return getPrezo()*3/100;
    }

    //Setters
    public void setAncho(double ancho) {
        this.ancho = Math.abs(ancho);
    }

    public void setLargo(double largo) {
        this.largo = Math.abs(largo);
    }

    public void setNumPlaza(int numPlaza) {
        this.numPlaza = Math.abs(numPlaza);
    }

    //Getters
    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public int getNumPlaza() {
        return numPlaza;
    }
}
