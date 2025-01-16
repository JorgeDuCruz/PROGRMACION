import java.util.Scanner;

public class Ahorcado_SubString {
    public static void main(String[] args){
        String palabra = ElegirPalabra();
        String descubierto = CambiarPorGuiones(palabra);
        System.out.println(descubierto);
        int intentos = 7;
        Jugar(palabra,descubierto,intentos);
    }

    public static void Jugar(String palabra, String guiones, int intentos) {
        Scanner sc = new Scanner(System.in);

        int indice=-1;
        String adivinacion;
        boolean acierto = false;

        do {
            System.out.println("La palabra a adivinar es: "+ guiones);
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
                    if (indice >=0) {
                        guiones = guiones.substring(0,indice)+adivinacion+guiones.substring(indice+1);
                        acierto = true;
                    }

                } while (indice >= 0);
            }

            if (guiones.equals(palabra)){
                System.out.println("Ganaste la palabra era: " + palabra);
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
