import java.util.Scanner;

/**
 * Calcula el factorial de un número que pide por tecaldo con una funcion recursiva
 * @author Jorge Durán cruz
 * @version 1.0
 */
public class funcion_recursiva {
    public static void main(String[]args){
        long factorial;
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        sc.close();
        factorial=funcionRecursiva(num);
        System.out.println(factorial);

    }

    /**
     * Función que pide el factorial del número anterior al que recibe para calcular su factorial
     * @param n número del que se quiere el factorial
     * @return valor del factorial de n
     */
    static long funcionRecursiva(int n){
        long res;
        if (n==0){
            res =1;
        }
        else res =n*funcionRecursiva(n-1);
        return res;
    }
}
