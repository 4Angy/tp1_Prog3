package ej4.clases;

import ej4.clases.enums.TipoMineral;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Mineral {
    private String nombre;
    private TipoMineral tipo;
    private final Set<Lote> lotes = new LinkedHashSet<>();

    public Mineral(String nombre, TipoMineral tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMineral getTipo() {
        return tipo;
    }

    public void setTipo(TipoMineral tipo) {
        this.tipo = tipo;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }
}
