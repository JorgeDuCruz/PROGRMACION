import java.util.Scanner;

/**
 * Calcula el factorial de un número que pide por tecaldo con una funcion recursiva
 * @author Jorge Durán cruz
 * @version 1.1
 */
public class funcion_recursiva {
    public static void main(String[]args){
        long factorial;
        Scanner sc =new Scanner(System.in);
        System.out.println("De que numero quieres el factorial?");
        int num= sc.nextInt();
        sc.close();
        factorial= factorialRecursiva(num);
        System.out.println("El factorial de "+num+" es "+factorial);

    }

    /**
     * Función que pide el factorial del número anterior al que recibe para calcular su factorial
     * @param n número del que se quiere el factorial
     * @return valor del factorial de n
     */
    static long factorialRecursiva(int n){
        long res;
        if (n==0){
            res =1;
        }
        else res =n* factorialRecursiva(n-1);
        return res;
    }
}
