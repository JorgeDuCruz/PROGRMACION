package B10Ej2SoloInterface;

import Datas.Data;

public class AsalariadosIN extends TraballadoresIN implements CalculoGastosIngresosIN {
    private double soldo;
    private String cargo;
    private int ss;
    private int irpf;

    public AsalariadosIN(String dni, String nome, Data dataIngreso, String cargo, int irpf, double soldo, int ss) {
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
        return super.aCadea()+"\nSoldo: "+soldo+"\nCargo"+cargo+"\nSeguridad Social: "+ss+"\nIRPF: "+irpf;
    }

    @Override
    public double gastosINgresos() {
        return -(soldo+soldo*0.15);
    }
}
