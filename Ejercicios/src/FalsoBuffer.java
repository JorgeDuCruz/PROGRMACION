import java.util.Scanner;

/**
 * Usar una tabla para guardar y leer datos mediante un solo indice
 * @version 1.0
 */
public class FalsoBuffer {
    public static void main(String[]args){
        int cabeza=-1,accion;
        int [] pila =new int[5];
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("¿Que quieres hacer? (Parar:0, Escribir:1, Leer:2, Usar:3)");
            accion= sc.nextInt();
            switch (accion){
                case 0: break;
                case 1: {
                    cabeza= apilar(pila,cabeza);
                    break;
                }
                case 2:{
                    leer(pila,cabeza);
                    break;
                }
                case 3:{
                    cabeza=usar(pila,cabeza);
                    break;
                }
                default: {
                    System.out.println("Elige una accion entre las 4 posibles");
                    break;
                }
            }

        } while (accion!=0);
    }

    static int apilar(int[] tabla, int indice){
        Scanner sc=new Scanner(System.in);
        if(!(indice<tabla.length-1)){
            System.out.println("No hay más espacio para escribir");
            return indice;
        }
        else {
            System.out.println("Que valor quieres escribir?");
            tabla[indice+1]= sc.nextInt();
            System.out.println("El número "+tabla[indice+1]+" fue apilado");
        }
        indice++;
        return indice;
    }

    static void leer(int[] tabla, int indice){
        if (indice<0){
            System.out.println("No hay nada que leer");
        }
        else {
            for (int i=indice;i>0;i--){
                System.out.println("El número es: "+tabla[i]);
            }
        }
    }
    static int usar(int[] tabla, int indice){
        if (indice<0){
            System.out.println("No hay nada que usar");
        }
        else {
            System.out.println("Se uso: "+tabla[indice]);
            indice--;
        }
        return indice;
    }
}
