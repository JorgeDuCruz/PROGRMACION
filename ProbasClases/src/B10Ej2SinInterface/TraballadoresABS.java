package B10Ej2SinInterface;

import Datas.Data;

public abstract class TraballadoresABS extends MembroAsociacionABS {
    private Data dataIngreso;

    public TraballadoresABS(String dni, String nome, Data dataIngreso) {
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
