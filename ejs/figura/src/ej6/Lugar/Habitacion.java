package Lugar;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private String nombre;              // identificador dentro del alojamiento
    private int capacidad;              // cuántos visitantes admite
    private List<Reserva> reservas;     // historial de reservas

    public Habitacion(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.reservas = new ArrayList<>(); // inicializada en el constructor
    }

    public String getNombre() { return nombre; }
    public int getCapacidad() { return capacidad; }
    public List<Reserva> getReservas() { return reservas; }

    // Método para agregar una reserva
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
}
