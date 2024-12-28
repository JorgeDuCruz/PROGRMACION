public class ej4 {
    public static void main(String[] args){
        String frase = "James Gosling Created Java";
        for (int i=0;i<frase.length();i++){
            if (' '==frase.charAt(i)) continue;
            System.out.print(frase.charAt(i));
        }
    }
}
