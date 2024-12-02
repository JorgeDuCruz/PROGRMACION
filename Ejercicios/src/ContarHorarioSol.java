import java.util.Scanner;

public class ContarHorarioSol {
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
        int conteo=horasModulo(horario,asignatura);
        System.out.println("Tienes "+conteo+ " horas de "+asignatura);
    }
    static int horasModulo(String[][] horario, String modulo){
        int conteo=0;
        for (int dia=0;dia<horario.length;dia++){
            for (int hora=0;hora<horario[dia].length;hora++){
                if (horario[dia][hora].equals(modulo)) conteo++;
            }
        }
        return conteo;
    }
}
