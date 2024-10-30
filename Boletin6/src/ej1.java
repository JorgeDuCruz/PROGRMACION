import java.util.Scanner;

/**
 * Este código te pide dos numeros y te saca por pantalla los numeros entre medias
 * @version 2.0
 * @author Jorge Durán Cruz
 */
public class ej1 {
    /**
     * Es el función princial que pide dos numeros y luego llama a la funcion que mostrara los numeros intermedios
     * @param args no se usa
     */
    public static void main(String[]args){
        int nMin, nMax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        nMin = sc.nextInt();
        System.out.println("Dime outro número");
        nMax = sc.nextInt();
        intermedio(nMin, nMax);
    }

    /**
     * Esta función recibe dos numeros de la función principal, verifica cual es más pequeño y muestra por pantalla los numeros intermedios
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
}