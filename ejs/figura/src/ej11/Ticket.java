import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha;
    private float precio;
    private final Producto producto;
    private final RepresentanteVenta representante;
    private Cliente clienteFinal;

    public Ticket(LocalDate fecha, float precio, Producto producto, RepresentanteVenta representante) {
        this.fecha = fecha;
        this.precio = precio;
        this.producto = producto;
        this.representante = representante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public RepresentanteVenta getRepresentante() {
        return representante;
    }

    public Cliente getClienteFinal() {
        return clienteFinal;
    }

    public void registrarClienteFinal(Cliente clienteFinal) {
        this.clienteFinal = clienteFinal;
    }
}
