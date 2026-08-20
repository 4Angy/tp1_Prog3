package otros;

import Especies.Especie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private double presupuesto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Especie> especiesInvestigadas;

    public Proyecto(String nombre, double presupuesto, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.especiesInvestigadas = new ArrayList<>();
    }

    public void agregarEspecie(Especie especie) {
        especiesInvestigadas.add(especie);
    }

    public String getNombre() { return nombre; }
    public double getPresupuesto() { return presupuesto; }
    public LocalDate getFechaInicio() { return fechaInicio; }
    public LocalDate getFechaFin() { return fechaFin; }
    public List<Especie> getEspeciesInvestigadas() { return especiesInvestigadas; }
}
