import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Material{
    private String nombre;
    private String descripcion;
    private List<Evento> eventos;

    public Material(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.eventos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Relación N:M: Eventos que usan este material
    public void agregarEvento(Evento evento) {
        if (evento == null) return;
        if (!eventos.contains(evento)) eventos.add(evento);
    }

    public void quitarEvento(Evento evento) {
        eventos.remove(evento);
    }

    public List<Evento> getEventos() {
        return Collections.unmodifiableList(eventos);
    }

    public void mostrarInfo() {
        System.out.println("Material:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Usado en eventos: " + eventos.size());
    }
}
