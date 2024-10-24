import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dime un número (presiona 0 para terminar el programa)");
            numero = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * numero);
            }
        }while (numero!=0);
        sc.close();
    }
}

