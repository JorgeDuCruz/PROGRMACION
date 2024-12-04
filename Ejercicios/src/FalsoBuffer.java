import java.util.Arrays;
import java.util.Scanner;

/**
 * Usar una tabla para guardar y leer datos mediante un solo indice
 */
public class FalsoBuffer {
    public static void main(String[]args){
        int cabeza=-1,accion;
        int [] buffer =new int[5];
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("¿Que quieres hacer? (Parar:0, Escribir:1, Leer:2)");
            accion= sc.nextInt();
            switch (accion){
                case 0: break;
                case 1: {
                    cabeza=escribir(buffer,cabeza);
                    break;
                }
                case 2:{
                    cabeza=leer(buffer,cabeza);
                    break;
                }
                default: {
                    System.out.println("Elige una accion entre las 3 posibles");
                    break;
                }
            }

        } while (accion!=0);
    }

    static int escribir(int[] tabla, int indice){
        Scanner sc=new Scanner(System.in);
        if(!(indice<tabla.length-1)){
            System.out.println("No hay más espacio para escribir");
            return indice;
        }
        else {
            System.out.println("Que valor quieres escribir?");
            tabla[indice+1]= sc.nextInt();
        }
        indice++;
        return indice;
    }

    static int leer(int[] tabla, int indice){
        if (indice<0){
            System.out.println("No hay nada que leer");
            return indice;
        }
        else {
            for (int i=0;i<=indice;i++){
                System.out.println(tabla[i]);
            }
            indice--;
            return indice;
        }
    }
}
