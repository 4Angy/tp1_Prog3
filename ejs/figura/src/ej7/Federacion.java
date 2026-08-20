import java.util.ArrayList;
import java.util.List;

public class Federacion {
    private String nombre;
    private int nroFederados;
    private final List<Estacion> estaciones = new ArrayList<>();

    public Federacion(String nombre, int nroFederados) {
        this.nombre = nombre;
        this.nroFederados = nroFederados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroFederados() {
        return nroFederados;
    }

    public void setNroFederados(int nroFederados) {
        this.nroFederados = nroFederados;
    }

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public void agregarEstacion(Estacion estacion) {
        estaciones.add(estacion);
    }
}
