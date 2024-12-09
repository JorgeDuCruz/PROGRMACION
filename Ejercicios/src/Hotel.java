import java.util.Scanner;

/**
 * Para un hotel de 4*6
 * Aplicaicon que
 * 1 registre usuarios (Nome) y habitacion
 * 2 Deixar habitacion
 * 3 Consultar habitacions baleiras
 * @version 1.0
 * @author Jorge Duran Cruz
 */
public class Hotel {
    public static void main(String[]args){
        String[][] hotel= new String[4][6];
        int accion;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Que quieres hacer? registrarte(0), Irte(1) o Ver habitaciones libres(2) [terminar(-1)]");
            accion = sc.nextInt();
            switch (accion) {
                case 0 : {
                    System.out.println("Habitacion:");
                    int habitacion= sc.nextInt();
                    Registrar(hotel, habitacion);
                }break;
                case 1 : {
                    System.out.println("Habitacion:");
                    int habitacion= sc.nextInt();
                    Liberar(hotel, habitacion);
                }break;
                case 2 : HabitacionBaleira(hotel);break;
                case -1: break;
                default : System.out.println("Seleccione una accion");
            }
        }while (accion!=-1);
        sc.close();
    }

    static void Registrar(String[][]hotel, int hab){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nombre:");
        String nome= sc.next();
        int planta= hab%10 -1;
        int habitacion= hab/10 -1;
        if (hotel[planta][habitacion]==null) hotel[planta][habitacion]=nome;
        else {
            System.out.println("Habitacion "+hab+" ocupada. Eliga otra");
        }
    }

    static void Liberar(String[][] hotel,int hab){
        int planta= hab%10 -1;
        int habitacion= hab/10 -1;
        hotel[planta][habitacion]=null;
    }

    static void HabitacionBaleira(String[][] hotel){
        for (int i=hotel.length-1;i>=0;i--){
            for (int j=0;j< hotel[i].length;j++){
                System.out.print((i+1)+""+j);
                if (hotel[i][j]!=null)System.out.print(" "+hotel[i][j]);
                else System.out.print(" ");
                System.out.print("|");
            }
            System.out.println();
        }
    }

}
