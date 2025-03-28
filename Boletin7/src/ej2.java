/**
 * Esta funcion genera 30 notas aleatorias, calcula cunatos suspensos hay, cuantos aprobados hay, cual es
 * la nota media de la clase y cual es la nota más alta
 * @author Jorge Duran Cruz
 * @version 1.0
 */
public class ej2 {
    public static void main(String[]args){
        int[] notas= new int[30];
        int suspensos =0,aprobados =0,notaMedia=0,maxNota=0;
        for (int i=0;i<notas.length;i++){
            notas[i] = (int) Math.floor(Math.random()*11);
        }

        for (int nota : notas) {
            if(maxNota<nota) maxNota=nota;
            if (nota < 5) suspensos++;
            else aprobados++;
            notaMedia=notaMedia+nota;
        }
        notaMedia=notaMedia/notas.length;
        System.out.println("Aprobaron "+ aprobados+" alumnos y suspendieron "+suspensos);
        System.out.println("La nota media de la clase es "+notaMedia+" y la nota más alta es "+maxNota);
    }
}
