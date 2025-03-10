package Boletin10Ej2;

public abstract class Traballadores extends MembroAsociacion{
    private String dataIngreso;

    public Traballadores(String dni, String nome, String dataIngreso) {
        super(dni, nome);
        setDataIngreso(dataIngreso);
    }

    public String getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(String dataIngreso) {
        this.dataIngreso = dataIngreso;
    }
}
