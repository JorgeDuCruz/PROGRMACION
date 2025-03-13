package B10Ej2SoloInterface;
import Datas.Data;

public class SociosIN extends MembroAsociacionIN implements CalculoGastosIngresosIN {

    private String direccion;
    private String provincia;
    private Data dataAlta;
    private double cuota;

    public SociosIN(String dni, String nome, double cuota, Data dataAlta, String direccion, String provincia) {
        super(dni, nome);
        setCuota(cuota);
        setDataAlta(dataAlta);
        setDireccion(direccion);
        setProvincia(provincia);
    }

    public String aCadea() {
        return super.aCadea()+"\nDireccion: "+direccion+"\nProvincia: "+provincia+"\nData de alta: "+dataAlta+"\nCuota: "+cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = Math.abs(cuota);
    }

    public void setDataAlta(Data dataAlta) {
        this.dataAlta = dataAlta;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getCuota() {
        return cuota;
    }

    public String getDataAlta() {
        return dataAlta.toString();
    }

    public String getDireccion() {
        return direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    @Override
    public double gastosINgresos() {
        return getCuota();
    }
}
