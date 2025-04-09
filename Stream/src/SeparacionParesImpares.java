import java.io.*;

public class SeparacionParesImpares {
    public SeparacionParesImpares (String rutaFicheiro){
        ObjectInputStream fluxoEntrada = null;
        ObjectOutputStream fluxoSaidaPares=null,fluxoSaidaImpares=null;
        try{
            fluxoEntrada = new ObjectInputStream(new FileInputStream(rutaFicheiro));
            fluxoSaidaPares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
            fluxoSaidaImpares = new ObjectOutputStream(new FileOutputStream("impares.dat"));
            int num;
            while (fluxoEntrada.available()!=0){
                num=fluxoEntrada.readInt();
                if (num%2==0){
                    fluxoSaidaPares.writeInt(num);
                }else {
                    fluxoSaidaImpares.writeInt(num);
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("Erro: Fichiero non encontrado. "+e.getMessage());
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
            if (fluxoSaidaPares!=null){
                try{
                    fluxoSaidaPares.close();
                }catch (IOException e){
                    System.out.println("Erro: Pechando o ficheiro "+e.getMessage());
                }
            }
            if (fluxoSaidaImpares!=null){
                try{
                    fluxoSaidaImpares.close();
                }catch (IOException e){
                    System.out.println("Erro: Pechando o ficheiro "+e.getMessage());
                }
            }
        }
    }
}
