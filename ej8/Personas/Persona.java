package Personas;

public abstract class Persona{
    private String nombre;
    private String direccion;
    private String telefono;
    private int numeroSeguroSocial;

    public Persona(String nomre, String direccion, String telefono, int numeroSeguroSocial) {
        this.nombre = nomre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    abstract void mostrarInformacion();
}