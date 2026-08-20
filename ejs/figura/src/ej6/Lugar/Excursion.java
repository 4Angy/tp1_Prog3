package Lugar;

import Individuos.Visitante;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Excursion {
    private String codigo;          // identificador único
    private LocalDate dia;
    private LocalTime hora;
    private Set<Alojamiento> alojamientos; // quienes la organizan
    private Set<Visitante> visitantes;     // quienes se inscriben

    public Excursion(String codigo, LocalDate dia, LocalTime hora) {
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
        this.alojamientos = new HashSet<>();
        this.visitantes = new HashSet<>();
    }

    public void agregarAlojamiento(Alojamiento a) {
        alojamientos.add(a);
    }

    public void inscribirVisitante(Visitante v) {
        visitantes.add(v);
    }

    public String getCodigo() { return codigo; }
    public Set<Alojamiento> getAlojamientos() { return alojamientos; }
    public Set<Visitante> getVisitantes() { return visitantes; }
}
