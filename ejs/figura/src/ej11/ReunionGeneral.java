import java.time.LocalDate;

public class ReunionGeneral {
    private LocalDate fecha;
    private LocalDate fechaProximaReunion;

    public ReunionGeneral(LocalDate fecha, LocalDate fechaProximaReunion) {
        this.fecha = fecha;
        this.fechaProximaReunion = fechaProximaReunion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFechaProximaReunion() {
        return fechaProximaReunion;
    }

    public void setFechaProximaReunion(LocalDate fechaProximaReunion) {
        this.fechaProximaReunion = fechaProximaReunion;
    }
}
