package B10Ej2SoloInterface;

import Datas.Data;

public class Traballadores extends MembroAsociacion {
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

    @Override
    public String aCadea() {
        return super.aCadea()+"\nData de ingreso: "+dataIngreso;
    }
}
