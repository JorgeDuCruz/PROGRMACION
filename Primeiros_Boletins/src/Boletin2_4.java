/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge Durán Cruz
 */
import java.util.Scanner;
public class Boletin2_4 {
    public static void main(String[] args) {
        float n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el primer número?");
        n1 = sc.nextFloat();
        System.out.println("¿Cual es el segundo núimero?");
        n2 = sc.nextFloat();
        System.out.println(n1+"+"+n2+"="+(n1+n2));
        System.out.println(n1+"-"+n2+"="+(n1-n2));
        System.out.println(n1+"*"+n2+"="+n1*n2);
        System.out.println(n1+"/"+n2+"="+n1/n2);
    }
}
