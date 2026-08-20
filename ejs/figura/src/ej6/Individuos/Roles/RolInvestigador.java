package Individuos.Roles;

import Especies.Especie;
import Lugar.Parque;
import otros.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class RolInvestigador implements Rol {
    private String titulacion;
    private Parque parque;
    private List<Proyecto> proyectos; // proyectos en los que intervino

    public RolInvestigador(String titulacion, Parque parque) {
        this.titulacion = titulacion;
        this.parque = parque;
        this.proyectos = new ArrayList<>();
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setParque(Parque parque) {
        this.parque = parque;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Investigador - Titulación: " + titulacion +
                " - Parque: " + parque.getNombre());
        for (Proyecto p : proyectos) {
            System.out.println("  Proyecto: " + p.getNombre() +
                    " | Presupuesto: $" + p.getPresupuesto() +
                    " | Periodo: " + p.getFechaInicio() + " a " + p.getFechaFin());
            for (Especie e : p.getEspeciesInvestigadas()) {
                System.out.println("    Especie: " + e.getNombreVulgar() +
                        " (" + e.getNombreCientifico() + ")");
            }
        }
    }

    @Override
    public Parque getParque() { return parque; }
}
