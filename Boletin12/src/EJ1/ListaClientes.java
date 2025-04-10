package EJ1;

import java.io.*;

public class ListaClientes {
    public static void EngadirNovoCliente(String ruta,Cliente cliente){
        Cliente[] clientes=LeerDatos(ruta);
        Cliente[] clientesActu = new Cliente[clientes.length+1];
        for (int i =0;i<clientesActu.length;i++){
            if (i< clientes.length) clientesActu[i]=clientes[i];
            else clientesActu[i]=cliente;
        }
        EscribirDatos(ruta,clientesActu);

    }

    public static void ModificarDatos(String ruta,String id, String nome,int telefono){
        Cliente[] clientes=LeerDatos(ruta);
        Cliente clienteMod=null;
        int posicionCliente=0;
        for (;posicionCliente<clientes.length;posicionCliente++) {
            if (id.equals(clientes[posicionCliente].getId())) {
                clienteMod = clientes[posicionCliente];
                break;
            }
        }
        try {
            if (!nome.isBlank()) clienteMod.setNome(nome);
            if (telefono!=100000000)clienteMod.setTelefono(telefono);
            clientes[posicionCliente]=clienteMod;
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println("EJ1.Cliente no encontrado "+e.getMessage());
        }

        EscribirDatos(ruta,clientes);
    }

    public static void DarDeBaixaCliente(String ruta, String id){
        Cliente[] clientes = LeerDatos(ruta);
        Cliente[] clientesMod = new Cliente[clientes.length-1];

        for (int i=0,j=0;i<clientes.length;i++,j++){

            if (!(id.equals(clientes[i].getId()))){
                clientesMod [j] = clientes[i];
            }else j--;
        }
        EscribirDatos(ruta,clientesMod);
    }

    public static void ListarClientes(String ruta){
        Cliente[] clientes=LeerDatos(ruta);
        for (int i=0;i< clientes.length;i++){
            System.out.println(clientes[i].toString());
        }
    }

    private static Cliente[] LeerDatos(String ruta){
        ObjectInputStream fluxoEntrada  = null;
        Cliente[] clientes = null;
        try{
            fluxoEntrada = new ObjectInputStream(new FileInputStream(ruta));
            clientes= (Cliente[]) fluxoEntrada.readObject();

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            if (fluxoEntrada != null) {
                try {
                    fluxoEntrada.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        if (clientes==null)return new Cliente[0];
        else return clientes;
    }

    private static void EscribirDatos(String ruta,Cliente[] clientes){
        ObjectOutputStream fluxoSaida = null;
        try{
            fluxoSaida = new ObjectOutputStream(new FileOutputStream(ruta));
            fluxoSaida.writeObject(clientes);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            if (fluxoSaida!=null){
                try {
                    fluxoSaida.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}
