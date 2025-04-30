import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TratamentoDeClientes {
    public static void main(String[] args){
        Collection<Cliente> coleccionCliente;
        coleccionCliente = new ArrayList<>();
        coleccionCliente.add(new Cliente("00000023T","Pepe","12/05/1989"));
        coleccionCliente.add(new Cliente("00000024S","jose","19/06/1995"));
        coleccionCliente.add(new Cliente("00000025S","McLovin","13/07/2015"));
        System.out.println(coleccionCliente);
        Cliente unCliente = new Cliente("02000025S","Cabo","11/08/2013");
        coleccionCliente.add(unCliente);


        Object[] col= coleccionCliente.toArray();
        System.out.println(col[0]);

        Iterator<Cliente> iterador = coleccionCliente.iterator();

        for (; iterador.hasNext();){
            if (iterador.next().dni.equals("00000023T")){
                iterador.remove();
            }
        }
        System.out.println(coleccionCliente);

        /*

        int cantidadClientes =0;
        int edadTotal =0;

        for (; iterador.hasNext();){
            edadTotal = edadTotal + iterador.next().edade();

            cantidadClientes++;
        }

        if (cantidadClientes!=0){
            edadTotal = edadTotal/cantidadClientes;
        }

        System.out.println(edadTotal);

         */

        System.out.println(coleccionCliente.size());
        coleccionCliente.remove(unCliente);

        //coleccionCliente.clear();
        System.out.println(coleccionCliente.isEmpty());
        System.out.println(coleccionCliente.contains(unCliente));

        Collection<Cliente> outrosClientes = new ArrayList<>();
        outrosClientes.add(new Cliente("546M","Juan","24/02/1985"));
        outrosClientes.add(new Cliente("4896C","Mari","10/03/1998"));
        outrosClientes.add(new Cliente("123456U","Victor","11/04/2018"));

        coleccionCliente.addAll(outrosClientes);
        System.out.println(coleccionCliente);
        System.out.println(coleccionCliente.containsAll(outrosClientes));
    }
}
