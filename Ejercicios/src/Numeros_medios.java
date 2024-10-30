import java.util.Scanner;

/**
 * Este código te pide dos numeros y te saca por pantalla los numeros entre medias
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class Numeros_medios {
    public static void main(String[] args){
        intermedio();
    }
    static void intermedio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o número mais baixo");
        int min = sc.nextInt();
        System.out.println("Dime o número mais alto");
        int max = sc.nextInt();
        for(min = min+1;min<max;min++){ // aqui se le suma un 1 al numero más bajo para que empiece a contar desde el siguiente y no lo meta en la cuenta
            System.out.println(min);
        }
    }
}
