package ej4.clases.Cereales;
import ej4.clases.Mineral;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Cereal {
    private final String nombre;
    private final Set<Mineral> requeridos = new LinkedHashSet<>();

    public Cereal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public void agregarRequisito(Mineral mineral) {
        requeridos.add(mineral);
    }

    public Set<Mineral> getRequeridos() { return requeridos; }
}
