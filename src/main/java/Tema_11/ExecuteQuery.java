package Tema_11;

import java.sql.*;
import java.util.Scanner;

public class ExecuteQuery {
    public static void main(String[]args){

    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Elige una opcion");
        System.out.println("------------------");
        System.out.println("1.Select");
        System.out.println("2.Insert");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("0.Salir");
        System.out.println("-----------------");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                String select = sc.nextLine();
                selector(select);
                break;

            case 2:
                String tabla = sc.nextLine();
                insertar(tabla);
                break;

            case 3:

                break;

            case 4:break;

            case 0: break;

        }
    }

    public static String insertar(String tabla){
        Scanner sc = new Scanner(System.in);
        String valores = "";
        String insertar = "insert into "+tabla+"(";
        char salir = 'n';
        while(salir!='s'){
            System.out.println("Introduce columna a insertar");
            insertar+=sc.nextLine();
            System.out.println("Introduce valor de la columna");
            valores += sc.nextLine();
            System.out.println("Salir? s/n");
            salir = sc.next().charAt(0);
            sc.nextLine();
            if(salir !='s') {
                insertar += ",";
                valores += ",";
            }
        }
        insertar +="values("+valores+")";
        return insertar;
    }

    public static String actualizar(String tabla){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce columna a modificar");
        String columna = sc.nextLine();
        System.out.println("Introduce valor a insertar");
        String nuevoValor = sc.nextLine();
        System.out.println("Introduce criterio para modificar las filas");
        String criterio = sc.nextLine();
        System.out.println("Introduce valor del criterio para modificar las filas");
        String valorCriterio = sc.nextLine();
        String actualizar = "update "+tabla+" set "+columna+"="+nuevoValor+"where "+criterio+" = "+valorCriterio;
        return actualizar;
    }
    public static String  borrar(String tabla){
        String borrar = "delete";
        return borrar;
    }


    public static void selector(String query){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "Atama123!");
            Statement sentencia = conexion.createStatement();
            ResultSet salida = sentencia.executeQuery(query);
            while(salida.next()){

                System.out.println(salida.getString(1));
                System.out.println(salida.getString(2));
                System.out.println(salida.getString(3));
                System.out.println(salida.getString(4));



            }
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException c){
            c.printStackTrace();
        }
    }
}
