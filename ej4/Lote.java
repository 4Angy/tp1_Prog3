package ej4.clases;

import ej4.clases.Cereales.Cereal;
import ej4.clases.Cereales.Pastura;
import ej4.clases.enums.TipoMineral;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Lote {
    private String nombre;
    private final Set<Mineral> contiene = new LinkedHashSet<>();
    private final List<Cereal> historicoSiembra = new ArrayList<>();

    public Lote(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMineral(Mineral mineral) {
        contiene.add(mineral);
        mineral.getLotes().add(this); // mantener relación N:M
    }
    public boolean esEspecial() {
        for (Mineral m : contiene) {
            if (m.getTipo() == TipoMineral.PRIMARIO) {
                return true;
            }
        }
        return false;
    }
    public boolean satisface(Cereal c) {
        if (!contiene.containsAll(c.getRequeridos())) return false;
        if (c instanceof Pastura) {                        // regla del historial
            boolean pasturaPrevia = historicoSiembra.stream()
                    .anyMatch(x -> x instanceof Pastura);
            if (pasturaPrevia) return false;
        }
        return true;
    }

    public Set<Mineral> getContiene() {
        return contiene;
    }

    public List<Cereal> getHistoricoSiembra() {
        return historicoSiembra;
    }
}
