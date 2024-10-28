import java.util.Scanner;

/**
 * Este programa te pide 3 números que asume distintos
 * y luego los ordena de mayor a menor
 */
public class Boletin3_5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Los números tienen que ser distintos"); // Aqui la línea de confianza en el usuario
        System.out.println("¿Cual es el primer número?");
        n1 = sc.nextDouble();
        System.out.println("¿Cual es el segundo número?");
        n2 = sc.nextDouble();
        System.out.println("¿Cual es el tercer número?");
        n3 = sc.nextDouble();
        if (n1>n2){
            if(n1>n3){
                if(n3>n2){
                    System.out.println(n1+">"+n3+">"+n2);
                }
                else{
                    System.out.println(n1+">"+n2+">"+n3);
                }
            }
            else{
                System.out.println(n3+">"+n1+">"+n2);
            }
        }
        else {
            if(n2>n3){
                if(n1>n3){
                    System.out.println(n2+">"+n1+">"+n3);
                }
                else{
                    System.out.println(n2+">"+n3+">"+n1);
                }
            }
            else{
                System.out.println(n3+">"+n2+">"+n1);
            }
        }
    }
}
