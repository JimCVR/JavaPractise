package ProyectoFinal;

public class Pescador {
    private String id;
    private String nombre;
    private String edad;
    private String nacionalidad;
    private String especialidad;
    public Pescador(){
        id = "id";
        nombre = "nombre";
        edad = "18";
        nacionalidad = "español";
        especialidad = "pesca con caña";
    }
    public Pescador(String id,String nombre,String edad,String nacionalidad,String especialidad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
