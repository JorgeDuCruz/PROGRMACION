public class ej2 {
    public static void main(String[] args){
        String cadena = "hola jejej";
        char separador = ',';

        System.out.println(Separar(cadena,separador));

        separador ='_';

        System.out.println(Remplazar(cadena,separador));

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
    static String Remplazar(String cadena,char separador){
        cadena = cadena.replace(' ',separador);
        System.out.println(cadena);
        return cadena;
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
