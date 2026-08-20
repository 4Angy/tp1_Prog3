import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private final Restaurante restaurante;
    private final List<PlatoSucursal> menu = new ArrayList<>();

    public Sucursal(String nombre, Restaurante restaurante) {
        this.nombre = nombre;
        this.restaurante = restaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public List<PlatoSucursal> getMenu() {
        return menu;
    }

    public PlatoSucursal ofrecerPlato(Plato plato) {
        PlatoSucursal platoSucursal = new PlatoSucursal(plato, this);
        menu.add(platoSucursal);
        plato.agregarAparicion(platoSucursal);
        return platoSucursal;
    }
}
