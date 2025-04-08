package EJ1;

public class Deportista extends Persoa{
    private String deporte;
    private String club;
    private String licencia;

    public Deportista(String direccion, String dni, String nome, String club, String deporte, String licencia) throws ExcepcionDNI {
        super(direccion, dni, nome);
        this.club = club;
        this.deporte = deporte;
        setLicencia(licencia);
    }

    public void setLicencia(String licencia) {
        if (licenciaValida(licencia)){
            this.licencia=licencia;
        }
        else throw new ExcepcionLicencia();
    }

    private boolean licenciaValida(String licencia) {
        if (licencia.length()!=13){
            return false;
        }
        int anho;
        try{
             anho = Integer.parseInt(licencia.substring(0,4));
             if (2025!=anho){
                 return false;
             }
        }catch (NumberFormatException e){
            return false;
        }
        String abreviatura = licencia.substring(4,7);
        try{
            Double.parseDouble(abreviatura);
            return false;
        }catch (NumberFormatException e){}

        int numLicencia;
        try{
            numLicencia = Integer.parseInt(licencia.substring(7));
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
