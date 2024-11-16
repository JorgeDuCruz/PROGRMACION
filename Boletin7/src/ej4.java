import java.util.Scanner;

/**
 * Este codigo te pide tu numero de DNI y te devuelve la letra correspondiente
 * @author Jorge Duran Cruz
 * @version 1.0
 */
public class ej4 {
    public static void main(String[]args){
        char[] letra={
                'T','R','W','A','G','M','Y','F','P','D',
                'X','B','N','J','Z','S','Q','V','H','L',
                'C','K','E'
        };
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu numero de DNI");
        int dni= sc.nextInt();
        sc.close();
        dni=dni%23;
        System.out.println("La letra que corresponde es "+letra[dni]);
    }
}
