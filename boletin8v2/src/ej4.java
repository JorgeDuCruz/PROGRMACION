public class ej4 {
    public static void main(String[] args) {
        System.out.println(DividirMiles(1234567890));
    }

    private static String DividirMiles(int numero) {
        StringBuilder division = new StringBuilder(String.valueOf(numero));
        division.reverse();
        for (int i=3;i<division.length();i+=4){
            division = new StringBuilder(division).insert(i,".");
        }
        division.reverse();
        return  String.valueOf(division);
    }
}
