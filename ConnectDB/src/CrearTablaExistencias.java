import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablaExistencias {
    public static void crearTabla() {
        Connection conexion;
        String url= "jdbc:postgresql://10.0.8.109:5432/recambios";
        String sqlCreacion = "CREATE TABLE existencias ("+
                "referencia VARCHAR(50) NOT NULL,"+
                "descripcion VARCHAR(250),"+
                "cantidade INTEGER,"+
                "prezo DOUBLE PRECISION,"+
                "PRIMARY KEY (referencia))";
        try {
            conexion = DriverManager.getConnection(url, "jorge", "jorge");
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sqlCreacion);
        } catch (SQLException e) {
            System.out.println("Erro na execucion do programa "+e.getMessage());
        }
    }
}
