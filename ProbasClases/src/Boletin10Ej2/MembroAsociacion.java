package Boletin10Ej2;

public abstract class MembroAsociacion {
    private String dni;
    private String nome;

    public MembroAsociacion(String dni, String nome) {
        this.dni = dni;
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public String getNome() {
        return nome;
    }

    public abstract String aCadea();
}
