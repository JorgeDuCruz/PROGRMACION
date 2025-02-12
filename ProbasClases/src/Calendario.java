public class Calendario {
    private int dia;
    private int mes;
    private int ano;
    //MAIN
    public static void main(String[] args) {
        Calendario data1 = new Calendario(26,2,1900);
        data1.mostrarData();
        data1.incrementarDia();
        data1.mostrarData();
        data1.incrementarDia();
        data1.mostrarData();
        data1.incrementarDia();
        data1.mostrarData();
        data1.incrementarDia();
        data1.mostrarData();
    }
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
        if (yy!=0) System.out.println(dia+"/"+mes+"/"+yy);
        else System.out.println(dia+"/"+mes+"/"+ano);
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
        else if (dia==28 && mes ==2 && isBIsiesto()) { //Si no es bisiesto
            dia = 1;
            setMes(mes+1);
        }
        else if (dia==28 && mes ==2) {//Siempre sera bisiesto si llega aqui en febrero
            dia++;
        }
        else if (dia==29 && mes ==2) {
            dia = 1;
            setMes(mes+1);
        }
        else if (dia==31){
            dia=1;
            setMes(mes+1);
        }
        else if (dia==30 && (mes==4 || mes==6 || mes==9 || mes==11)){
            dia =1;
            setMes(mes+1);
        }
    }

    public void incrementarMes(){
        setMes(mes+1);
    }

    public void incrementarAno(){
        setAno(ano+1);
    }

    public String dataToString(){
        int yy = ano%100;
        String data;
        if (yy!=0) data = dia+"/"+mes+"/"+yy;
        else data = (dia+"/"+mes+"/"+ano);
        return data;
    }

    private boolean isBIsiesto(){
       boolean bisietso = !(ano%4!=0 || ano%100==0 && ano%400!=0);
       return bisietso;
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
