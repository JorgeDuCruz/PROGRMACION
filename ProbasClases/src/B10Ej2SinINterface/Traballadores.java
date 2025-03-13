package B10Ej2SinINterface;

import Datas.Data;

public abstract class Traballadores extends MembroAsociacion {
    private Data dataIngreso;

    public Traballadores(String dni, String nome, Data dataIngreso) {
        super(dni, nome);
        setDataIngreso(dataIngreso);
    }

    public String getDataIngreso() {
        return dataIngreso.toString();
    }

    public void setDataIngreso(Data dataIngreso) {
        this.dataIngreso = dataIngreso;
    }
}
