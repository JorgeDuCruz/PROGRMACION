package Boletin10Ej2;
import java.util.Date;

public abstract class Traballadores extends MembroAsociacion{
    private Date dataIngreso;

    public Traballadores(String dni, String nome, Date dataIngreso) {
        super(dni, nome);
        setDataIngreso(dataIngreso);
    }

    public String getDataIngreso() {
        return dataIngreso.toString();
    }

    public void setDataIngreso(Date dataIngreso) {
        this.dataIngreso = dataIngreso;
    }
}
