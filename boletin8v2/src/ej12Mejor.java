public class ej12Mejor {
    public static void main(String[]args){
        String texto = "Una mañana muy tarde en la noche     supercali";
        AnalisisTexto(texto);
    }

    private static void AnalisisTexto(String texto) {
        while (texto.contains("  ")){
            texto = texto.replace("  "," ");
        }
        String [] palabras = texto.split(" ");
        int palabrasCont =0,caracteres=0;
        String palabraMasLarga=palabras[0];

        for (int i =0; i<palabras.length;i++){
            if (palabras[i].length()>palabraMasLarga.length()){
                palabraMasLarga=palabras[i];
            }
        }
        palabrasCont = palabras.length;
        caracteres = texto.replace(" ","").length();

        System.out.println("Palabras: "+ palabrasCont +"\nCaracteres: "+caracteres+"\nLa palabra más larga es: \""+palabraMasLarga+"\"");
    }
}
