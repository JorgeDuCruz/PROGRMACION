public class ej9 {
    public static void main(String[] args) {
        System.out.println(Reemplazar("Cadena de Ejemplo",'e'));
    }

    private static String Reemplazar(String cadena, char remplazo) {
        String cad = "";
        for (int i=0;i<cadena.length();i++){
            cad = cad+remplazo;
        }
        return cad;
    }
}
