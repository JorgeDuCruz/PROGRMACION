import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        numero= sc.nextInt();
        for(int factorial=numero-1;factorial > 0;factorial--){
            numero = numero * factorial;
        }
        System.out.println("El factorial de tu número es "+numero);
    }
}
