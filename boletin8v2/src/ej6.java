public class ej6 {
    public static void main(String[] args) {
        System.out.println(Consonates("Logaritmos"));
        System.out.println(Vocales("Logaritmos"));
        System.out.println(VocalSiguiente("vestiario"));
    }

    private static String VocalSiguiente(String cadena) {
        String cambio="";

        return cambio;
    }

    private static String Vocales(String cadena) {
        String vocales = "";
        for (int i =0;i<cadena.length();i++){
            if (Character.toLowerCase(cadena.charAt(i))=='a' || Character.toLowerCase(cadena.charAt(i))=='e' ||Character.toLowerCase(cadena.charAt(i))=='i' ||Character.toLowerCase(cadena.charAt(i))=='o' || Character.toLowerCase(cadena.charAt(i))=='u'){
                vocales = vocales+cadena.charAt(i);
            }
        }
        return vocales;
    }

    private static String Consonates(String cadena) {
        String consonates = "";
        for (int i =0;i<cadena.length();i++){
            if (Character.toLowerCase(cadena.charAt(i))=='a' || Character.toLowerCase(cadena.charAt(i))=='e' ||Character.toLowerCase(cadena.charAt(i))=='i' ||Character.toLowerCase(cadena.charAt(i))=='o' || Character.toLowerCase(cadena.charAt(i))=='u'){

            }
            else {
                consonates=consonates+cadena.charAt(i);
            }

        }
        return consonates;
    }
}
