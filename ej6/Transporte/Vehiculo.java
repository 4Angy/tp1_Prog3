package Transporte;

public class Vehiculo {
    private String tipo;       // Ej: camioneta, moto, cuatriciclo
    private String matricula;  // patente

    public Vehiculo(String tipo, String matricula) {
        this.tipo = tipo;
        this.matricula = matricula;
    }

    public String getTipo() { return tipo; }
    public String getMatricula() { return matricula; }
}

