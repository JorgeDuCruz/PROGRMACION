import java.util.Scanner;

/**
 * Este programa te pide dos números para devolverte su suma
 * en caso de que el primero sea mayor o igual al segundo
 * tambien te devulve el primero menos el segundo
 */
public class Boletin3_2 {
    public static void main(String[]args){
        short n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el primer número?");
        n1 = sc.nextShort();
        System.out.println("¿Cual es segundo número?");
        n2 = sc.nextShort();
        sc.close();
        if (n1>=n2)
            System.out.println(n1-n2);
        System.out.println(n1+n2);
    }
}
