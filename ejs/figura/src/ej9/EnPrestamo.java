import java.time.LocalDate;

public class EnPrestamo implements Pertenencia {
    private LocalDate fechaRecepcion;
    private LocalDate fechaDevolucion;
    private final ColeccionExterna coleccionExterna;

    public EnPrestamo(LocalDate fechaRecepcion, LocalDate fechaDevolucion, ColeccionExterna coleccionExterna) {
        this.fechaRecepcion = fechaRecepcion;
        this.fechaDevolucion = fechaDevolucion;
        this.coleccionExterna = coleccionExterna;
    }

    public LocalDate getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(LocalDate fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public ColeccionExterna getColeccionExterna() {
        return coleccionExterna;
    }

    @Override
    public void mostrarPertenencia() {
        System.out.println("En préstamo de " + coleccionExterna.getNombre() +
                " - Recibido: " + fechaRecepcion + " - Devolución: " + fechaDevolucion);
    }
}
