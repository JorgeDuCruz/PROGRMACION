import java.util.Scanner;

/**
 * Este código te pide dos numeros y te saca por pantalla los numeros entre medias
 * @version 4.1
 * @author Jorge Durán Cruz
 */
public class ej1 {
    /**
     * Es el función princial que pide dos numeros y luego llama a la funcion que mostrara los numeros intermedios
     * @param args no se usa
     */
    public static void main(String[]args){
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        num1 = sc.nextDouble();
        System.out.println("Dime outro número");
        num2 = sc.nextDouble();
        sc.close();
        if (num1-(int)num1==0 && num2-(int)num2==0) intermedio((int) num1,(int) num2);
        else intermedio(num1, num2);
        intermedio((int) num1);
    }

    /**
     * Esta función recibe dos numeros de la función principal, verifica cual es más pequeño y muestra por
     * pantalla los numeros intermedios
     * @since 2.0
     * @param min número más pequeño de los dos que recibe
     * @param max número más grande de los dos que recibe
     */
    static void intermedio(int min, int max){
        if(min>max) { //aqui me aseguro de que la variable min sea realmente el numero mas pequeño
            int aux = max;
            max =min;
            min=aux;
        }

        System.out.println("Los números comprendidos entre "+min+" y "+max+" son");
        for(min = min+1;min<max;min++){ // aqui se le suma un 1 al numero más bajo para que empiece a contar desde el siguiente y no lo meta en la cuenta
            System.out.println(min);
        }
    }

    /**
     * Esta función recibe dos numeros decimales de la función principal, los redondea y llama otra funcion para que
     * calcule los numeros comprendidos entre ellos
     * @since 3.0
     * @param num1 número más pequeño de los dos que recibe
     * @param num2 número más grande de los dos que recibe
     */
    static void intermedio(double num1, double num2){
        int num1Int=(int) Math.round(num1);
        int num2Int=(int) Math.round(num2);
        intermedio(num1Int,num2Int);
    }

    /**
     * Esta funcion recibe un valor de la funcion pricnipal y llama a una funcion que muestra por pantalla los numeros
     * comprendidos entre el 0 y el numero  recivido
     * @since 4.0
     * @param num1 es el número limite
     */
    static void intermedio(int num1){
        intermedio(0,num1);
    }
}
