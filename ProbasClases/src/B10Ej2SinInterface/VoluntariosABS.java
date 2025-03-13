package B10Ej2SinInterface;

import Datas.Data;

public class VoluntariosABS extends TraballadoresABS {
    private int edade;
    private String profesion;
    private int horas;
    private String trabajo;

    public VoluntariosABS(String dni, String nome, Data dataIngreso, int edade, int horas, String profesion, String trabajo) {
        super(dni, nome, dataIngreso);
        setEdade(edade);
        setHoras(horas);
        setProfesion(profesion);
        setTrabajo(trabajo);
    }

    public void setEdade(int edade) {
        this.edade = Math.abs(edade);
    }

    public void setHoras(int horas) {
        this.horas = Math.abs(horas);
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getEdade() {
        return edade;
    }

    public int getHoras() {
        return horas;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getTrabajo() {
        return trabajo;
    }


    public String aCadea() {
        return "Voluntario "+getNome()+" con DNI "+getDni()+" ingreso o "+getDataIngreso()+" con "+getEdade()+" anos de idade, coa profesion de "+getProfesion()+" traballo "+getHoras()+" horas de "+getTrabajo();
    }

    @Override
    public double gastosINgresos() {
        return -3;
    }
}
