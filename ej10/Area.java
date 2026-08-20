public class Area {
    private Deporte deporte;
    private String situacion;

    public Area(Deporte deporte, String situacion) {
        this.deporte = deporte;
        this.situacion = situacion;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }
    public void mostrarInfo() {
        System.out.println("Área:");
        System.out.println("Deporte: " + deporte.getNombre());
        System.out.println("Situación: " + situacion);
    }

}
