package B10Ej2SinInterface;

import Datas.Data;

public class AsalariadosABS extends TraballadoresABS {
    private double soldo;
    private String cargo;
    private int ss;
    private int irpf;

    public AsalariadosABS(String dni, String nome, Data dataIngreso, String cargo, int irpf, double soldo, int ss) {
        super(dni, nome, dataIngreso);
        setCargo(cargo);
        setIrpf(irpf);
        setSoldo(soldo);
        setSs(ss);
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setIrpf(int irpf) {
        this.irpf = Math.abs(irpf);
    }

    public void setSoldo(double soldo) {
        this.soldo = Math.abs(soldo);
    }

    public void setSs(int ss) {
        this.ss = Math.abs(ss);
    }

    @Override
    public String aCadea() {
        return "Traballador "+getNome()+" con DNI "+getDni()+" contratado o "+getDataIngreso()+" con soldo de "+soldo+"€ encargado de "+cargo+" ten una seguridad social del "+ss+"% e un IRPF del "+irpf+"%";
    }

    @Override
    public double gastosINgresos() {
        return -(soldo+soldo*0.15);
    }
}
