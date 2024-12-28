public class ej6 {
    public static  void main(String[] args){
        String frase="www. javadende0. com", mitad1="", mitad2="";
        int letra = 0;
        do {
            mitad1 = anhadirLetra(mitad1,frase.charAt(letra));
            letra++;
        }while (!mitad1.equals("www. java"));
        for (;letra<frase.length();letra++){
            mitad2= anhadirLetra(mitad2,frase.charAt(letra));
        }
        System.out.println(mitad1 + " \b" +mitad2);
    }

    private static String anhadirLetra(String fraseOri, char c) {
        String frase = fraseOri + c ;
        return frase;
    }
}
