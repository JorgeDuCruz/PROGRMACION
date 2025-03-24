package inmobiliaria;

public class Vivenda extends Inmoble {
    private int nHab;
    private boolean adega;
    private PrazaGaraxe garaxe;
    private String observacions;
    private String portal;
    private String piso;

    public Vivenda(String rua, int num, String localidade, double prezo, boolean aluguer, String portal, String piso, int nHab, boolean adega, PrazaGaraxe garaxe, String observacions) {
        super(rua, num, localidade, prezo, aluguer);
        setnHab(nHab);
        this.adega = adega;
        this.garaxe = garaxe;
        this.observacions = observacions;
        this.piso = piso;
        this.portal = portal;
    }

    public double calcularGanancia() {
        if (isAluguer()) return getPrezo();

        else return getPrezo()*2/100;
    }

    public String toString(){
        String texto = super.toString()+" no portal "+portal+", no piso "+piso+", con "+nHab+" habitacions.";
        texto = texto+ garaxe.toString();
        return texto;
    }

    //Getters
    public boolean isAdega() {
        return adega;
    }

    public PrazaGaraxe getGaraxe() {
        return garaxe;
    }

    public int getnHab() {
        return nHab;
    }

    public String getObservacions() {
        return observacions;
    }

    //Setters
    public void setnHab(int nHab) {
        this.nHab = Math.abs(nHab);
    }
}
