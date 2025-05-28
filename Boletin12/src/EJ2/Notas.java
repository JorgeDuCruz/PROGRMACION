package EJ2;

import java.io.*;
import java.util.ArrayList;

public class Notas {
    static String fichero = "notas.txt";
    static ArrayList<String> notas = new ArrayList<>();

    public static void cargarFichero() {
        BufferedReader fluxoEntrada=null;
        try {
            fluxoEntrada = new BufferedReader(new FileReader(fichero));
            String linha = fluxoEntrada.readLine();
            while (linha!=null){
                notas.add(linha);
                linha=fluxoEntrada.readLine();
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (fluxoEntrada!=null){
                try {
                    fluxoEntrada.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void guardarFichero(){
        BufferedWriter fluxoSaida=null;
        try {
            fluxoSaida = new BufferedWriter(new FileWriter(fichero));
            for (String nota:notas){
                fluxoSaida.write(nota);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
