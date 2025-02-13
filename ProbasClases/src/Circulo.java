public class Circulo extends Punto{
    private double radio;

    //CONSTRUCTORES
    public Circulo(double r ,double x, double y){
        super(x, y);
        setRadio(r);
    }
    public Circulo(double r,double num){
        super(num);
        setRadio(r);
    }
    public Circulo(double num){
        super(num);
        setRadio(num);
    }
    public Circulo(){
        super(1);
        setRadio(1);
    }

    //SETTERS
    public void setRadio(double radio) {
        if (radio>0){
            if (getX()-radio>0 && getY()-radio>0) this.radio = radio;
            else {
                this.radio = Math.min(getX(), getY());
            }
        }
    }

    //GETTERS
    public double getRadio() {
        return radio;
    }

    //METODOS
    public double obterDiametro(){
        return radio*2;
    }
    public double obterArea(){
        return radio*3.14*3.14;
    }
    public double obterPerimetro(){
        return radio*2*3.14;
    }
    public String toString(){
        return "circunferencia de radio "+radio+" y centro en "+super.toString();
    }
}
