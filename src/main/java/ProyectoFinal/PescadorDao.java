package ProyectoFinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PescadorDao{

    public static String select(Integer id){
        String salida = "";
        try{
            OracleEnlace.cargarDriver();
            Connection cn = OracleEnlace.establecerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from pescador where id = "+id);

            ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    salida += rs.getString(1) + ";";
                    salida += rs.getString(2) + ";";
                    salida += rs.getString(3) + ";";
                    salida += rs.getString(4) + ";";
                    salida += rs.getString(5) + ";";
                }
            return salida;
        }catch(SQLException s){
            s.printStackTrace();
            return "";
        }
    }
    public static int insert(Pescador pescador) {
        try{
            OracleEnlace.cargarDriver();
            Connection cn = OracleEnlace.establecerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into pescador values(?,?,?,?,?)");
            ps.setString(1,pescador.getId());
            ps.setString(2,pescador.getNombre());
            ps.setString(3, pescador.getEdad());
            ps.setString(4,pescador.getNacionalidad());
            ps.setString(5,pescador.getEspecialidad());
            return ps.executeUpdate();

        }catch(SQLException s){
            return 0;
        }
    }
    public static int delete(Integer id) {
        try{
            OracleEnlace.cargarDriver();
            Connection cn = OracleEnlace.establecerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from pescador where id = "+id);
            return ps.executeUpdate();
        }catch(SQLException s){
            return 0;
        }
    }
    public static int update(String id, String columna, String valor) {

        try{
            OracleEnlace.cargarDriver();
            Connection cn = OracleEnlace.establecerConexion();
            PreparedStatement ps = cn.prepareStatement("update pescador set "+columna+"= ? where id = "+id);
            ps.setString(1, valor);
            return ps.executeUpdate();

        }catch(SQLException s){
            return 0;
        }
    }
}
