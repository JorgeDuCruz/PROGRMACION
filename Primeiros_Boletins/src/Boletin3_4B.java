
import java.util.Scanner;

public class Boletin3_4B {
    public static void main(String[]args){
        String nome1;
        float peso1,pesoM;
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
        if (peso1 == peso2) {
            System.out.println(nome1+" y "+nome2+" son del mismo peso");
        }
        else {
            pesoM = (peso1>peso2) ? peso1:peso2;
            nome1 = (peso1>peso2) ? nome1:nome2;
            peso2 = (peso1<peso2)? peso1:peso2;

            System.out.println(nome1+" es el más pesado con "+pesoM+"Kg");
            System.out.println("La diferencia de peso es de "+(pesoM-peso2));
        }
    }
}
