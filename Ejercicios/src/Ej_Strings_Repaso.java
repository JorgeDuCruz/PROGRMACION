public class Ej_Strings_Repaso {
    public static void main(String[] args){
        System.out.println(DIvidirPalabra("frigorifico",5));
    }

    private static String DIvidirPalabra(String palabra, int i) {
        String palabras=palabra.substring(0,i);
        for (int j=1;j<palabra.length()-(i-1);j++){
            palabras = palabras+","+palabra.substring(j,j+i);
        }

        return palabras+".";
    }
}
