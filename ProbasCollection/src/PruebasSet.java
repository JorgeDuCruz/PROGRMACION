import java.util.TreeSet;

public class PruebasSet {
    public static void main(String[] args) {

        TreeSet<Cliente> conxuntoClientes = new TreeSet<>();
        conxuntoClientes.add(new Cliente("00000023T", "Pepe", "12/05/1989"));
        conxuntoClientes.add(new Cliente("00000024S", "jose", "19/06/1995"));
        conxuntoClientes.add(new Cliente("00000025S", "McLovin", "13/07/2015"));

        Cliente unCliente = new Cliente("02000025S","Cabo","11/08/2013");
        conxuntoClientes.add(unCliente);
        conxuntoClientes.add(unCliente);

        System.out.println(conxuntoClientes);
    }
}
