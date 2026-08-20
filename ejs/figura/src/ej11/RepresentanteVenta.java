import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class RepresentanteVenta {
    private String nombre;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String cuitCuil;
    private LocalDate fechaIncorporacion;
    private final List<Cliente> cartera = new ArrayList<>();
    private final List<Ticket> tickets = new ArrayList<>();

    public RepresentanteVenta(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuitCuil = cuitCuil;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCuitCuil() {
        return cuitCuil;
    }

    public void setCuitCuil(String cuitCuil) {
        this.cuitCuil = cuitCuil;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public List<Cliente> getCartera() {
        return cartera;
    }

    public Cliente agregarCliente(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        Cliente cliente = new Cliente(nombre, direccion, telefono, fechaNacimiento, fechaIngreso, this);
        cartera.add(cliente);
        return cliente;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public Ticket comprarProducto(LocalDate fecha, Producto producto) {
        Ticket ticket = new Ticket(fecha, producto.getPrecioVenta(), producto, this);
        tickets.add(ticket);
        return ticket;
    }
}
