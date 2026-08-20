import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private String nombre;
    private final List<Restaurante> restaurantes = new ArrayList<>();

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }
}
