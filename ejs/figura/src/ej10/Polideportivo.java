import java.util.ArrayList;
import java.util.List;

public class Polideportivo extends Complejo {
    private List<Deporte> deportes;

    public Polideportivo(String localizacion, String jefeOrganizacion) {
        super(localizacion, jefeOrganizacion);
        this.deportes = new ArrayList<>();
    }

    public List<Deporte> getDeportes() {
        return new ArrayList<>(deportes);
    }

    public void setDeportes(List<Deporte> deportes) {
        this.deportes = deportes == null ? new ArrayList<>() : new ArrayList<>(deportes);
    }

    public void agregarDeporte(Deporte d) {
        if (d == null) return;
        if (!deportes.contains(d)) deportes.add(d);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Polideportivo:");
        mostrarAreasYEventos();
        System.out.println("Deportes disponibles:");
        if (deportes.isEmpty()) System.out.println("  (ninguno)");
        else for (Deporte d : deportes) System.out.println(" - " + d.getNombre());
    }

}