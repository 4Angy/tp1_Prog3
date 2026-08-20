import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private final List<Provincia> provincias = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public Provincia crearProvincia(int habitantes) {
        Provincia provincia = new Provincia(habitantes, this);
        provincias.add(provincia);
        return provincia;
    }

    public void mostrarInformacion() {
        System.out.println("\nPaís: " + nombre);
        for (Provincia p : provincias) {
            p.mostrarInformacion();
        }
    }
}
