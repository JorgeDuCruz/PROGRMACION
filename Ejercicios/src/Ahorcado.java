import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args){
        String palabra;
        String letrasDescubiertas ="", adivinacion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("introduce una plabra (La palabra debe tener más de una letra)");
            palabra= sc.next();

        }while (palabra.isBlank() || palabra.length()==1);

        palabra = palabra.toUpperCase();

        char [] desglose = palabra.toCharArray();

        int intentos = 7;

        do {
            mostrarPalabra(desglose,letrasDescubiertas.toUpperCase());

            System.out.println("Dime una letra o la palabra");

            adivinacion = sc.next().toUpperCase();

            if (adivinacion.length() == 1) {

                letrasDescubiertas = letrasDescubiertas + adivinacion;
            }
            else if (adivinacion.equals(palabra)) {
                System.out.println("Ganaste la palabra era: " + palabra);
                break;
            }
            intentos--;

            System.out.println("Tienes "+intentos+" intentos restantes");

        }while (intentos>0);

        sc.close();

    }

    private static void mostrarPalabra(char [] palabra, String letras) {
        for (int i =0;i<palabra.length;i++){

            if (letras.contains(""+palabra[i] )|| !Character.isLetter(palabra[i])){

                System.out.print(palabra[i]);
            }
            else System.out.print("_");
        }
        System.out.println();

    }

}
