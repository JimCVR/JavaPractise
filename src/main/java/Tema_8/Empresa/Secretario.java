package Tema_8.Empresa;

public class Secretario extends Empleado {
    private boolean despacho;
    private String fax;
    public Secretario(String nombre,String apellidos,String dni,String direccion,String telefono, double salario){
        super(nombre, apellidos, dni, direccion, telefono, salario);
        despacho = true;
        fax = "12345678910";
    }
    public Secretario(String nombre,String apellidos,String dni,String direccion,String telefono, double salario,String fax){
        super(nombre, apellidos, dni, direccion, telefono, salario);
        despacho = true;
        this.fax = fax;
    }

    @Override
    public String toString() {
        return super.toString()+"Secretario{" +
                "despacho=" + despacho +
                ", fax='" + fax + '\'' +
                '}';
    }
}
