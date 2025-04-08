package EJ2;

public class FormatoDataErroneo extends Exception {
    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String toString() {
        return "Formato de data erroneo";
    }
}
