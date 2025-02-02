public class ej6 {
    public static void main(String[] args) {
        System.out.println(Consonates("Logaritmos"));
        System.out.println(Vocales("Logaritmos"));
        System.out.println(VocalSiguiente("vestiario"));
    }

    private static String VocalSiguiente(String cadena) {
        String cambio="";
        for (int i =0;i<cadena.length();i++){
            switch (Character.toLowerCase(cadena.charAt(i))){
                case 'a'->cambio=cambio+'e';
                case 'e'->cambio=cambio+'i';
                case 'i'->cambio=cambio+'o';
                case 'o'->cambio=cambio+'u';
                case 'u'->cambio=cambio+'a';
                default -> cambio=cambio+cadena.charAt(i);
            }
        }
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
