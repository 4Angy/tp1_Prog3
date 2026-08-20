import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private final List<Restaurante> restaurantesFrecuentados = new ArrayList<>();
    private final List<PlatoSucursal> platosQueLeGustan = new ArrayList<>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Restaurante> getRestaurantesFrecuentados() {
        return restaurantesFrecuentados;
    }

    public List<PlatoSucursal> getPlatosQueLeGustan() {
        return platosQueLeGustan;
    }

    public void frecuentar(Restaurante restaurante) {
        if (!restaurantesFrecuentados.contains(restaurante)) {
            restaurantesFrecuentados.add(restaurante);
        }
    }

    public void leGusta(PlatoSucursal platoSucursal) {
        if (!platosQueLeGustan.contains(platoSucursal)) {
            platosQueLeGustan.add(platoSucursal);
        }
    }
}
