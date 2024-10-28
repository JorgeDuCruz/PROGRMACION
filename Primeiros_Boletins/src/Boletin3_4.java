import java.util.Scanner;
/**
 * Este programa te pide nombre y peso de dos personas
 * luego te indica que persona es más pesada
 * y la diferencia de peso que hay entre ellas
 * En caso de pesar lo mismo tambien lo indica
 */
public class Boletin3_4 {
    public static void main(String[]args){
        String nome1;
        float peso1;
        String nome2;
        float peso2;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el nombre de la primera persona?");
        nome1 = sc.next();
        System.out.println("¿Y su peso?");
        peso1 = sc.nextFloat();
        System.out.println("¿Cual es el nombre de la segunda persona?");
        nome2 = sc.next();
        System.out.println("¿Y su peso?");
        peso2 = sc.nextFloat();
        sc.close();
        if(peso1>peso2){
            System.out.println(nome1+" es el más pesado con "+ peso1+"Kg");
            System.out.println("La diferencia de peso es de "+(peso1-peso2));
        }
        else {
            if (peso1 == peso2) {
                System.out.println(nome1+" y "+nome2+" son del mismo peso");
            }
            else {
                System.out.println(nome2 + " es el más pesado con " + peso2 + "Kg");
                System.out.println("La diferencia de peso es de " + (peso2 - peso1));
            }
        }
    }
}
