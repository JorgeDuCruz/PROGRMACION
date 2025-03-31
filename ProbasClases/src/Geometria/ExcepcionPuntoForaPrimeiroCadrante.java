package Geometria;

public class ExcepcionPuntoForaPrimeiroCadrante extends Exception{

    public String toString(){
        return "Coordenadas fora do primeiro cadradante";
    }

    @Override
    public String getMessage() {
        return toString();
    }
}
