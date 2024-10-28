
import java.util.Scanner;

/**
 * Este programa te pide un número
 * y te indica si es positivo, negativo o 0
 */
public class Boletin3_3 {
    public static void main(String[]args){
        double num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el número?");
        num1 = sc.nextDouble();
        sc.close();
        if (num1>=0){
            if(num1==0)
                System.out.println(0);
            else
                System.out.println("+");
        }
        else
            System.out.println("-");
    }
}
