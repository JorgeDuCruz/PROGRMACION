package Persoas;

public class Deportista extends Persoa{
    private String deporte;
    private String club;
    private int licencia;

    public Deportista(String direccion, String dni, String nome, String club, String deporte, int licencia) throws ExcepcionDNI {
        super(direccion, dni, nome);
        this.club = club;
        this.deporte = deporte;
        this.licencia = licencia;
    }
}
