import java.io.*;

public class SeparacionParesImpares {
    public SeparacionParesImpares (String rutaFicheiro){
        ObjectInputStream fluxoEntrada = null;
        ObjectOutputStream pares=null,impares=null;
        try{
            fluxoEntrada = new ObjectInputStream(new FileInputStream(rutaFicheiro));
            pares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
            impares = new ObjectOutputStream(new FileOutputStream("impares.dat"));
            int num;
            while (fluxoEntrada.available()!=0){
                num=fluxoEntrada.readInt();
                if (num%2==0){
                    pares.writeInt(num);
                }else {
                    impares.writeInt(num);
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
            if (pares!=null){
                try{
                    pares.close();
                }catch (IOException e){
                    System.out.println("Erro: Pechando o ficheiro "+e.getMessage());
                }
            }
            if (impares!=null){
                try{
                    impares.close();
                }catch (IOException e){
                    System.out.println("Erro: Pechando o ficheiro "+e.getMessage());
                }
            }
        }
    }
}
