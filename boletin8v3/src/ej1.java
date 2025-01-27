import java.util.Arrays;

public class ej1 {
    public static void main(String[] args){
        System.out.println(Arrays.toString(DIvidirPalabra("frigorifico", 5)));
    }

    private static String[] DIvidirPalabra(String palabra, int i) {
        int sec = palabra.length()-(i-1);
        String [] palabras = new String[sec];
        for (int j=0;j<sec;j++){
            palabras[j] = palabra.substring(j,j+i);
        }

        return palabras;
    }
}
