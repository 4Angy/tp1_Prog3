package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nombre;
    private List<Pais> paises;


    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new ArrayList<>();
    }
    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInformacion() {
        System.out.println("\nContinente: " + nombre);
        for (Pais p : paises) {
            p.mostrarInformacion(); // delega en País
        }
    }

}
