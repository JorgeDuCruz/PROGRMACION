import java.io.*;

public class LecturaTaboaNumerosBinario {
    public LecturaTaboaNumerosBinario(String rutaFicheiro){
        ObjectInputStream fluxoEntrada = null;
        try{
            fluxoEntrada = new ObjectInputStream(new FileInputStream(rutaFicheiro));
            int num;
            while (true){
                num=fluxoEntrada.readInt();
                System.out.println(num);
            }
        }catch (FileNotFoundException e){
            System.out.println("Erro: Fichiero non encontrado. "+e.getMessage());
        }catch (EOFException e){
            System.out.println("No hay nada más que leer, se chegou o fin do ficheiro.");
        }catch (IOException e){
            System.out.println("Erro: Entrada/Saída. "+e.getMessage());
        }finally {
            if (fluxoEntrada!=null){
                try{
                    fluxoEntrada.close();
                }catch (IOException e){
                    System.out.println("Erro: Pechando o ficheiro "+e.getMessage());
                }
            }
        }
    }
}
