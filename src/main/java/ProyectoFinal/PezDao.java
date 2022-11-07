package ProyectoFinal;

import java.sql.*;


public class PezDao {

    public static String select(String nombre){
        String salida = "";
        try{
            OracleEnlace.cargarDriver();
            Connection cn = OracleEnlace.establecerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from pez where nombre = '"+nombre.toLowerCase()+"'");

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                salida += rs.getString(1) + ";";
                salida += rs.getString(2) + ";";
                salida += rs.getString(3) + ";";
                salida += rs.getString(4) + ";";
                salida += rs.getString(5) + ";";
                salida += rs.getString(6) + ";";
            }
            return salida;
        }catch(SQLException s){
            s.printStackTrace();
            return "";
        }
    }
    public static int insert(Pez pez) {
        try{
            OracleEnlace.cargarDriver();
            Connection cn = OracleEnlace.establecerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into pez values(?,?,?,?,?,?)");
            ps.setString(1,pez.getNombre().toLowerCase());
            ps.setString(2,pez.getLongitudCm());
            ps.setString(3, pez.getPesoKg());
            ps.setString(4,pez.getLocalizacion());
            ps.setString(5,pez.getRecordLongitud());
            ps.setString(6,pez.getRecordOwnerId());
            return ps.executeUpdate();

        }catch(SQLException s){
            return 0;
        }
    }
    public static int delete(String nombre) {
        try{
            OracleEnlace.cargarDriver();
            Connection cn = OracleEnlace.establecerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from pez where nombre = '"+nombre.toLowerCase()+"'");
            return ps.executeUpdate();
        }catch(SQLException s){
            return 0;
        }
    }
    public static int update(String nombre, String columna, String valor) {

        try{
            OracleEnlace.cargarDriver();
            Connection cn = OracleEnlace.establecerConexion();
            PreparedStatement ps = cn.prepareStatement("update pez set "+columna+"= ? where nombre = '"+nombre.toLowerCase()+"'");
            ps.setString(1, valor);
            return ps.executeUpdate();

        }catch(SQLException s){
            return 0;
        }
    }
}
