import java.util.Scanner;

/**
 * Este código te pide hora y minuto de dos instantes distintos y te devuelve la dirferencia entre ellos en minutos
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class ej5 {
    public static void main(String[]args){
        int horaI,horaF,minI,minF,diferencia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las horas y minutos del primer momento");
        System.out.println("horas:");
        horaI= sc.nextInt();
        System.out.println("minutos:");
        minI= sc.nextInt();
        System.out.println("Ahora dame las horas y minutos del segundo momneto");
        System.out.println("horas:");
        horaF= sc.nextInt();
        System.out.println("minutos:");
        minF= sc.nextInt();
        sc.close();
        diferencia= diferenciaMin(horaI,minI,horaF,minF);
        System.out.println("La diferencia es de "+diferencia+" minutos");
    }
    static int diferenciaMin(int hora1, int min1, int hora2, int min2){
        int res;
        min1= min1+hora1*60;
        min2=min2+hora2*60;
        res=min2-min1;
        if (res<0) res = res*(-1);
        return res;
    }
}
