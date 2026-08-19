package Especies;

public class Vegetal extends Especie{
    private boolean tieneFloracion;
    private String periodoFloracion;

    public Vegetal(String nombreCientifico, String nombreVulgar,boolean tieneFloracion) {
        super(nombreCientifico, nombreVulgar);
        this.tieneFloracion=tieneFloracion;
    }

    public boolean isTieneFloracion() {
        return tieneFloracion;
    }

    public void setTieneFloracion(boolean tieneFloracion) {
        this.tieneFloracion = tieneFloracion;
    }

    public String getPeriodoFloracion() {
        return periodoFloracion;
    }

    public void setPeriodoFloracion(String periodoFloracion) {

        if (tieneFloracion) {
            this.periodoFloracion = periodoFloracion;
        } else {
            this.periodoFloracion = null;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println(getNombreVulgar() + " (" + getNombreCientifico() + ")");
        System.out.println("Tiene floracion: " + tieneFloracion);
        System.out.println("Periodo :"+periodoFloracion);
    }
}
