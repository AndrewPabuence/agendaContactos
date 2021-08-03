package Principal;

public class Contacto {
    private String nombre, correo, numeroT;

    public Contacto(String nombre, String correo, String numeroT) {
        this.nombre = nombre;
        this.correo = correo;
        this.numeroT = numeroT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroT() {
        return numeroT;
    }

    public void setNumeroT(String numeroT) {
        this.numeroT = numeroT;
    }
}
