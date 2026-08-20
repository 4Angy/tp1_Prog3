import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lider extends RepresentanteVenta {
    private LocalDate fechaPromocion;
    private final List<Vendedor> equipo = new ArrayList<>();

    public Lider(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIncorporacion, LocalDate fechaPromocion) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIncorporacion);
        this.fechaPromocion = fechaPromocion;
    }

    public LocalDate getFechaPromocion() {
        return fechaPromocion;
    }

    public void setFechaPromocion(LocalDate fechaPromocion) {
        this.fechaPromocion = fechaPromocion;
    }

    public List<Vendedor> getEquipo() {
        return equipo;
    }

    public void coordinar(Vendedor vendedor) {
        equipo.add(vendedor);
        vendedor.setLider(this);
    }
}
