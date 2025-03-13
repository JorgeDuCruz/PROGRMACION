package B10Ej2SinInterface;

public abstract class MembroAsociacion{
    private String dni;
    private String nome;

    public MembroAsociacion(String dni, String nome) {
        setDni(dni);
        setNome(nome);
    }

    public void setDni(String dni) {
        if (dni.length()==9 && Character.toUpperCase(dni.charAt(8))==calcularLetra(dni)) this.dni = dni;
        else this.dni="00000000T";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public String getNome() {
        return nome;
    }

    private char calcularLetra(String nif) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        //La letra correspondiente será el resto de la división del número del DNI entre las 23 posibilidades que hay
        char letra = letras.charAt(Integer.parseInt(nif.substring(0,8)) % letras.length());
        return letra;
    }

    public abstract String aCadea();
    public abstract double gastosINgresos();
}
