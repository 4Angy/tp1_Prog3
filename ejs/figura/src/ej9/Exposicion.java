import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exposicion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private final List<ObjetoArte> objetosExhibidos = new ArrayList<>();

    public Exposicion(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<ObjetoArte> getObjetosExhibidos() {
        return objetosExhibidos;
    }

    public void exhibir(ObjetoArte objeto) {
        objetosExhibidos.add(objeto);
        objeto.getExposiciones().add(this);
    }
}
