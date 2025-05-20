package Bol3Ex10;

import java.io.Serializable;

public class Peza implements Serializable {
    String referencia;
    Integer cantidade;

    public Peza(String referencia,Integer cantidade){
        this.referencia=referencia;
        this.cantidade=cantidade;
    }
}
