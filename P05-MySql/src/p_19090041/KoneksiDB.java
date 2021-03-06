package p_19090041;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {

    public static Connection sambungDB() {
        String JDBC_DRIVER_CLASS = "com.mysql.jdbc.Driver";
        String username = "root";
        String host = "localhost";
        String port = "3306";
        String password = "";
        String dbName = "phb_java_mysql";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
        Connection kon = null;
        try {
            Class.forName(JDBC_DRIVER_CLASS).newInstance();
            kon = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi: Sukses!");
            return kon;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(0);
        }
        return null;
    }
}

