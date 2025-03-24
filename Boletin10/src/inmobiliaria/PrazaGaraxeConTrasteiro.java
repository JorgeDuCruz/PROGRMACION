package inmobiliaria;

public class PrazaGaraxeConTrasteiro extends PrazaGaraxe {
    private double superficie;

    public PrazaGaraxeConTrasteiro(String rua, int num, String localidade, double prezo, boolean venta, double ancho, double largo, int numPlaza, double superficie) {
        super(rua, num, localidade, prezo, venta, ancho, largo, numPlaza);
        setSuperficie(superficie);
    }

    public void setSuperficie(double superficie) {
        this.superficie = Math.abs(superficie);
    }

    public double getSuperficie() {
        return superficie;
    }
}
