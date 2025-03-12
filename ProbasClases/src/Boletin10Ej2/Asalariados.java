package Boletin10Ej2;

public class Asalariados extends Traballadores implements CalculoGastosIngresos{
    private double soldo;
    private String cargo;
    private int ss;
    private int irpf;

    public Asalariados(String dni, String nome, String dataIngreso, String cargo, int irpf, double soldo, int ss) {
        super(dni, nome, dataIngreso);
        this.cargo = cargo;
        this.irpf = irpf;
        this.soldo = soldo;
        this.ss = ss;
    }

    @Override
    public String aCadea() {
        return "Traballador "+getNome()+" con DNI "+getDni()+" contratado o "+getDataIngreso()+" con soldo de "+soldo+"€ encargado de "+cargo+" ten una seguridad social "+ss+" e un IRPF "+irpf;
    }

    @Override
    public double gastosINgresos() {
        return -soldo;
    }
}
