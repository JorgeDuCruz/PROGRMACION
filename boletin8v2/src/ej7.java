public class ej7 {
    public static void main(String[] args) {
        System.out.println(IsSubCadea("subcadea","cadea"));
        System.out.println(Primera("kde","Gnome"));
    }

    private static String Primera(String cad1, String cad2) {
        if (cad1.compareToIgnoreCase(cad2)<0){
            return cad1;
        } else if (cad2.compareToIgnoreCase(cad1)<0) {
            return cad2;
        }
        else {
            return "Son la misma palabra";
        }
    }

    private static boolean IsSubCadea(String cadena, String subcadena) {
        boolean contenida = false;
        if (cadena.contains(subcadena)){
            contenida=true;
        }

        return contenida;
    }
}
