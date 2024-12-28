public class ej5 {
    public static void main(String[]args){
        String frase= "java java java";
        int vocales=0, consonantes=0;
        for (int i=0;i<frase.length();i++){
            switch (frase.charAt(i)){
                case 'a': case 'e': case 'i': case 'u': case 'o': {
                    vocales++;
                }
                case ' ':break;
                default: consonantes++;
            }
        }
        System.out.println(frase + " Tiene " + vocales + " vocales y " + consonantes + " consonantes");
    }
}
