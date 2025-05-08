import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploClaseCollections {
    public static void main(String[] args) {
        List<Cliente> coleccionCliente;
        coleccionCliente = new ArrayList<>();


        coleccionCliente.add(new Cliente("00000023T","Pepe","12/05/1989"));
        coleccionCliente.add(new Cliente("00000024S","Jose","19/06/1995"));
        coleccionCliente.add(new Cliente("00000025S","McLovin","13/07/2015"));
        coleccionCliente.add( new Cliente("02000025S","Cabo","11/08/2013"));

        System.out.println(coleccionCliente);

        System.out.println(Collections.max(coleccionCliente));
        System.out.println(Collections.max(coleccionCliente, new CompararDNI()));

        Collections.sort(coleccionCliente,new CompararDNI());
        int indiceProba = Collections.binarySearch(coleccionCliente,new Cliente(null,"","01/01/0011"));
        System.out.println(coleccionCliente);
        System.out.println(indiceProba);

        int indice = Collections.binarySearch(coleccionCliente,new Cliente("02000025S",null,"01/02/1000"),new CompararDNI());
        System.out.println(coleccionCliente.get(indice));

        Collections.shuffle(coleccionCliente);
        System.out.println("Mezclado: \n"+coleccionCliente);

        Collections.swap(coleccionCliente,0,3);
        System.out.println(coleccionCliente);

        Collections.replaceAll(coleccionCliente,coleccionCliente.get(0),new Cliente("7777Z","Ryu","10/05/0753"));
        System.out.println(coleccionCliente);
        Collections.fill(coleccionCliente,new Cliente("1111A","Syr","01/02/0001"));
        System.out.println(coleccionCliente);

        List<Cliente> copiaClientes = new ArrayList<>(coleccionCliente.size());
        copiaClientes.add(new Cliente("","","05/12/1546"));
        Collections.copy(coleccionCliente,copiaClientes);

        copiaClientes.remove(0);
        System.out.println(copiaClientes);
        System.out.println(coleccionCliente);

        int frecuencia = Collections.frequency(coleccionCliente,new Cliente("1111A","Syr","01/02/0001"));
        System.out.println(frecuencia);
    }
}
