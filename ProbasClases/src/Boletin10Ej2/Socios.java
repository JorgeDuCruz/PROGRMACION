package Boletin10Ej2;
import Datas.Data;

public class Socios extends MembroAsociacion implements CalculoGastosIngresos{

    private String direccion;
    private String provincia;
    private Data dataAlta;
    private double cuota;

    public Socios(String dni, String nome, double cuota, Data dataAlta, String direccion, String provincia) {
        super(dni, nome);
        setCuota(cuota);
        setDataAlta(dataAlta);
        setDireccion(direccion);
        setProvincia(provincia);
    }

    public String aCadea() {
        return "Socio "+getNome()+" co DNI "+getDni()+" da provincia "+getProvincia()+" de direccion "+getDireccion()+" dado de alta "+getDataAlta()+ " paga "+getCuota()+"€ al mes";
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
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
