package Persoas;

public class ContaCorrente {
    private double saldo;
    private String nomeTitular;
    private String numeroDeConta;
    private String nif;
    private static int contador;

    //SETTERS

    public void setNif(String nif) {
        if (nif.length()==9 && Character.toUpperCase(nif.charAt(8))==calcularLetra(nif)) this.nif = nif;
        else this.nif="00000000A";
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroDeConta(String numeroDeConta) {
        this.numeroDeConta = numeroDeConta;

    }

    public void setSaldo(double saldo) {
        if (saldo>=0) this.saldo = saldo;
        else this.saldo=0;
    }

    //GETTERS

    public String getNif() {
        return nif;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getNumeroDeConta() {
        return numeroDeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getContador() {
        return contador;
    }

    //CONSTRUCTORES

    public ContaCorrente(String nif, String nomeTitular, String numeroDeConta) {
        setNif(nif);
        setNomeTitular(nomeTitular);
        setNumeroDeConta(numeroDeConta);
        setSaldo(0);
        contador++;
    }

    public ContaCorrente(String nif, String nomeTitular, String numeroDeConta, double saldo) {
        setNif(nif);
        setNomeTitular(nomeTitular);
        setNumeroDeConta(numeroDeConta);
        setSaldo(saldo);
        contador++;
    }

    //METODOS
    public boolean sacarDinero(int dinero){
        if (saldo-dinero>=0) {
            setSaldo(saldo-dinero);
            return true;
        }
        else {
            System.out.println("Dinero insuficiente");
            return false;
        }
    }

    public void ingresarDinero(int dinero){
        setSaldo(dinero+saldo);
    }
    public String mostrarInformacion(){
        String info = "Numero de cuneta: "+numeroDeConta+"\nNombre del titular: "+nomeTitular+"\nnif: "+nif+"\nSaldo: "+saldo;
        return info;
    }

    private char calcularLetra(String nif) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        //La letra correspondiente será el resto de la división del número del DNI entre las 23 posibilidades que hay
        char letra = letras.charAt(Integer.parseInt(nif.substring(0,8)) % letras.length());
        return letra;
    }
}
