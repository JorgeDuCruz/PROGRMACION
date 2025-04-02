import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploBufferedReader {
    public ExemploBufferedReader(String ruta) {
        String texto = "";
        BufferedReader entrada = null;
        try{
            entrada = new BufferedReader(new FileReader(ruta));
            String linha = entrada.readLine();
            while (linha!=null){
                texto = texto+linha+"\n";
                linha = entrada.readLine();
            }
        }catch(IOException e){
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
        System.out.println("O texto é: \n"+texto);
    }
}
