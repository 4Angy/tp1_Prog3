package Lugar;

import Individuos.Visitante;

import java.time.LocalDate;

public class Reserva {
    private Visitante visitante;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Reserva(Visitante visitante, Habitacion habitacion,
                   LocalDate fechaInicio, LocalDate fechaFin) {
        this.visitante = visitante;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Visitante getVisitante() { return visitante; }
    public Habitacion getHabitacion() { return habitacion; }
    public LocalDate getFechaInicio() { return fechaInicio; }
    public LocalDate getFechaFin() { return fechaFin; }
}
