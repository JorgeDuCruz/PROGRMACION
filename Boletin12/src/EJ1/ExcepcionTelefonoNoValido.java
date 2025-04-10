package EJ1;

public class ExcepcionTelefonoNoValido extends RuntimeException {
    @Override
    public String toString() {
        return "Telefono invalido";
    }

    @Override
    public String getMessage() {
        return toString();
    }
}
