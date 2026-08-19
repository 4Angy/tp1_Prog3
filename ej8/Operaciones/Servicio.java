package Operaciones;

import Aeronaves.Avion;
import Personas.Mecanico;

import java.time.LocalDate;

public class Servicio {
    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;
    private int numeroHorasInvertidas;
    private TipoTrabajo tipoTrabajo;
    private Mecanico mecanico;
    private Avion avion;

    public Servicio(LocalDate fechaInicio, LocalDate fechaFinalizacion, int numeroHorasInvertidas, TipoTrabajo tipoTrabajo, Mecanico mecanico, Avion avion) {
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.numeroHorasInvertidas = numeroHorasInvertidas;
        this.tipoTrabajo = tipoTrabajo;
        this.mecanico = mecanico;
        this.avion = avion;

    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public int getNumeroHorasInvertidas() {
        return numeroHorasInvertidas;
    }

    public void setNumeroHorasInvertidas(int numeroHorasInvertidas) {
        this.numeroHorasInvertidas = numeroHorasInvertidas;
    }

    public TipoTrabajo getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public boolean esIgual(Servicio otro) {
        return this.avion.equals(otro.avion) &&
                this.fechaInicio.equals(otro.fechaInicio) &&
                this.tipoTrabajo.equals(otro.tipoTrabajo);

    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    public void mostrarInformacion() {
        System.out.println("Servicio:");
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha de Finalización: " + fechaFinalizacion);
        System.out.println("Número de Horas Invertidas: " + numeroHorasInvertidas);
        System.out.println("Tipo de Trabajo: " + tipoTrabajo);
        if (mecanico != null) {
            mecanico.mostrarInformacion();
        } else {
            System.out.println("Mecánico: No asignado");
        }
        if (avion != null) {
            avion.mostrarInformacion();
        } else {
            System.out.println("Avión: No asignado");
        }
    }
}