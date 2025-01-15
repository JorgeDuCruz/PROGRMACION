import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado_Variable {
    public static void main(String[] args){
        //PintarMunheco(7);
        String palabra = ElegirPalabra();
        String descubierto = CambiarPorGuiones(palabra);
        System.out.println(descubierto);
        int intentos = 7;
        Jugar(palabra,descubierto,intentos);
    }

    public static void Jugar(String palabra, String guiones, int intentos) {
        Scanner sc = new Scanner(System.in);

        int indice=-1;
        char[] deslglosePalabra = palabra.toCharArray();
        char[] descubierto = guiones.toCharArray();
        String adivinacion;
        boolean acierto = false;

        do {
            System.out.println("La palabra a adivinar es: "+ Arrays.toString(descubierto));
            System.out.println("Jugador 2, introduce la palabra o letra a adivinar");
            adivinacion = sc.next();
            adivinacion = adivinacion.toUpperCase().trim();
            if (adivinacion.length() > 1) {
                if (adivinacion.equals(palabra)) {
                    System.out.println("Ganaste la palabra era: " + palabra);
                    break;
                } else {
                    System.out.println("No era esa la palabra");
                }
            } else {
                do {
                    indice = palabra.indexOf(adivinacion, indice + 1);
                    if (indice >= 0) {
                        descubierto[indice] = deslglosePalabra[indice];
                        acierto = true;
                    }

                } while (indice >= 0);
            }

            if (Arrays.equals(deslglosePalabra, descubierto)){
                System.out.println("Ganaste");
                break;
            }
            if (acierto){
                acierto = false;
            }
            else {
                intentos--;
            }
            System.out.println("Te quedan "+intentos+" intentos");

        }while (intentos>0);
    }

    private static void PintarMunheco(int ronda){
        String munheco = """
                   ___ ___
                  |       |
                  |       ○
                  |      /|\\
                  |      / \\
                __|__
                """;
        System.out.println(munheco);
    }

    private static String CambiarPorGuiones(String cad) {
        String guiones = "";
        for (int i=0;i<cad.length();i++){
            if (Character.isLetter(cad.charAt(i))){
                guiones = guiones+"_";
            }
            else {
                guiones = guiones+cad.charAt(i);
            }
        }
        return guiones;
    }

    private static String ElegirPalabra() {
        String palabra;
        Scanner escaner = new Scanner(System.in);
        do {
            System.out.println("introduce una plabra (La palabra debe tener más de una letra)");
            palabra= escaner.next();
            palabra = palabra.trim().toUpperCase();

        }while (palabra.isBlank() || palabra.length()==1 || palabra.contains("_"));

        return palabra;
    }
}
