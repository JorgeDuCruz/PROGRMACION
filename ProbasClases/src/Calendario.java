public class Calendario {
    private int dia;
    private int mes;
    private int ano;

    //CONSTRUCTORES

    public Calendario(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public Calendario(int dia, int mes) {
        setDia(dia);
        setMes(mes);
        ano=2025;
    }

    public Calendario() {
        dia=1;
        mes=1;
        ano=2025;
    }

    //METODOS
    public void mostrarData(){
        int yy = ano%100;
        System.out.println(dia+"/"+mes+"/"+yy);
    }
    public boolean dataIgual(Calendario data2){
        boolean iguais = dia == data2.getDia();
        iguais = iguais && mes == data2.getMes();
        iguais = iguais &&  ano== data2.getAno();
        return iguais;
    }

    public void incrementarDia(){
        if (dia<28){
            dia++;
        }
        else if (dia==28 && mes ==2 && (ano%4!=0 || ano%400==0)) {
            dia = 1;
            setMes(mes++);
        }
        else if (dia==28 && mes ==2 && (ano%4==0 && ano%400!=0)) {
            dia++;
        }
        else if (dia==29 && mes ==2) {
            dia = 1;
            setMes(mes++);
        }
        else if (dia==31){
            dia=1;
            setMes(mes++);
        }
        else if (dia==30 && (mes==4 || mes==6 || mes==9 || mes==11)){
            dia =1;
            setMes(mes++);
        }
    }
    public void incrementarMes(){
        setMes(mes++);
    }
    public void incrementarAno(){
        setAno(ano++);
    }

    //SETTERS

    public void setDia(int dia) {
        if (dia<31 && dia>0){
            this.dia=dia;
        }
        else this.dia=1;
    }

    public void setMes(int mes) {
        if (mes<13 && mes>0){
            this.mes = mes;
        }
        else if (mes>12){
            this.mes = mes-((mes/12)*12);
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //GETTERS

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
