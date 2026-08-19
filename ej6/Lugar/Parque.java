package Lugar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Parque {
    private String nombre;
    private LocalDate fechaDeclaracion;
    private List<ComunidadAutonoma> comunidades;
    private Set<Area> areas;
    private Set<Alojamiento> alojamientos = new LinkedHashSet<>();
    private List<Entrada> entradas;
    public Parque(String nombre, LocalDate fechaDeclaracion) {
        this.nombre = nombre;
        this.fechaDeclaracion = fechaDeclaracion;
        this.comunidades = new ArrayList<>();   // ← inicialización necesaria
        this.areas = new LinkedHashSet<>();
        this.entradas = new ArrayList<>();
        this.alojamientos = new LinkedHashSet<>();
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeclaracion() {
        return fechaDeclaracion;
    }

    public void setFechaDeclaracion(LocalDate fechaDeclaracion) {
        this.fechaDeclaracion = fechaDeclaracion;
    }

    public void setComunidades(List<ComunidadAutonoma> comunidades) {
        this.comunidades = comunidades;
    }

    public Set<Area> getAreas() {
        return areas;
    }

    public void setAreas(Set<Area> areas) {
        this.areas = areas;
    }

    public Set<Alojamiento> getAlojamientos() {
        return alojamientos;
    }

    public void setAlojamientos(Set<Alojamiento> alojamientos) {
        this.alojamientos = alojamientos;
    }

    public Area agregarArea(String nombreArea, double km2) {
        Area nueva = new Area(nombreArea, km2);
        if (!areas.add(nueva)) {
            throw new IllegalArgumentException("Ya existe un área con el nombre: " + nombreArea);
        }
        return nueva;
    }


    public void agregarComunidad(ComunidadAutonoma comunidad) {
        if (!comunidades.contains(comunidad)) {
            comunidades.add(comunidad);
        }
    }

    public List<ComunidadAutonoma> getComunidades() {
        return comunidades;
    }

    public double calcularSuperficieTotal() {
        return areas.stream().mapToDouble(Area::getKm2).sum();
    }

    public boolean agregarAlojamiento(Alojamiento a) {
        return alojamientos.add(a);
        // devuelve false si ya existía uno con el mismo nombre
    }


    public void agregarEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

}

