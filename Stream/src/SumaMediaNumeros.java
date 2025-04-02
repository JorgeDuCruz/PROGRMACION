import java.io.FileReader;
import java.io.IOException;

public class SumaMediaNumeros {
    public static void sumaMedia(String ruta){
        int suma=0;
        String numero="";
        int verificador;
        int media = 0;
        FileReader entrada = null;

        try {
            entrada = new FileReader(ruta);
            verificador = entrada.read();
            while (verificador!=-1){
                while ((Character.isDigit((char)verificador) || (char)verificador =='-') && verificador!=-1){
                    numero=numero+(char)verificador;
                    verificador= entrada.read();
                }
                if (!numero.isEmpty()){
                    suma = suma + Integer.parseInt(numero);
                    media++;
                }
                numero="";

                verificador = entrada.read();
            }
        }catch (IOException e){
            System.out.println("Erro: "+e.getMessage());
        }finally {
            if (entrada!=null){
                try {
                    entrada.close();
                }catch (IOException e){
                    System.out.println("Erro: "+e.getMessage());
                }
            }
        }
        if (media!=0) {
            media = suma/media;
            System.out.println("Suma: "+suma+"\nMedia: "+media);
        }
        else {
            System.out.println("No se encontraron numeros");
        }
    }
}
