public class ej5 {
    public static void main(String[] args) {
        System.out.println(PrimeraLetra("Universal serial bus"));
        System.out.println(PrimeraMayus("republica argetina"));
    }

    private static String PrimeraMayus(String cadena) {
        String cambio = "";
        String[] palabras = cadena.split(" ");
        for (String palabra : palabras) {
            cambio = cambio + Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1) + " ";
        }
        return cambio;
    }

    private static String PrimeraLetra(String cadena) {
        String siglas = "";
        String[] palabras = cadena.split(" ");
        for (String palabra : palabras) {
            siglas = siglas + Character.toUpperCase(palabra.charAt(0));
        }
        return siglas;
    }


}
