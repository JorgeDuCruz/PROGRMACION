
public class Ejercicio_1 {
    public static void main(String[] args) {
        byte x= (byte)128;
        short y = 128;
        System.out.println(x);
        System.out.println((byte)y);
        byte z =127;
        z++;
        System.out.println(z);
        z++;
        System.out.println(z);
        z = 127;
        z = (byte) (z+128);
        System.out.println(z);
    }
}
