package Tema_11;
/*
* Actividades programar con bases de datos


1 muestra todos los datos de la tabla EMP indicando nombre de campo para cada

2 muestra todos los datos de la tabla DEPT

3 muestra cada empleado con el nombre y localidad de su departamento

4 obtener el salario medio de cada departamento

5 por cada departamento mostrar el nombre y salario del empleado que más gane y el que menos

*
* */
import java.sql.SQLException;
import java.sql.*;
public class Consultas {
    public static void main(String[]args){
        select();
    }
    public static void select(){
        //Consulta 1
        // String select = "SELECT * FROM EMPLE";
        // Consulta 2
        // String select = "SELECT * FROM DEPART";
        //Consulta 3
        //String select = "SELECT APELLIDO,LOC FROM EMPLE JOIN DEPART ON EMPLE.DEPT_NO = DEPART.DEPT_NO";
        //Consulta 4
        //String select = "SELECT DNOMBRE,AVG(SALARIO) FROM EMPLE JOIN DEPART ON DEPART.DEPT_NO = EMPLE.DEPT_NO GROUP BY DNOMBRE";
        //Consulta 5
        String select = "SELECT APELLIDO,DNOMBRE,SALARIO " +
                "FROM EMPLE " +
                "JOIN DEPART ON DEPART.DEPT_NO = EMPLE.DEPT_NO " +
                "WHERE SALARIO IN " +
                "(SELECT MAX(SALARIO) FROM EMPLE " +
                "JOIN DEPART ON DEPART.DEPT_NO = EMPLE.DEPT_NO  " +
                "GROUP BY DNOMBRE)";

        String select2 = "SELECT APELLIDO,DNOMBRE,SALARIO " +
                "FROM EMPLE " +
                "JOIN DEPART ON DEPART.DEPT_NO = EMPLE.DEPT_NO " +
                "WHERE SALARIO IN " +
                "(SELECT MIN(SALARIO) FROM EMPLE " +
                "JOIN DEPART ON DEPART.DEPT_NO = EMPLE.DEPT_NO  " +
                "GROUP BY DNOMBRE)";

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "Atama123!");
            Statement sentencia = connect.createStatement();
            ResultSet salida = sentencia.executeQuery(select);

            while(salida.next()){
                //Salida de consulta 1
               /* System.out.println("Numero Empleado: "+salida.getInt(1));
                System.out.println("Apellido: "+salida.getString(2));
                System.out.println("Oficio: "+salida.getString(3));
                System.out.println("Dir: "+salida.getInt(4));
                System.out.println("Fecha_alt: "+salida.getString(5));
                System.out.println("Salario: "+salida.getInt(6));
                System.out.println("Comision: "+salida.getInt(7));
                System.out.println("Numero Depart: "+salida.getInt(8));
                System.out.println("-----------------------------------");*/

                //Salida de consulta 2
               /* System.out.println("Numero Depart: "+salida.getInt(1));
                System.out.println("Departamento: "+salida.getString(2));
                System.out.println("Localizacion: "+salida.getString(3));
                System.out.println("-----------------------------------");*/

                //Salida de consulta 3
                /*System.out.println("Apellido: "+salida.getString(1));
                System.out.println("Localizacion: "+salida.getString(2));
                System.out.println("-----------------------------------");*/

                //Salida de consulta 4
                /*System.out.println("Departamento: "+salida.getString(1));
                System.out.println("Salario Medio: "+salida.getInt(2));
                System.out.println("-----------------------------------");*/

                //Salida de consulta 5
                System.out.println("MAXIMO SALARIO");
                System.out.println("Apellido: "+salida.getString(1));
                System.out.println("Departamento: "+salida.getString(2));
                System.out.println("Salario: "+salida.getInt(3));

            }
            salida = sentencia.executeQuery(select2);
            
            while(salida.next()){
                //Salida de consulta 5
                System.out.println("MINIMO SALARIO");
                System.out.println("Apellido: "+salida.getString(1));
                System.out.println("Departamento: "+salida.getString(2));
                System.out.println("Salario: "+salida.getInt(3));
                System.out.println("-----------------------------------");
            }
            salida.close();

        }catch(ClassNotFoundException e){
            System.out.printf("Driver not found %s\n");
        }catch(SQLException s){
            System.err.println("SQL Exception");
            System.out.println(s.getMessage());
            s.printStackTrace();
        }
    }
}
