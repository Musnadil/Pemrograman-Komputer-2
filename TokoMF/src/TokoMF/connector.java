package TokoMF;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class connector {
    public static Connection konekDb(){
        Connection konek = null;
        try {
            MysqlDataSource sc = new MysqlDataSource();
            sc.setUser("root");
            sc.setPassword("");
            sc.setDatabaseName("toko");
            sc.setServerName("127.0.0.1");
            sc.setPortNumber(3306);
            sc.setAllowMultiQueries(true);
            sc.setServerTimezone("Asia/Jakarta");
            
            konek = sc.getConnection();
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return konek;
    }
    
}
