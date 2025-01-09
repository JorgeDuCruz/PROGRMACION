public class ej2 {
    public static void main(String[] args){
        String cadena = "hola jejej";
        char separador = ',';

        System.out.println(Separar(cadena,separador));

        String remplazo ="\\_";

        System.out.println(Remplazar(cadena,remplazo));

        cadena = "123jo 4.5,4590";
        separador = 'X';

        System.out.println(QuitarDigito(cadena,separador));

        cadena="25525510026";
        separador ='.';

        System.out.println(Anhadir(cadena,separador));
    }
    static String Separar(String cadena, char separador){
        StringBuilder cadea = new StringBuilder(cadena);
        for (int i=1;i<cadea.length();i+=2){
            cadea = new StringBuilder(cadea).insert(i,separador);
        }
        System.out.println(cadea);
        return cadea.toString();
    }
    static String Remplazar(String cadena,String rem){
        String cad ="";
        int inicio=0,limite = cadena.indexOf(' ');
        while(limite!=-1){
            cad=cad+cadena.substring(inicio,limite)+rem;
            inicio=limite+1;
            limite=cadena.indexOf(' ',limite+1);
        }
        cad = cad+cadena.substring(inicio);
        return cad;
    }
    static String QuitarDigito(String cadena, char separador){
        for (int i=0;i<10;i++){
            char numero = Integer.toString(i).charAt(0);
            cadena = cadena.replace(numero,separador);
        }
        System.out.println(cadena);
        return cadena;
    }
    static String Anhadir(String cadena, char separador){
        StringBuilder cadea = new StringBuilder(cadena);
        for (int i=3;i<cadea.length();i+=4){
            cadea = new StringBuilder(cadea).insert(i,separador);
        }
        System.out.println(cadea);
        return cadea.toString();
    }
}
