import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumaMediaConArray {
    public static void sumaMedia(String ruta){
        BufferedReader entrada=null;
        int suma=0,media=0;
        try {
            entrada = new BufferedReader(new FileReader(ruta));
            String linha = entrada.readLine();
            while (linha !=null){
                String [] numeros = linha.split(" ");
                for (String num : numeros){
                    suma = suma +Integer.parseInt(num);
                    media++;
                }
                linha = entrada.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){

        }finally {
            if (entrada!=null){
                try {
                    entrada.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        if (media==0) System.out.println("No hay numeros");
        else {
            media = suma/media;
            System.out.println("Suma: "+suma+"\nMedia: "+media);
        }
    }
}
