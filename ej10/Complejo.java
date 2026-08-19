import java.util.ArrayList;
import java.util.List;

public abstract class Complejo {
    private String localizacion;
    private String jefeOrganizacion;
    private List<Area> areas;
    private List<Evento> eventos;

    public Complejo(String localizacion, String jefeOrganizacion) {
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areas = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public Complejo(String localizacion, String jefeOrganizacion, List<Area> areas) {
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areas = areas == null ? new ArrayList<>() : new ArrayList<>(areas);
        this.eventos = new ArrayList<>();
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getJefeOrganizacion() {
        return jefeOrganizacion;
    }

    public void setJefeOrganizacion(String jefeOrganizacion) {
        this.jefeOrganizacion = jefeOrganizacion;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas == null ? new ArrayList<>() : new ArrayList<>(areas);
    }

    public void agregarArea(Deporte deporte, String situacion) {
        areas.add(new Area(deporte, situacion));
    }

    // Eventos que se celebran en el complejo
    public List<Evento> getEventos() {
        return eventos;
    }

    public void agregarEvento(Evento evento) {
        if (evento == null) return;
        if (!eventos.contains(evento)) eventos.add(evento);
    }

    public void quitarEvento(Evento evento) {
        eventos.remove(evento);
    }

    // Mostrar información común: áreas y eventos
    protected void mostrarAreasYEventos() {
        System.out.println("Localización: " + getLocalizacion());
        System.out.println("Jefe de organización: " + getJefeOrganizacion());
        System.out.println("Áreas:");
        if (areas.isEmpty()) System.out.println("  (ninguna)");
        else for (Area a : areas) a.mostrarInfo();

        System.out.println("Eventos en el complejo:");
        if (eventos.isEmpty()) System.out.println("  (ninguno)");
        else for (Evento e : eventos) System.out.println(" - " + e.getFecha() + " (" + e.getDuracion() + " hs)");
    }

    public abstract void mostrarInfo();
}
