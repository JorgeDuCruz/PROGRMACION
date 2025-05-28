import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RellenarTablaExistencias {
    public static void rellenar() {
        Connection conexion;
        String url= "jdbc:postgresql://10.0.8.109:5432/recambios";

        try {
            conexion = DriverManager.getConnection(url, "jorge", "jorge");
            Statement sentencia = conexion.createStatement();
            String sql = "INSERT INTO existencias (referencia, descripcion, cantidade, prezo)"+
                    "VALUES ('000XX3','xunta_de_trocola',15,23.52)";
            sentencia.executeUpdate(sql);

            sql = "INSERT INTO existencias (referencia, descripcion, cantidade, prezo)"+
                    "VALUES ('0002303','trocola_high_tech',-2,302.50)";
            sentencia.executeUpdate(sql);

            sql = "INSERT INTO existencias (referencia, descripcion, cantidade, prezo)"+
                    "VALUES ('880U23','tubarro_guapo',5,134.56)";
            sentencia.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Erro na execucion do programa "+e.getMessage());
        }
    }
}
