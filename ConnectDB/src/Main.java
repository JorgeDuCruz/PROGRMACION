import java.sql.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Connection conexion;
        String url= "jdbc:postgresql://10.0.8.109:5432/recambios";

        try {
            conexion = DriverManager.getConnection(url, "jorge", "jorge");
            Statement sentencia = conexion.createStatement();
            String select = "SELECT referencia,descripcion,cantidade,prezo from existencias order by referencia";
            ResultSet resultados = sentencia.executeQuery(select);

            while(resultados.next()){
                String referencia = resultados.getString("referencia");
                String descripcion = resultados.getString("descripcion");
                Integer cantidade = resultados.getInt("cantidade");
                Double prezo = resultados.getDouble("prezo");
                System.out.println(referencia+", "+descripcion+", "+cantidade+", "+prezo);
            }
        } catch (SQLException e) {
            System.out.println("Erro na execucion do programa "+e.getMessage());
        }
    }
}