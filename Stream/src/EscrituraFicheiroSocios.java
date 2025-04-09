import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraFicheiroSocios {
    public EscrituraFicheiroSocios(String ruta, Socio[] socios){
        ObjectOutputStream fluxoSaida = null;
        try{
            fluxoSaida = new ObjectOutputStream(new FileOutputStream(ruta));
            for (Socio s:socios){
                fluxoSaida.writeObject(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (fluxoSaida!=null){
                try {
                    fluxoSaida.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
