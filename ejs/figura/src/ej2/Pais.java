package Ejercicio2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Pais {
    private String nombre;
    private Continente continente;
    private final Set<Pais> paisesLimitrofes=new LinkedHashSet<>();
    private final List<Provincia>provincias=new ArrayList<>();
    private Provincia capital;

    public Pais(String nombre, Continente continente) {
        this.nombre = nombre;
        this.continente = continente;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public Provincia getCapital() {
        return capital;
    }

    public void setCapital(Provincia p) {
        if (!provincias.contains(p)) {
            throw new IllegalArgumentException("La capital debe ser una provincia del pais");
        }
        this.capital = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }
    public void limitaCon(Pais p){
        if (this==p){
            throw new IllegalArgumentException("Restriccion  mismo pais}");

        }
        paisesLimitrofes.add(p);
    }

    public Provincia crearProvincia(String nombreProvincia) {
        Provincia provincia = new Provincia(nombreProvincia, this);
        provincias.add(provincia);
        return provincia;
    }
    public void mostrarInformacion() {
        System.out.println("\nPaís: " + nombre);
        System.out.println("Capital nacional: " + (capital != null ? capital.getNombre() : "No definida"));
        System.out.println("Provincias:");
        for (Provincia provincia : provincias) {
            provincia.mostrarInformacion(); // delega en Provincia
        }
        System.out.println("Países limítrofes:");
        for (Pais p : paisesLimitrofes) {
            System.out.println(" - " + p.getNombre());
        }
    }


}
