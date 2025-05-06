import java.util.Comparator;

public class ComparadorNome  implements Comparator<Cliente> {

    public int compare(Cliente c1, Cliente c2){
        return c1.nome.compareTo(c2.nome);
    }
}
