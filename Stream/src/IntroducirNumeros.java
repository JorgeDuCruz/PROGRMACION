import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IntroducirNumeros {
    public static void escribir(String ruta){
        Scanner sc = new Scanner(System.in);
        BufferedWriter salida = null;
        String numero;
        try{
            salida = new BufferedWriter(new FileWriter(ruta));
            System.out.println("Escribe los numeros:");
            do {
                numero = sc.next();
                salida.write(numero+" ");
            }while (!numero.isEmpty());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            if (salida!= null){
                try{
                    salida.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Hecho");
    }
}
