package Individuos;

public class Visitante {
    private String dni;
    private String nombre;
    private String profesion;

    public Visitante(String dni, String nombre, String profesion) {
        this.dni = dni;
        this.nombre = nombre;
        this.profesion = profesion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
