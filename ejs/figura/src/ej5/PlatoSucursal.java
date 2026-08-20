public class PlatoSucursal {
    private final Plato plato;
    private final Sucursal sucursal;

    public PlatoSucursal(Plato plato, Sucursal sucursal) {
        this.plato = plato;
        this.sucursal = sucursal;
    }

    public Plato getPlato() {
        return plato;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
}
