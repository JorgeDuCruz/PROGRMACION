import java.util.Scanner;

/**
 * Programa que permite organizar un horario,verlo y modificarlo
 * @version 0.1
 * @author Jorge Duran Cruz
 */
public class ej1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int accion;
        System.out.println("Cuantas horas al dia quieres gestionar?");
        int horas= sc.nextInt();
        String [][] horario=new String[5][horas+1];
        horario[0][0]="Lunes";
        horario[1][0]="Martes";
        horario[2][0]="Miercoles";
        horario[3][0]="Jueves";
        horario[4][0]="Viernes";
        do {
            System.out.println("Que quieres hacer? (Parar:0, Ver horario:1, Modificar horario:2)");
            accion= sc.nextInt();
            switch (accion){
                case 0:break;
                case 1:{
                    mostrarHorario(horario);
                    break;
                }
                case 2:{
                    modificarHorario(horario);
                    break;
                }
                default:{
                    System.out.println("Elige una de las 3 opciones posibles");
                    break;
                }
            }
        }while(accion!=0);
    }
    static void mostrarHorario(String [][] horario){

    }
    static void modificarHorario(String[][] horario){

    }
}
