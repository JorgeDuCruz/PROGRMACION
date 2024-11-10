/**
 * Este codigo tiene dos numeros y calcula el maximo comun divisor de los dos
 * @version 0.1
 * @author Jorge Duran Cruz
 */
public class ej10 {
    public static void main(String[]args){
        int a = 58, b=58,div1,div2;
        do {
            div1=divisores1(a,a);
            div2=divisores2(b,b);
        }while (div1!=div2);
    }
    static int divisores1(int num1, int divisor){
        int res=0;
        if (num1%divisor==0)res=1;
        return res;
    }
    static int divisores2(int num2, int divisor){
        int res=0;
        if (num2%divisor==0)res=1;
        return res;
    }
}
