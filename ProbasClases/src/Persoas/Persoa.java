package Persoas;

public class Persoa {
    private String nome;
    private String direccion;
    private String dni;

    public Persoa(String direccion, String dni, String nome) throws ExcepcionDNI {
        setDireccion(direccion);
        setDni(dni);
        setNome(nome);
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getNome() {
        return nome;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(String dni) throws ExcepcionDNI {
        if (comprobarDNI(dni)) this.dni=dni;
        else throw new ExcepcionDNI();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    private boolean comprobarDNI(String nif) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        //La letra correspondiente será el resto de la división del número del DNI entre las 23 posibilidades que hay
        char letra = letras.charAt(Integer.parseInt(nif.substring(0,8)) % letras.length());
        if (nif.charAt(8)==letra){
            return true;
        }
        else return false;
    }
}
