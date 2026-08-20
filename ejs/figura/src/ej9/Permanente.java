import java.time.LocalDate;

public class Permanente implements Pertenencia {
    private LocalDate fechaAdquisicion;
    private float coste;
    private boolean enExposicion;

    public Permanente(LocalDate fechaAdquisicion, float coste, boolean enExposicion) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.coste = coste;
        this.enExposicion = enExposicion;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public boolean isEnExposicion() {
        return enExposicion;
    }

    public void setEnExposicion(boolean enExposicion) {
        this.enExposicion = enExposicion;
    }

    @Override
    public void mostrarPertenencia() {
        System.out.println("Colección permanente - Adquirido: " + fechaAdquisicion +
                " - Coste: " + coste + " - En exposición: " + enExposicion);
    }
}
