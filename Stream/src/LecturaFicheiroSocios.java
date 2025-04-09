import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaFicheiroSocios {
    public LecturaFicheiroSocios(String ruta){
        ObjectInputStream fluxoEntrada = null;
        try{
            fluxoEntrada=new ObjectInputStream(new FileInputStream(ruta));
            Socio s;
            while (true){
                s = (Socio) fluxoEntrada.readObject();
                System.out.println(s.toString());
            }
        }catch (EOFException e){
            System.out.println("No hay mas registros que leer");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: no se encontro clase"+e.getMessage());
        }finally {
            if (fluxoEntrada!=null){
                try {
                    fluxoEntrada.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
