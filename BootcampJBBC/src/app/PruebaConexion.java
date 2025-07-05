package app;

import java.sql.Connection;
import java.sql.SQLException;
import util.DBConnection;

public class PruebaConexion {
    public static void  main (String [] arg) {
        try (Connection conn = DBConnection.getConnection()) {
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
    }
}
