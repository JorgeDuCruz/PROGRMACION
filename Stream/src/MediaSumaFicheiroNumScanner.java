import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MediaSumaFicheiroNumScanner {
    public static void sumaMedia(String ruta){
        Scanner entrada=null;
        int suma=0,media=0;
        try {
            entrada = new Scanner(new FileReader(ruta));
            String linha = entrada.nextLine();
            while (linha !=null){
                Scanner sc = new Scanner(linha);
                while (sc.hasNext()){
                        suma = suma + sc.nextInt();
                        media++;
                }
                linha = entrada.nextLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (NoSuchElementException e){
            System.out.println("No se encontro linea siguiente");
        }
        finally {
            if (entrada!=null){
               entrada.close();
            }
        }
        if (media==0) System.out.println("No hay numeros");
        else {
            media = suma/media;
            System.out.println("Suma: "+suma+"\nMedia: "+media);
        }
    }
}
