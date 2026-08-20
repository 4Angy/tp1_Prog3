package Lugar;

import Especies.Especie;

public class IndividuosPorArea {
    private Area area;
    private Especie especie;
    private int cantidadIndividuos;

    public IndividuosPorArea(Area area, Especie especie, int cantidadIndividuos) {
        this.area = area;
        this.especie = especie;
        this.cantidadIndividuos = cantidadIndividuos;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public void setCantidadIndividuos(int cantidadIndividuos) {
        this.cantidadIndividuos = cantidadIndividuos;
    }

    public int getCantidadIndividuos() {
        return cantidadIndividuos;
    }
}
