public class ej1 {
    public static void main(String[]args){
        int[] numeros= new int[6];
        for (int i=0;i<numeros.length;i++){
            numeros[i] = (int) Math.floor(Math.random()*51);
        }
        for (int i= numeros.length-1;i>=0;i--) System.out.println(numeros[i]);
    }
}
