package Lugar;

public class Alojamiento {
    private String nombre;
    private int capacidad;
    private String categoria;
    public Alojamiento(String nombre, int capacidad, String categoria) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.categoria = categoria;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        // Si es el mismo objeto en memoria → true
        if (this == o) return true;

        // Si no es un Alojamiento → false
        if (!(o instanceof Alojamiento)) return false;

        // Comparo por nombre
        Alojamiento otro = (Alojamiento) o;
        return nombre.equalsIgnoreCase(otro.nombre);
    }

    @Override
    public int hashCode() {
        // El hash se basa solo en el nombre
        return nombre.toLowerCase().hashCode();
    }
}
