import java.util.Scanner;

/**
 * Este código te pide dos numeros y te saca por pantalla los numeros entre medias
 * @version 1.1
 * @author Jorge Durán Cruz
 */
public class ej1 {
    public static void main(String[]args){
     intermedio();
    }
    static void intermedio(){
        int min,max,comprobacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        min = sc.nextInt();
        System.out.println("Dime outro número");
        comprobacion = sc.nextInt();
        if(min<comprobacion) { //aqui me aseguro de que la variable min sea realmente el numero mas pequeño
            max=comprobacion;
        }
        else { // en caso de min sea mas grande que el otro numero cambio los valores para que sean correctos
            max = min;
            min=comprobacion;
        }
        System.out.println("Los números comprendidos entre "+min+" y "+max+" son");
        for(min = min+1;min<max;min++){ // aqui se le suma un 1 al numero más bajo para que empiece a contar desde el siguiente y no lo meta en la cuenta
            System.out.println(min);
        }
    }
}
