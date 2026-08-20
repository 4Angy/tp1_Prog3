public class Monodeportivo extends Complejo{
    private Deporte deporteUnico;

    public Monodeportivo(String localizacion, String jefeOrganizacion, Deporte deporteUnico) {
        super(localizacion, jefeOrganizacion);
        this.deporteUnico = deporteUnico;
    }

    public Deporte getDeporteUnico() {
        return deporteUnico;
    }

    public void setDeporteUnico(Deporte deporteUnico) {
        this.deporteUnico = deporteUnico;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Monodeportivo:");
        mostrarAreasYEventos();
        System.out.println("Deporte único: " + (deporteUnico != null ? deporteUnico.getNombre() : "(sin asignar)"));
    }
}
