public class ej9 {
    public static void main(String[] args) {
        System.out.println(Reemplazar("Cadena de Ejemplo",'e'));
        System.out.println(Remaracar("Cadena de Ejemplo",'e'));
    }

    private static String Remaracar(String cadena, char remplazo) {
        String cad = cadena.replace(String.valueOf(remplazo),"-"+remplazo+"-");
        return cad;
    }

    private static String Reemplazar(String cadena, char remplazo) {
        String cad = "";
        for (int i=0;i<cadena.length();i++){
            cad = cad+remplazo;
        }
        return cad;
    }
}
