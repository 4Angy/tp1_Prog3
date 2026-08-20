package Aeronaves;

public class TipoAvion {
    private int numeroModelo;
    private float capacidad;
    private float peso;
    public TipoAvion(int numeroModelo, float capacidad, float peso) {
        this.numeroModelo = numeroModelo;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public int getNumeroModelo() {
        return numeroModelo;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public float getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "TipoAvion{" +
                "numeroModelo=" + numeroModelo +
                ", capacidad=" + capacidad +
                ", peso=" + peso +
                '}';
    }
}
