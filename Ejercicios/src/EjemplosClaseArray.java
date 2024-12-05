import java.util.Arrays;

public class EjemplosClaseArray {
    public static void main(String[]args){
        int [] numeros = {8,13,15,29,56,57,61};
        int indice = Arrays.binarySearch(numeros,29);
        //Arrays.binarySearch(numeros,0, numeros.length, 30);
        if (indice>=0) System.out.println("Existe na taboa");
        else System.out.println("Non existe");
        System.out.println(indice);
        int[] num2=Arrays.copyOf(numeros,numeros.length);
        int[] num3=Arrays.copyOfRange(numeros,1,5);
        System.out.println(Arrays.toString(num2) +" y "+ Arrays.toString(num3));
        System.out.println(compararMatruces(num2,numeros));
    }

    static boolean compararMatruces(int[] a,int[] b){
        if (a.length!= b.length) return false;
        else {
            boolean iguais=true;
            for (int i =0;i< a.length;i++){
                if (a[i]!=b[i]) return false;
            }
            return iguais;
        }
    }
}
