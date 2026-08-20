import java.util.ArrayList;
import java.util.List;

public class Plato {
    private String nombre;
    private final List<PlatoSucursal> apariciones = new ArrayList<>();

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PlatoSucursal> getApariciones() {
        return apariciones;
    }

    void agregarAparicion(PlatoSucursal platoSucursal) {
        if (apariciones.size() >= 20) {
            throw new IllegalArgumentException("Un plato no puede ofrecerse en más de 20 sucursales");
        }
        apariciones.add(platoSucursal);
    }
}
