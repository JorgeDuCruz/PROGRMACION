/**
 * Este código te pide un número n y te devuelve un triangulo de altura n hecho de *
 * @version 1.0
 * @author Jorge Durán Cruz
 */

import java.util.Scanner;

public class ej7 {
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De cúanta altura quieres el triángulo?");
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
