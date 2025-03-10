package Boletin10Ej2;

import java.util.Date;

public class Socios extends MembroAsociacion implements CalculoGastosIngresos{

    private String direccion;
    private String provincia;
    private Date dataAlta;
    private double cuota;

    public Socios(String dni, String nome, double cuota, Date dataAlta, String direccion, String provincia) {
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

    public void setDataAlta(Date dataAlta) {
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
