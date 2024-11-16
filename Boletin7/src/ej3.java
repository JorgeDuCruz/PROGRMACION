import java.util.Scanner;

/**
 * Este codigo es una modificacion del codigo de ej2 que usa una lista de 30 nombres donde niguno se repite
 * Lo que hace es preguntar por un nombre para que te devuelva su nota, tambien muestra un listado de aquellos que aprobaron y por ultimo te devuelve los nombres con su nota al lado ordenos de mayor a menor
 * @author Jorge Duran Cruz
 * @version 1.0
 */
public class ej3 {
    public static void main(String[]args){
        int identificador; // valor que marca en que posicion esta dentro de un array
        String[] nombres = {
                "Ana", "Carlos", "María", "Pedro", "Laura",
                "Juan", "Lucía", "David", "Elena", "Miguel",
                "Sofía", "Javier", "Clara", "Antonio", "Isabel",
                "Francisco", "Raquel", "Roberto", "Carmen", "Ricardo",
                "Verónica", "Felipe", "Marta", "Alberto", "Teresa",
                "Tomás", "Nuria", "Gerardo", "Paula", "Luis"
        };
        int[] notas= new int[30];
        for (int i=0;i<notas.length;i++){
            notas[i] = (int) Math.floor(Math.random()*11);
        }// crea aleatoriamente una nota del 0 al 10 que se asume corresponde al nombre de misma posicion
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime de que alumno quieres ver su nota:");
        String nome =sc.next();
        sc.close();

        for (identificador=0;identificador<nombres.length;identificador++){ // busca por todos los nombres de la lista
            if (nombres[identificador].equals(nome)){//cuando encuentra el nombre que busca se detiene para no seguir modificando el identifiacdor
                break;
            }
        }
        System.out.println("La nota de "+nome+" es "+notas[identificador]);

        System.out.println("\nAprobados: ");
        for (int i=0;i<notas.length;i++) {//pasa por todas las notas
            if (notas[i] >= 5) System.out.println(nombres[i]);// cuando la nota sea aprobatoria escribe el nombre del alumno que la tenia
        }
        System.out.println("\nLista ordenada:");
        listadoOrden(nombres,notas,10);// llama a una funcion que escribe los nombres ordenadamente
    }

    /**
     * Esta funcion escribe el nombre del alumno y su nota al lado cuando la nota sea la que se busca
     * @param nombres lista de los nombres de los alumnos del curso
     * @param notas lista de las notas de los alumnos
     * @param nota nota que se esta buscando
     */
    static void listadoOrden(String[] nombres,int[] notas, int nota){
        if(nota!=0){
            for (int i=0;i<nombres.length;i++){//pasa por todos los alumnos
                if(notas[i]==nota){//cuando la nota del alumno coincide con la que se busca escribe su nombre y su nota
                    System.out.println(nombres[i]+": "+notas[i]);
                }
            }
            listadoOrden(nombres,notas,nota-1);//cuando se encontaron todos los nombres de una nota se busca a los de la nota siguiente nota mas alta
        }
    }
}
