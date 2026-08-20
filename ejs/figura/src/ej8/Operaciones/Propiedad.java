package Operaciones;

import Aeronaves.Avion;
import Personas.Propietario;

import java.time.LocalDate;

public class Propiedad {
    private LocalDate fechaAdquisicion;
    private Propietario propietario;
    private Avion avion;

    public Propiedad(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    public void mostrarInformacion() {
        System.out.println("Fecha de Adquisición: " + fechaAdquisicion);
        if (propietario != null) {
            propietario.mostrarInformacion();
        } else {
            System.out.println("Propietario: No asignado");
        }
        if (avion != null) {
            avion.mostrarInformacion();
        } else {
            System.out.println("Avión: No asignado");
        }
    }
}