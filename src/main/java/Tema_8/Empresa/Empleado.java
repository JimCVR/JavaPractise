package Tema_8.Empresa;

public class Empleado {
    private String nombre,apellidos,dni,direccion,telefono;
    private int antiguedad;
    private double salario;
    private Empleado supervisor;


    public Empleado (){
        this.nombre = "Supervisor";
        this.apellidos = "A";
        this.dni = "12345678A";
        this.direccion = "Calle A";
        this.telefono = "123456789";
        this.salario = 0;
        antiguedad = 0;

    }
    public Empleado (String nombre,String apellidos,String dni,String direccion,String telefono, double salario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        antiguedad = 0;
        supervisor = new Empleado();
    }
    public void cambiarSupervisor(String nombre,String apellidos,String dni,String direccion,String telefono, double salario){
        supervisor = new Empleado(nombre,apellidos,dni,direccion,telefono,salario);
    }
    public void incrementarSalario(double incremento){
        salario += incremento;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", antiguedad=" + antiguedad +
                ", salario=" + salario +
                ", supervisor=" + supervisor +
                '}';
    }
}
