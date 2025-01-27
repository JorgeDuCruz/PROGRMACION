public class ej3 {
    public static void main(String[] args){
        String cadena = "hola jejej";
        char separador = ',';
        int limite =2;

        System.out.println(Separar(cadena,separador,limite));

        separador ='_';

        System.out.println(Remplazar(cadena,separador,limite));

        cadena = "qa123jo 4.5,4590";
        separador = 'X';

        System.out.println(QuitarDigito(cadena,separador,limite));

        cadena="25525510026";
        separador ='.';

        System.out.println(Anhadir(cadena,separador,limite));
    }
    static String Separar(String cadena, char separador, int lim){
        StringBuilder cadea = new StringBuilder(cadena);
        for (int i=1;i<cadea.length() && lim>0;i+=2,lim--){
            cadea = new StringBuilder(cadea).insert(i,separador);
        }
        System.out.println(cadea);
        return cadea.toString();
    }
    static String Remplazar(String cadena,char separador, int lim){
        String cad = "";
        for (int i=0;i<cadena.length() && lim>0;i++){
            if (cadena.charAt(i)==' '){
                lim--;
                cad=cad+separador;
            }
            else cad=cad+cadena.charAt(i);

        }
        return cad;
    }
    static String QuitarDigito(String cadena, char separador, int lim){
        String cad = "";
        int i=0;
        for (;i<cadena.length() && lim>0;i++){
            if (Character.isDigit(cadena.charAt(i))){
                lim--;
                cad=cad+separador;
            }
            else cad=cad+cadena.charAt(i);

        }
        cad = cad+cadena.substring(i);
        return cad;
    }
    static String Anhadir(String cadena, char separador, int lim){
        StringBuilder cadea = new StringBuilder(cadena);
        for (int i=3;i<cadea.length() && lim>0;i+=4,lim--){
            cadea = new StringBuilder(cadea).insert(i,separador);
        }
        System.out.println(cadea);
        return cadea.toString();
    }
}
