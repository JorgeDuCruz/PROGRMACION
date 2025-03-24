package inmobiliaria;

public abstract class Inmoble {
    private String rua;
    private int num;
    private String localidade;
    private double prezo;
    private boolean aluguer;

    public Inmoble(String rua, int num, String localidade, double prezo, boolean aluguer) {
        this.rua = rua;
        this.num = num;
        this.localidade = localidade;
        setPrezo(prezo);
        this.aluguer = aluguer;
    }

    public abstract double calcularGanancia();

    public String toString(){
        String estado;
        if (aluguer){
            estado = "Aluguer";
        }
        else estado="Venta";
        return "O inmoble de estado "+estado+" da rua "+rua+", numero "+num+" na localidade de "+localidade+" custa "+prezo;
    }

    //Getters
    public String getRua() {
        return rua;
    }

    public String getLocalidade() {
        return localidade;
    }

    public int getNum() {
        return num;
    }

    public double getPrezo() {
        return prezo;
    }

    public boolean isAluguer() {
        return aluguer;
    }

    //Setters
    public void setPrezo(double prezo) {
        this.prezo = Math.abs(prezo);
    }

    public void setNum(int num) {
        this.num = Math.abs(num);
    }
}
