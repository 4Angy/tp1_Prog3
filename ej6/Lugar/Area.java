package Lugar;

import Especies.Especie;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private String nombre;
    private double km2;
    private List<IndividuosPorArea> individuosPorArea; // relación con especies

    public Area(String nombre, double km2) {
        this.nombre = nombre;
        this.km2 = km2;
        this.individuosPorArea = new ArrayList<>();
    }

    // Método para agregar especie con nº de individuos
    public void agregarEspecie(Especie especie, int cantidadIndividuos) {
        IndividuosPorArea registro = new IndividuosPorArea(this, especie, cantidadIndividuos);
        individuosPorArea.add(registro);
    }

    public String getNombre() { return nombre; }
    public double getKm2() { return km2; }
    public List<IndividuosPorArea> getIndividuosPorArea() { return individuosPorArea; }
}
