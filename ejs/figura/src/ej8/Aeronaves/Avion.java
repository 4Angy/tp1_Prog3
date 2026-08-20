package Aeronaves;

public class Avion {
    private String matricula;
    private TipoAvion tipoAvion;
    private Hangar hangar;
    public Avion(String matricula,TipoAvion tipoAvion) {
        this.matricula = matricula;
        this.tipoAvion = tipoAvion;
    }

    public String getMatricula() {
        return matricula;
    }

    public TipoAvion getTipoAvion() {
        return tipoAvion;
    }

    public Hangar getHangar() {
        return hangar;
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }
    public void mostrarInformacion() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Tipo de Avión: " + tipoAvion);
        if (hangar != null) {
            System.out.println("Hangar: " + hangar.getNumero() + ", Ubicación: " + hangar.getUbicacion());
        } else {
            System.out.println("Hangar: No asignado");
        }
    }
}