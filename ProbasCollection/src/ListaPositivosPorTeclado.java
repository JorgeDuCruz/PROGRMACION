import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPositivosPorTeclado {
    //Escanea nnumeros y los agrega a un arrayList hasta qeu se escriba -1
    //Despues muestra los poscionados en indices pares *100
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        mostrar(escaneo(list));
    }
    public static List<Integer>  escaneo(List<Integer> lista){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n!=-1) {
            System.out.println("Escribe un numero positivo (-1 termina la secuencia)");
            n=sc.nextInt();
            if (n>-1){
                lista.add(n);
            } else if (n<-1) {
                System.out.println("Solo numeros positivos");
            }
        }
        return lista;
    }
    public static void mostrar(List<Integer> lista){
        System.out.println(lista);
        for (int i =0;i< lista.size();i+=2){
            System.out.println(lista.get(i)*100);
        }

    }
}
