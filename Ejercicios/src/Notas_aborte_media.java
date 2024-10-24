import java.util.Scanner;

/**
 * Este código pide notas hasta que se le indique que ya no hay más y luego de te devuelve la media
 * @version 1.0
 * @author Jorge Durán cruz
 */
public class Notas_aborte_media {
    public static void main(String[]args){
        int cantidad= -1;
        double nota=0,sum =0;
        Scanner sc = new Scanner(System.in);

        do {
            sum = sum +nota;
            cantidad++;
            System.out.println("Meta la nota (-1 para terminar)");
            nota = sc.nextDouble();
        }while (nota!=-1);

        sc.close();
        if (cantidad!=0) System.out.println("La media es: "+sum/cantidad);
    }
}
