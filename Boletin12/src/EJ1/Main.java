package EJ1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int accion;

        do {
            System.out.println("Que quieres hacer? 1:Listar Clientes. 2:Engadir EJ1.Cliente. 3:Modificar datos de un EJ1.Cliente. 4:Dar de baja a un EJ1.Cliente. -1:Apagar");
            accion= sc.nextInt();
            switch (accion){
                case 1-> ListaClientes.ListarClientes("src/EJ1/Clientes.dat");
                case 2->{
                    Cliente clienteNovo=EngadirCliente(sc);
                    if (clienteNovo!=null)ListaClientes.EngadirNovoCliente("src/EJ1/Clientes.dat",clienteNovo);
                }
                case 3-> {
                    Cliente clienteMod=PreguntarModificaciones(sc);
                    if (clienteMod!=null)ListaClientes.ModificarDatos("src/EJ1/Clientes.dat", clienteMod.getId(), clienteMod.getNome(), clienteMod.getTelefono());
                }
                case 4->{
                    String id=PreguntarID(sc,"Cual es el ID del cliente que va a dar de baja? Escriba su ID");
                    ListaClientes.DarDeBaixaCliente("src/EJ1/Clientes.dat",id);
                }
            }
        }while (accion!=-1);
        sc.close();

    }

    private static String PreguntarID(Scanner sc, String mensaje) {
        String id;
        System.out.println(mensaje);
        id= sc.next();
        return id;
    }

    private static Cliente PreguntarModificaciones(Scanner sc) {
        String id,nome=" ";
        int telefono=100000000,accion;
        id=PreguntarID(sc,"Que cliente quieres modificar? Escribe su ID");
        System.out.println("Quieres cambiarle el nombre? 1:Si 2:No");
        accion= sc.nextInt();
        if (accion==1){
            System.out.println("Cual es el nuevo nombre?");
            nome= sc.next();
        }
        System.out.println("Quieres cambiarle el teléfono? 1:Si 2:No");
        accion= sc.nextInt();
        if (accion==1){
            System.out.println("Cual es el nuevo telefono?");
            telefono= sc.nextInt();
        }
        try {
            return new Cliente(id,nome,telefono);
        }catch (ExcepcionTelefonoNoValido e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static Cliente EngadirCliente(Scanner sc) {
        String id,nome;
        int telefono;
            id=PreguntarID(sc,"Cual es el ID del nuevo cliente");
            System.out.println("Cual es el nombre del nuevo cliente");
            nome = sc.next();
            System.out.println("Cual es el teléfono del nuevo cliente");
            telefono= sc.nextInt();

        try {
            return new Cliente(id,nome,telefono);
        }catch (ExcepcionTelefonoNoValido e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}