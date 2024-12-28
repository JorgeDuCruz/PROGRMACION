public class ej11 {
    public static void main(String[]args){
        String frase = "Ola, son alumno de DAM1, e son programador desde o 2024";
        int letras = 0, espacios = 0,digitos = 0, signos = 0;
        for (int i = 0; i<frase.length();i++){
            char letra = frase.charAt(i);
            if (letra == ' '){
                espacios++;
            } else if (Character.isDigit(letra)) {
                digitos++;
            }else if (letra >= 'a' && letra <= 'z' || letra >= 'A' && letra <= 'Z' ){
                letras++;
            }else {
                signos++;
            }
        }
        System.out.println(frase.length());
        System.out.println("Letras: "+letras+ " \nEspacios en blanco: "+espacios+"\nNúmeros: "+digitos+ "\nSignos de puntuación: "+signos);
    }
}
