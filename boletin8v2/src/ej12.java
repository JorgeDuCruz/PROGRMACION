public class ej12 {
    public static void main(String[]args){
        String texto = "Una mañana muy tarde en la noche  supercali";
        AnalisisTexto(texto);
    }

    private static void AnalisisTexto(String texto) {
        int palabras=0,caracteres=0,tamPalabra=0,tamPalabraMasLarga=0;
        String palabraMasLarga=null;
        texto=texto+" ";
        if (!(texto.isBlank())){
            for (int i=0;i<texto.length();i++){
                if (texto.charAt(i)==' ' && !(texto.charAt(i-1)== ' ')){
                    palabras++;
                }
                if (!(texto.charAt(i)==' ')){
                    caracteres++;
                }
                tamPalabra = (texto.indexOf(" ",i)-(texto.indexOf(" ",i-2)));
                if ((tamPalabra>tamPalabraMasLarga)){
                    tamPalabraMasLarga = tamPalabra;
                    palabraMasLarga = texto.substring(texto.indexOf(" ",i-1)+1,(texto.indexOf(" ",i)));
                }

            }
        }
        System.out.println("Palabras: "+palabras+"\nCaracteres: "+caracteres+"\nLa palabra más larga es: \""+palabraMasLarga+"\"");
    }
}
