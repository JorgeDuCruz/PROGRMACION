import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        int soldo,cantidadeGrupo =0,poucoSoldo =0,iteraciones=-1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("¿Cual es tu sueldo? (si ya no hay más trabajadores escribe 0)");
            soldo = sc.nextInt();
            if (1000<soldo && soldo<=1750) cantidadeGrupo++;
            if (soldo<1000) poucoSoldo++;
            iteraciones++;
        }while (soldo!=0);
        sc.close();
        System.out.println("Hay "+cantidadeGrupo+" personas con un sueldo entre 1000 y 1750€");
        if (iteraciones!=0)System.out.println("El porcentaje de personas con un sueldo menor a 1000€ es "+poucoSoldo*100/iteraciones+"%");
    }
}
