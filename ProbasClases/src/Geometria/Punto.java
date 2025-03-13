package Geometria;

public class Punto {
    private double X;
    private double Y;

    //CONSTRUCTORES
    public Punto(double x, double y){
        setX(x);
        setY(y);
    }
    public Punto(){
        X = 0;
        Y = 0;
    }

    public Punto(double num){
        setX(num);
        setY(num);
    }

    //GETTERS
    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    //SETTERS
    public void setX(double x) {
        if (x>=0){
            this.X = x;
        }
        else this.X = x*(-1);
    }

    public void setY(double y) {
        if (y>=0){
            this.Y = y;
        }
        else this.Y = y*(-1);
    }

    //METODOS
    public boolean equals(Punto p2){
        return X==p2.getX() && Y== p2.getY();
    }

    public String toString(){
        return "("+X+","+Y+")";
    }
}

