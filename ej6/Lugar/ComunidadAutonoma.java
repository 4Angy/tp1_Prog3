package Lugar;

import java.util.ArrayList;
import java.util.List;

public class ComunidadAutonoma {
    private String nombre;
    private String organismoResponsable;
    private List<Parque> parques;

    public ComunidadAutonoma(String nombre, String organismoResponsable) {
        this.nombre = nombre;
        this.organismoResponsable = organismoResponsable;
        this.parques = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganismoResponsable() {
        return organismoResponsable;
    }

    public void setOrganismoResponsable(String organismoResponsable) {
        this.organismoResponsable = organismoResponsable;
    }

    public void setParques(List<Parque> parques) {
        this.parques = parques;
    }

    public void agregarParque(Parque parque) {
        parques.add(parque);
        parque.agregarComunidad(this); // mantener la relación bidireccional
    }

    public List<Parque> getParques() {
        return parques;
    }
}
