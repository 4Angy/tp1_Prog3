import java.util.ArrayList;
import java.util.List;

public class Comisario {
    private String nombre;
    private String dni;
    private List<Evento> eventos;

    public Comisario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        if (evento != null && !eventos.contains(evento)) {
            eventos.add(evento);
        }
    }

    public void quitarEvento(Evento evento) {
        eventos.remove(evento);
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrarInfo() {
        System.out.println("Comisario: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Eventos involucrados:");
        for (Evento e : eventos) {
            System.out.println("- " + e.getFecha() + " - " + e.getDuracion() + " hs");
        }
    }
}

