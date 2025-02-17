public class Cilindro extends Circulo{
    private double altura;

    //CONSTRUCTORES

    public Cilindro(double altura) {
        super();
        setAltura(altura);
    }
    public Cilindro(double altura,double radio, double X,double Y) {
        super(radio,X,Y);
        setAltura(altura);
    }
    public Cilindro(double altura,double radio, double num) {
        super(radio,num);
        setAltura(altura);
    }
    public Cilindro(double altura,double num) {
        super(num);
        setAltura(altura);
    }
    public Cilindro() {
        super();
        altura=1;
    }
    public Cilindro(Circulo cir, double altura){
        super(cir.getRadio(), cir.getX(), cir.getY());
        this.altura=altura;
    }
    public Cilindro(Punto punto,double altura, double radio){
        super(radio,punto.getX(), punto.getY());
        this.altura=altura;
    }

    //SETTER

    public void setAltura(double altura) {
        if (altura>0) this.altura = altura;
        else this.altura=altura*(-1);
    }

    //GETTER

    public double getAltura() {
        return altura;
    }

    //METODOS
    public double calcluarVolmune(){
        double vol= altura*super.obterArea();
        return vol;
    }

    public double obterArea(){
        double ar = altura*super.obterPerimetro()+2*super.obterArea();
        return ar;
    }

    public String toString(){
        String dev ="Cilindro de altura "+altura+" "+super.toString();
        return dev;
    }
}
