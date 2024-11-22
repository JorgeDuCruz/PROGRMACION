import java.util.Scanner;

public class ej6 {
    public static void main(String[]args) {
        int[] tablaOrden = {1,3,9,16,21,32,41,93,106};
        int medio,valor, linf = 0,lsup=tablaOrden.length-1, indice=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que numero quieres buscar?");
        valor = sc.nextInt();
        sc.close();
        while (linf!=lsup){
            medio=(lsup-linf)/2;
            if (tablaOrden[medio+linf]==valor){
                indice=medio+linf;
                break;
            }
            if (tablaOrden[medio+linf]>valor){
                lsup=medio+linf-1;
            }
            else {
                linf=medio+linf+1;
            }
        }
        if (tablaOrden[linf]==valor){
            indice=linf;
        }
        System.out.println(indice);

    }
}
