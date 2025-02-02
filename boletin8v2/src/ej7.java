public class ej7 {
    public static void main(String[] args) {
        System.out.println(IsSubCadea("subcadea","cadea"));
    }

    private static boolean IsSubCadea(String cadena, String subcadena) {
        boolean contenida = false;
        if (cadena.contains(subcadena)){
            contenida=true;
        }

        return contenida;
    }
}
