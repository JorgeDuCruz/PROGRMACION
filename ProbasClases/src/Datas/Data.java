package Datas;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    //MAIN
    public static void main(String[] args) {
        Data data1 = new Data(29,12,2001);
    }
    //CONSTRUCTORES

    public Data(int dia, int mes, int ano) {
        setMes(mes);
        setAno(ano);
        setDia(dia);
    }

    public Data(int dia, int mes) {
        setMes(mes);
        ano=2025;
        setDia(dia);
    }

    public Data() {
        dia=1;
        mes=1;
        ano=2025;
    }

    //METODOS
    public void mostrarData(){
        int yy = ano%100;
        if (yy>0 && yy<10) System.out.println(dia+"/"+mes+"/0"+yy);
        else if (yy!=0) System.out.println(dia+"/"+mes+"/"+yy);
        else System.out.println(dia+"/"+mes+"/"+ano);
    }
    public boolean equals(Data data2){
        boolean iguais = dia == data2.getDia();
        iguais = iguais && mes == data2.getMes();
        iguais = iguais &&  ano== data2.getAno();
        return iguais;
    }

    public String incrementarDia(int dias){
        if (dia+dias>diaLimite()) { //si el dia esta en el limite cambia de mes
            dia = dias+dia-diaLimite();
            incrementarMes();
            if (dia>diaLimite())incrementarDia(0);
        }
        else dia=dias+dia;
        return toString();
    }

    public void incrementarMes(){
        if (mes==12){
            setMes(1);
            setAno(ano+1);
        }
        else setMes(mes+1);
    }

    public void incrementarAno(){
        setAno(ano+1);
    }

    public String toString(){
        String data=(dia+"/"+mes+"/"+ano);
        return data;
    }

    private boolean isBIsiesto(){
       boolean bisietso = (ano%4==0 && ano%100!=0 || ano%400==0);
       return bisietso;
    }
    private int diaLimite(){
        int[] limites ={31,28,31,30,31,30,31,31,30,31,30,31};
        if (isBIsiesto()){
            limites[1]=29;
        }
        return limites[mes-1];
    }
    //SETTERS

    public void setDia(int dia) {
        if (dia>0 && dia<=diaLimite()){
            this.dia=dia;
        }
        else this.dia=1;
    }

    public void setMes(int mes) {
        if (mes<13 && mes>0){
            this.mes = mes;
        }
        else this.mes=1;
    }

    public void setAno(int ano) {
        if (ano>-1) this.ano = ano;
        else this.ano=2025;
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
