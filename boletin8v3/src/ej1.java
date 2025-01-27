import java.util.Arrays;

public class ej1 {
    public static void main(String[] args){
        System.out.println(Arrays.toString(DIvidirPalabra("frigorifico", 5)));
    }

    private static String[] DIvidirPalabra(String palabra, int i) {
        String [] palabras = new String[palabra.length()-(i-1)];
        for (int j=0;j<palabra.length()-(i-1);j++){
            palabras[j] = palabra.substring(j,j+i);
        }

        return palabras;
    }
}
