import java.util.Scanner;

public class Horario {
    public static void main(String[]args){
        String[][] horario={
                {"Lunes","Martes","Miercoles","Jueves","Viernes"},
                {"BD","BD","PROG","ING","COD"},
                {"BD","BD","PROG","ING","LGM"},
                {"BD","BD","PROG","SI","LGM"},
                {"BD","SASP","LDM","SI","SI"},
                {"PROG","SI","LDM","PROG","SI"},
                {"PROG","SI","COD","PROG","IPE"},
                {"PROG","IPE","COD","PROG","IPE"},
        };
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el dia");
        String dia= sc.next();
        System.out.println("Dime la hora");
        int hora =sc.nextInt();

        sc.close();
        int diaNum = switch (dia) {
            case "Lunes", "lunes" -> 0;
            case "Martes", "martes" -> 1;
            case "Miercoles", "miercoles" -> 2;
            case "Jueves", "jueves" -> 3;
            case "Viernes", "viernes" -> 4;
            default -> 0;
        };
        System.out.println("El "+horario[0][diaNum]+" te toca: "+horario[hora][diaNum]);
    }
}
