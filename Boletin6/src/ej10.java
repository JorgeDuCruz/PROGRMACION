/**
 * Este codigo tiene dos numeros y calcula el maximo comun divisor de los dos
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class ej10 {
    public static void main(String[]args){
        int a = 6, b=45,maximoDivisor;
        maximoDivisor=divisores1(a,a,b); // llama a una funcion que calcula el MCD entre dos numeros
        System.out.println("El máximo comun divisor de "+a+" y "+b+" es "+maximoDivisor);
    }

    /**
     * Esta funcion calcula el Máximo comun divisor de dos números
     * @param num1 numero del que se quiere calcular el divisor primero
     * @param divisor numero que se quiere probar si es divisor del num1
     * @param num2 numero del que se quiere calcular el divisor segundo
     * @return Máximo comun divisor entre num1 y num2
     */
    static int divisores1(int num1, int divisor,int num2){
        int res;
        if (num1%divisor==0){
            res=divisor;
            res=divisores2(num2,res,num1); // llama la otra funcion para que compruebe si el divisor es tambien divisor del num2
        }
        else res =divisores1(num1,divisor-1,num2); // se llama de nuevo a si misma para probar otro posible divisor
        return res;
    }

    /**
     * Funcion que calcula si el divisor del num1 tambien lo es del num2
     * @param num2 numero del que se quiere calcular si comparte divisor con num1
     * @param divisor divisor de num1 que se quiere comprobar con el num2
     * @param num1 numero del que proviene el divisor
     * @return maximo divisor comun entre num1 y num2
     */
    static int divisores2(int num2, int divisor, int num1){
        int res=0;
        if (num2%divisor==0)res=divisor;//confirma que el divisor es comun entre num1 y num2
        else res=divisores1(num1,divisor-1,num2);//llama a la funcion divisores1 para que pruebe con otro divisor
        return res;
    }
}
