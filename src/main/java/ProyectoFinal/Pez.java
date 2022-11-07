package ProyectoFinal;

public class Pez {
    private String nombre;
    private String longitudCm;
    private String pesoKg;
    private String localizacion;
    private String recordLongitud;
    private String recordOwnerId;
    public Pez(){

        nombre = "nombre";
        longitudCm = "100";
        pesoKg = "10";
        localizacion = "bahia de cadiz";
        recordLongitud = "100";
        recordOwnerId = "703";
    }
    public Pez(String nombre,String longitudCm,String pesoKg,String localizacion,String recordLongitud,String recordOwnerId){
        this.nombre = nombre;
        this.longitudCm = longitudCm;
        this. pesoKg = pesoKg;
        this.localizacion = localizacion;
        this.recordLongitud = recordLongitud;
        this.recordOwnerId = recordOwnerId;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLongitudCm() {
        return longitudCm;
    }

    public void setLongitudCm(String longitudCm) {
        this.longitudCm = longitudCm;
    }

    public String getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(String pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getRecordLongitud() {
        return recordLongitud;
    }

    public void setRecordLongitud(String recordLongitud) {
        this.recordLongitud = recordLongitud;
    }

    public String getRecordOwnerId() {
        return recordOwnerId;
    }

    public void setRecordOwnerId(String recordOwnerId) {
        this.recordOwnerId = recordOwnerId;
    }
}
