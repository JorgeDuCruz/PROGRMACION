public class ej2 {
    public static void main(String[]args){
        int[] numeros= new int[30];
        int suspensos =0;
        int aprobados =0;
        for (int i=0;i<numeros.length;i++){
            numeros[i] = (int) Math.floor(Math.random()*11);
        }

        for (int i=0;i<numeros.length;i++){

            if(numeros[i]<5) suspensos++;
            else aprobados++;
        }
        System.out.println("Aprobaron "+ aprobados+" alumnos y suspendieron "+suspensos);
    }
}
