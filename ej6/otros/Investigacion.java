package otros;

import Especies.Especie;
import Individuos.Roles.RolInvestigador;

import java.util.ArrayList;
import java.util.List;

public class Investigacion {
    private RolInvestigador investigador;
    private Proyecto proyecto;
    private List<Especie> especies;

    public Investigacion(RolInvestigador investigador, Proyecto proyecto, List<Especie> especies) {
        this.investigador = investigador;
        this.proyecto = proyecto;
        this.especies = (especies != null) ? especies : new ArrayList<>();
    }

    public void agregarEspecie(Especie e) {
        if (e == null) return;
        if (especies == null) especies = new ArrayList<>();
        especies.add(e);
        if (proyecto != null) proyecto.agregarEspecie(e);
    }

    public void agregarEspecies(List<Especie> es) {
        if (es == null) return;
        for (Especie e : es) agregarEspecie(e);
    }

    public List<Especie> getEspecies() {
        if (especies == null) especies = new ArrayList<>();
        return especies;
    }

    public void mostrarInvestigacion() {
        System.out.println("Investigación:");
        System.out.println("  Investigador: " + investigador.getParque().getNombre() +
                " - Titulación: " + investigador.getTitulacion());
        System.out.println("  Proyecto: " + proyecto.getNombre() +
                " | Presupuesto: $" + proyecto.getPresupuesto() +
                " | Periodo: " + proyecto.getFechaInicio() + " a " + proyecto.getFechaFin());
        for (Especie e : especies) {
            System.out.println("    Especie: " + e.getNombreVulgar() +
                    " (" + e.getNombreCientifico() + ")");
        }
    }
}