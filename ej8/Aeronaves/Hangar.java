package Aeronaves;

import java.util.LinkedHashSet;
import java.util.Set;

public class Hangar {
      public int numero;
      public float capacidad;
      public String ubicacion;
      public Set<Avion> aviones=new LinkedHashSet<>();

    public Hangar(int numero, String ubicacion, float capacidad, Set<Avion> aviones) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.aviones = aviones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Set<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(Set<Avion> aviones) {
        this.aviones = aviones;
    }
    public void agregarAvion(Avion avion) {
        if (!aviones.contains(avion)) {
            aviones.add(avion);
        }
    }
    public void removerAvion(Avion avion) {
        if (aviones.contains(avion)) {
            aviones.remove(avion);
        }
    }

    @Override
    public String toString() {
        String salida="Hangar{" +
                "numero=" + numero +
                ", capacidad=" + capacidad +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
        for (Avion avion : aviones) {
            salida += ", avion=" + avion;
        }
        return salida;
    }
}