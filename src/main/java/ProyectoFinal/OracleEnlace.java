package ProyectoFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleEnlace {
    public static final  String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    public  static final String USER ="system";
    public static final String PASS = "system";

    public static void cargarDriver(){
        try{
            Class.forName(DRIVER);
        }catch(ClassNotFoundException s){
            s.printStackTrace();
        }
    }
    public static Connection establecerConexion() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASS);
    }
}
