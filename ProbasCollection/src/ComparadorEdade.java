import java.util.Comparator;

public class ComparadorEdade implements Comparator<Cliente> {
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return c1.compareTo(c2);
    }
}
