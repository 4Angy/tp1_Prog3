import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private String nombre;
    private String contactos;
    private String direccion;
    private String telefono;
    private String kilometros;
    private String nroPistas;
    private final List<Pista> pistas = new ArrayList<>();

    public Estacion(String nombre, String contactos, String direccion, String telefono, String kilometros, String nroPistas) {
        this.nombre = nombre;
        this.contactos = contactos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.kilometros = kilometros;
        this.nroPistas = nroPistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContactos() {
        return contactos;
    }

    public void setContactos(String contactos) {
        this.contactos = contactos;
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

    public String getKilometros() {
        return kilometros;
    }

    public void setKilometros(String kilometros) {
        this.kilometros = kilometros;
    }

    public String getNroPistas() {
        return nroPistas;
    }

    public void setNroPistas(String nroPistas) {
        this.nroPistas = nroPistas;
    }

    public List<Pista> getPistas() {
        return pistas;
    }

    public Pista crearPista(int numero, float longitud, String dificultad) {
        Pista pista = new Pista(numero, longitud, dificultad);
        pistas.add(pista);
        return pista;
    }
}
