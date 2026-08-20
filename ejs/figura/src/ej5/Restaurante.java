import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private final List<Sucursal> sucursales = new ArrayList<>();

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public Sucursal crearSucursal(String nombre) {
        Sucursal sucursal = new Sucursal(nombre, this);
        sucursales.add(sucursal);
        return sucursal;
    }
}
