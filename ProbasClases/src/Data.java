public class Data {
    private int dia;
    private int mes;
    private int ano;
    //MAIN
    public static void main(String[] args) {
        Data data1 = new Data(29,12,2001);
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
    public boolean dataIgual(Data data2){
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
        else dia++;
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
        if (yy>0 && yy<10) data=(dia+"/"+mes+"/0"+yy);
        else if (yy!=0) data=(dia+"/"+mes+"/"+yy);
        else data=(dia+"/"+mes+"/"+ano);
        return data;
    }

    private boolean isBIsiesto(){
       boolean bisietso = (ano%4==0 && ano%100!=0 || ano%400==0);
       return bisietso;
    }
    //SETTERS

    public void setDia(int dia) {
        int[] limites ={31,28,31,30,31,30,31,31,30,31,30,31};
        if (isBIsiesto()){
            limites[1]=29;
        }
        if (dia>0 && dia<=limites[mes-1]){
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
            setAno(ano+1);
        }
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
