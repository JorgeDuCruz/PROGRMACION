import java.util.Scanner;
public class ej3 {
    public static void main(String[]args){
        int base,altura;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dame la base del rectángulo en metros (recuerda que tiene que ser positiva)");
            base = sc.nextInt();
        }while (base<0);
        do {
            System.out.println("Dame la altura del rectángulo e metros(recuerda que tiene que ser positiva)");
            altura = sc.nextInt();
        }while (altura<0);
        System.out.println("El área del ractángulo es "+ base*altura+" m²");
    }
}
