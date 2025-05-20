package Bol3Ex10;
import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Menu {
    Map<String,Integer> existencias;
    String ficheiro;

    public Menu(String ficheiro) {
        this.ficheiro = ficheiro;
        this.existencias = cargarColeccion();
    }

    public void gardarMapa(Map<String,Integer> existencias){
        ObjectOutputStream fluxoSaida=null;
        try{
            fluxoSaida = new ObjectOutputStream(new FileOutputStream(ficheiro));
            fluxoSaida.writeObject(existencias);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage() + " FileNotFoundException");
        }catch (IOException e){
            System.out.println(e.getMessage() + " IOException");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                fluxoSaida.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void gardarColeccion(Map<String,Integer> existencias){
        ObjectOutputStream fluxoSaida=null;
        try{
            fluxoSaida = new ObjectOutputStream(new FileOutputStream(ficheiro));
            Set<String> coleccion =  existencias.keySet();

            for (String clave:coleccion){
                Peza peza = new Peza(clave,existencias.get(clave));
                fluxoSaida.writeObject(peza);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage() + " FileNotFoundException");
        }catch (IOException e){
            System.out.println(e.getMessage() + " IOException");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                fluxoSaida.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


    public Map<String,Integer> cargarMapa(){
        Map<String,Integer> mapa = null;
        ObjectInputStream fluxoEntrada=null;
        try{
            fluxoEntrada = new ObjectInputStream(new FileInputStream(ficheiro));
            mapa = (Map<String,Integer>) fluxoEntrada.readObject();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage() + " FileNotFoundException");
            mapa = new TreeMap<>();
        }catch (IOException e){
            System.out.println(e.getMessage() + " IOException");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                fluxoEntrada.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return mapa;
    }


    public Map<String,Integer> cargarColeccion(){
        Map<String,Integer> mapa = new TreeMap<>();
        ObjectInputStream fluxoEntrada=null;
        try{
            fluxoEntrada = new ObjectInputStream(new FileInputStream(ficheiro));
            while (true){
               Peza peza = (Peza) fluxoEntrada.readObject();
               if (peza==null) break;
               mapa.put(peza.referencia, peza.cantidade);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage() + " FileNotFoundException");
        }catch (IOException e){
            System.out.println(e.getMessage() + " IOException");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fluxoEntrada!=null)fluxoEntrada.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        return mapa;
    }



    public boolean altaProducto(String referencia){
        if (this.existencias.containsKey(referencia)){
            return false;
        }
        else {
            this.existencias.put(referencia,0);
            return true;
        }
    }

    public boolean bajaProducto(String referencia){
        if (this.existencias.containsKey(referencia)){
            this.existencias.remove(referencia);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean modificarProducto(String referencia,Integer cantidade){
        if (this.existencias.containsKey(referencia)){
            this.existencias.put(referencia,cantidade); // put tambien funcionaria
            return true;
        }
        else {
            return false;
        }
    }

    public Map<String,Integer> listarDatos(){
        return existencias;
    }
    public static void main(String[] args) {
        Menu menu = new Menu("datos.dat");
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("0.Sair");
            System.out.println("1.Dar de alta Producto");
            System.out.println("2.Dar de baja Producto");
            System.out.println("3.Cambiar cantidade de un Producto");
            System.out.println("4.Listado de existencias");
            System.out.println("Introduce opcion:");

            opcion=sc.nextInt();

            switch (opcion){
                case 1 -> {
                    System.out.println("Codigo del producto");
                    String producto = sc.next();
                    menu.altaProducto(producto);
                }
                case 2 -> {
                    System.out.println("Codigo del producto");
                    String producto = sc.next();
                    menu.bajaProducto(producto);
                }
                case 3 -> {
                    System.out.println("Codigo del producto");
                    String producto = sc.next();
                    System.out.println("Nueva cantidad del producto");
                    Integer can = sc.nextInt();
                    menu.modificarProducto(producto,can);
                }
                case 4 ->{
                    System.out.println(menu.listarDatos());
                }
                default -> opcion=0;
            }
        }while (opcion!=0);

        menu.gardarColeccion(menu.existencias);
    }
}
