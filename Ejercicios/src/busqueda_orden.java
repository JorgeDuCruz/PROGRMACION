import java.util.Scanner;

public class busqueda_orden {
    public static void main(String[]args) {
        int[] tablaOrden = {5, 7, 9, 15, 25, 90, 101};
        int medio,numero, linf = 0,lsup=tablaOrden.length-1, indice=-1;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        sc.close();
        while (linf!=lsup){
            medio=(lsup-linf)/2;
            if (tablaOrden[medio+linf]==numero){
                indice=medio+linf;
                break;
            }
            if (tablaOrden[medio+linf]>numero){
                lsup=medio+linf-1;
            }
            else {
                linf=medio+linf+1;
            }
        }
        if (tablaOrden[linf]==numero){
            indice=linf;
        }
        System.out.println(indice);

    }
}
