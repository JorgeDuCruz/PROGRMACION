public class Punto {
    private double X;
    private double Y;

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

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

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

}

