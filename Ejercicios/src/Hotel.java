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
                    registrar(hotel, habitacion);
                }break;
                case 1 : {
                    System.out.println("Habitacion:");
                    int habitacion= sc.nextInt();
                    liberar(hotel, habitacion);
                }break;
                case 2 : disposicionHabitacions(hotel);break;
                case -1: break;
                default : System.out.println("Seleccione una accion");
            }
        }while (accion!=-1);
        sc.close();
    }

    /**
     * Registra al cliente a la hhabitacion escogida
     * @param hotel datos del hotel
     * @param hab habitacion escogida
     */
    static void registrar(String[][]hotel, int hab){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nombre:");//pregunta el nombre del cliente que se quiere registra
        String nome= sc.next();
        int planta= hab/10 -1;
        int habitacion= hab%10 -1;
        if (hotel[planta][habitacion]==null) {//comprueba que la habitacion no tiene dueño para asignarselo
            hotel[planta][habitacion]=nome; // si no tiene dueño registra al cliente como dueño
        }
        else {//si ya tiene dueño lo indica y mantiene el dueño anterior
            System.out.println("Habitacion "+hab+" ocupada. Eliga otra");
        }
    }

    /**
     * Libera una habitacion
     * @param hotel datos del hotel
     * @param hab habitacion que se va a vaciar
     */
    static void liberar(String[][] hotel, int hab){
        int planta= hab/10 -1;
        int habitacion= hab&10 -1;
        hotel[planta][habitacion]=null;
    }

    /**
     * muestra la dispocion de las habitaciones del hotel entero
     * @param hotel los datos de las habitaciones del hotel
     */
    static void disposicionHabitacions(String[][] hotel){
        for (int i=hotel.length-1;i>=0;i--){//pasa planta por planta
            for (int j=0;j< hotel[i].length;j++){//pasa por las habitaciones de cada planta
                System.out.print((i+1)+""+j+":");//muestra el numero de la habitacion
                if (hotel[i][j]!=null)System.out.print(" "+hotel[i][j]); //muestra el nombre del usuario de la habitacion si lo tiene
                else System.out.print(" Vacia");// muestra un espacio en blanco si la habitacion no tiene dueño
                System.out.print(" | ");// separa las habitaciones entre si
            }
            System.out.println();//separa las plantas entres si
        }
    }

}
