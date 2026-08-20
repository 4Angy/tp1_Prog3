package Especies;

public abstract class Especie {
    protected String nombreCientifico;
    protected String nombreVulgar;

    public Especie(String nombreCientifico, String nombreVulgar) {
        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = nombreVulgar;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    // Método abstracto para mostrar información específica según el tipo de especie
    public abstract void mostrarInfo();
}