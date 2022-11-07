package Tema_8.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado{
    private Coche cocheEmpresa;
    private String movil;
    private String areaVenta;
    private List <String> listaClientes;
    private double comision;
    public Vendedor (String nombre,String apellidos,String dni,String direccion,String telefono, double salario){
        super(nombre, apellidos, dni, direccion, telefono, salario);
        cocheEmpresa = new Coche();
        movil = "123456789";
        areaVenta = "AreaA";
        listaClientes = new ArrayList<>();
    }
    public Vendedor (String nombre,String apellidos,String dni,String direccion,String telefono, double salario,
                     String movil, String areaVenta,String matricula, String marca, String modelo){
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.movil = movil;
        this.areaVenta = areaVenta;
        cocheEmpresa = new Coche(matricula,marca,modelo);
        listaClientes = new ArrayList<>();
    }
    public Vendedor (String nombre,String apellidos,String dni,String direccion,String telefono, double salario,
                     String movil, String areaVenta,String matricula, String marca, String modelo,List <String> listaClientes){
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.listaClientes = listaClientes;
        cocheEmpresa = new Coche(matricula,marca,modelo);
    }
    public void añadirCLiente(String cliente){
        listaClientes.add(cliente);
    }
    public void eliminarCliente(String cliente){
        listaClientes.remove(cliente);
    }
    public void cambiarCoche(String matricula, String marca, String modelo){
        cocheEmpresa = new Coche(matricula,marca,modelo);
    }

    @Override
    public String toString() {
        return super.toString()+"Vendedor{" +
                "cocheEmpresa=" + cocheEmpresa +
                ", movil='" + movil + '\'' +
                ", areaVenta='" + areaVenta + '\'' +
                ", listaClientes=" + listaClientes +
                ", comision=" + comision +
                '}';
    }
}
