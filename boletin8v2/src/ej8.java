public class ej8 {
    public static void main(String[] args) {
        System.out.println(BinarioADecimal("001001110"));
    }

    private static int BinarioADecimal(String binario) {
        int decimal = 0,exponente=0;
        for (int i=0;i<binario.length();i++){
            exponente=binario.length()-1-i;
            decimal= (int) (decimal+Integer.parseInt(Character.toString(binario.charAt(i)))*Math.pow(2,exponente));
        }
        return decimal;
    }
}
