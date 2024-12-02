import java.util.Scanner;

/**
 * Programa que pide una asignatura y te devuelve cuantas horas hay de esa asignatura
 * @version 0.1
 * @author Jorge Duran Cruz
 */
public class ContarHorario {
    public static void main(String[]args){
        String[][] horario ={
                {"BD","BD","BD","BD","DS","PR","PR","PR"},
                {"BD","BD","BD","SASP","DS","SI","SI","IPE"},
                {"PR","PR","PR","LMSXI","DS","LMSXI","COD","COD"},
                {"IN","IN","SI","SI","DS","PR","PR","PR"},
                {"COD","LMSXI","LMSXI","SI","DS","SI","IPE","IPE"}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que asignatura quieres contar (BD,DS,PR,SI,SASP,LMSXI,COD,IPE,IN)");
        String asignatura= sc.next();
        sc.close();
        int conteo=0;
        for (int i=0;i<horario.length;i++){
            for (int j=0;j<horario[i].length;j++){
                if (horario[i][j].equals(asignatura)) conteo++;
            }
        }
        System.out.println("Tienes "+conteo+ " horas de "+asignatura);
    }
}
