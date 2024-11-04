import java.util.Scanner;

/**
 * Calcula el factorial de un número que pide por tecaldo con una funcion recursiva
 * @author Jorge Durán cruz
 * @version 2.0
 */
public class funcion_recursiva {
    public static void main(String[]args){
        long factorial;
        Scanner sc =new Scanner(System.in);
        System.out.println("De que numero quieres el factorial?");
        int num= sc.nextInt();
        System.out.println("Dime un numero y a que lo quieres elevar");
        System.out.print("Base:");
        int numElevado= sc.nextInt();
        System.out.print("Exponente:");
        int exponetne= sc.nextInt();
        sc.close();
        factorial= factorialRecursiva(num);
        System.out.println("El factorial de "+num+" es "+factorial);
        System.out.println(numElevado+" elevado a "+exponetne+" es "+elevadoRecursiva(numElevado,exponetne));

    }

    /**
     * Función que pide el factorial del número anterior al que recibe para calcular su factorial
     * @since 2.0
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

    /**
     * Funcion que pide el valor de elevar el numero al exponente aterior para calcular la elevacion actual
     * @param n base que quieres elevar
     * @param m exponente al que quieres elevar la base
     * @return valor de la base elevada al exponente
     */
    static int elevadoRecursiva(int n,int m){
        int res;
        if (m==0) res =1;
        else res=n*elevadoRecursiva(n,m-1);
        return res;
    }
}
