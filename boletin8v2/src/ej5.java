public class ej5 {
    public static void main(String[] args) {
        System.out.println(PrimeraLetra("Universal serial bus"));
        System.out.println(PrimeraMayus("republica argetina"));
    }

    private static String PrimeraMayus(String cadena) {
        String cambio = "";
        String[] palabras = cadena.split(" ");
        for (int i=0;i<palabras.length;i++){
            cambio = cambio+Character.toUpperCase(palabras[i].charAt(0))+palabras[i].substring(1)+" ";
        }
        return cambio;
    }

    private static String PrimeraLetra(String cadena) {
        String siglas = "";
        String[] palabras = cadena.split(" ");
        for (int i=0;i<palabras.length;i++){
            siglas = siglas+String.valueOf(Character.toUpperCase(palabras[i].charAt(0)));
        }
        return siglas;
    }


}
