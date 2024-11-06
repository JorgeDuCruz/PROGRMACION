import java.util.Scanner;

/**
 * Este código te pide un numero y a que numero lo quieres elevar y te devuelve el resultado
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class ej8 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime un numero y a que lo quieres elevar");
        System.out.print("Base:");
        int base= sc.nextInt();
        System.out.print("Exponente:");
        int exponetne= sc.nextInt();
        sc.close();
        System.out.println(base+" elevado a "+exponetne+" es "+elevadoRecursiva(base,exponetne));

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
