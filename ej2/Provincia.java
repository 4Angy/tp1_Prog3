package Ejercicio2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Provincia {
    private String nombre;
    private final List<Ciudad> ciudades = new ArrayList<>();
    private Ciudad capital;                    // ROL de asociación, no un String
    private final Set<Provincia> limitrofes = new LinkedHashSet<>();
    private Pais pais;

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public Ciudad getCapital() {
        return capital;
    }


    public Set<Provincia> getLimitrofes() {
        return limitrofes;
    }
    /** La capital debe ser una de sus ciudades (rol de asociación). */
    public void setCapital(Ciudad c) {
        if (!ciudades.contains(c))
            throw new IllegalArgumentException("La capital debe ser una ciudad de la provincia");
        this.capital = c;
    }


    public void limitarCon(Provincia otra) {
        if (this.getPais() != otra.getPais())
            throw new IllegalArgumentException("Restriccion {mismo pais}");
        limitrofes.add(otra);
        otra.limitrofes.add(this);   // bidireccional
    }
    public void mostrarInformacion() {
        System.out.println("Provincia: " + nombre);
        System.out.println("Capital provincial: " + capital.getNombre());
        System.out.println("Ciudades:");
        for (Ciudad c : ciudades) {
            System.out.println(" - " + c.getNombre());
        }

        System.out.println("Limita con:");
        for (Provincia p : limitrofes) {
            System.out.println(" - Provincia: " + p.getNombre());

        }
    }

}

