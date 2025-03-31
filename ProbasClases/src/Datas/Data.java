package Datas;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    //MAIN
    public static void main(String[] args) {
        try {
            Data data1 = new Data(29,12,2001);
        }catch (ExcepcionDiaIncorrecto | ExcepcionMesIncorrecto | ExcepcionAnoIncorrecto e){
            System.out.println(e.getMessage());
        }
    }
    //CONSTRUCTORES

    public Data(int dia, int mes, int ano) throws ExcepcionDiaIncorrecto, ExcepcionMesIncorrecto, ExcepcionAnoIncorrecto {
        setMes(mes);
        setAno(ano);
        setDia(dia);
    }

    public Data(int dia, int mes) throws ExcepcionDiaIncorrecto, ExcepcionMesIncorrecto {
        setMes(mes);
        ano=2025;
        setDia(dia);
    }

    public Data(String data) throws ExcepcionDiaIncorrecto, ExcepcionMesIncorrecto, ExcepcionAnoIncorrecto {
        setData(data);
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

    public String incrementarDia(int dias) throws ExcepcionMesIncorrecto, ExcepcionAnoIncorrecto {
        if (dia+dias>diaLimite()) { //si el dia esta en el limite cambia de mes
            dia = dias+dia-diaLimite();
            incrementarMes();
            if (dia>diaLimite())incrementarDia(0);
        }
        else dia=dias+dia;
        return toString();
    }

    public void incrementarMes() throws ExcepcionMesIncorrecto, ExcepcionAnoIncorrecto {
        if (mes==12){
            setMes(1);
            setAno(ano+1);
        }
        else setMes(mes+1);
    }

    public void incrementarAno() throws ExcepcionAnoIncorrecto {
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

    private String[] comprobarData(String[] fecha) {
        String numero="";
        String[] retorno = {"1","1","1970"};
        for (int i=0;i<fecha.length;i++){
            for (int num =0;num<fecha[i].length();num++){
                if (Character.isDigit(fecha[i].charAt(num))){
                    numero=numero+fecha[i].charAt(num);
                }else {
                    return retorno;
                }
            }
            fecha[i]=numero;
            numero="";
        }
        return fecha;
    }
    //SETTERS

    public void setDia(int dia) throws ExcepcionDiaIncorrecto {
        if (dia>0 && dia<=diaLimite()){
            this.dia=dia;
        }
        else throw new ExcepcionDiaIncorrecto();
    }

    public void setMes(int mes) throws ExcepcionMesIncorrecto {
        if (mes<13 && mes>0){
            this.mes = mes;
        }
        else throw new ExcepcionMesIncorrecto();
    }

    public void setAno(int ano) throws ExcepcionAnoIncorrecto {
        if (ano>-1) this.ano = ano;
        else throw new ExcepcionAnoIncorrecto();
    }

    private void setData(String data) throws ExcepcionDiaIncorrecto, ExcepcionMesIncorrecto, ExcepcionAnoIncorrecto {
        String[] fecha = new String[3];
        if (data.contains("-")){
            fecha=data.split("-");
            fecha=comprobarData(fecha);
        } else if (data.contains("/")) {
            fecha=data.split("/");
            fecha=comprobarData(fecha);
        }else {
            System.out.println("Formato de fecha invalido, establecida fecha 1-1-1970");
            fecha[0]="1";
            fecha[1]="2";
            fecha[2]="1970";
        }
        setMes(Integer.parseInt(fecha[1]));
        setDia(Integer.parseInt(fecha[0]));
        setAno(Integer.parseInt(fecha[2]));
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
