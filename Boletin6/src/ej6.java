import java.util.Scanner;

/**
 * Este código te pide 2 numeros y te indica si esos numeros son amigos o no
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class ej6 {
    public static void main(String[]args){
        int a,b,sum1,sum2;
        boolean amigos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer número");
        a = sc.nextInt();
        System.out.println("Dame el segundo número");
        b = sc.nextInt();
        sc.close();
        sum1=sumDivisores(a);
        sum2=sumDivisores(b);
        if (sum1==b && sum2==a) System.out.println(a+" y "+b+" son números amigos");
        else System.out.println(a+" y "+b+" no son números amigos");
    }

    /**
     * Esta funcion devuleve la suma de los divisores de un número
     * @param num numero del que se quieren sumar sus divisores
     * @return Suma de los divisores de num
     */
    static int sumDivisores(int num){
        int res=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                res=res+i;
            }
        }
        return res;
    }
}
