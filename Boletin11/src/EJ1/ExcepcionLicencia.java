package EJ1;

public class ExcepcionLicencia extends RuntimeException {
    @Override
    public String toString() {
        return "LicenciaNonValida";
    }
}
