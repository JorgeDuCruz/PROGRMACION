public class ej5 {
    public static void main(String[] args) {
        System.out.println(PrimeraLetra("Universal serial bus"));
        System.out.println(PrimeraMayus("republica argetina"));
        System.out.println(PalbrasPorA("Antes de abrir"));
    }

    private static String PalbrasPorA(String cadena) {
        String palabrasPorA = "";
        String[] palabras = cadena.split(" ");
        for (String palabra:palabras){
            if (palabra.charAt(0)=='a' || palabra.charAt(0)=='A'){
                palabrasPorA=palabrasPorA+palabra+" ";
            }
        }
        return palabrasPorA;
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
