package Individuos.Roles;

import Lugar.Area;
import Lugar.Parque;
import Transporte.Vehiculo;

public class RolGuarda implements Rol {
    private Area area;
    private Parque parque;
    private Vehiculo vehiculo; // cada guarda tiene un vehículo asignado

    public RolGuarda(Area area, Parque parque, Vehiculo vehiculo) {
        this.area = area;
        this.parque = parque;
        this.vehiculo = vehiculo;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Guarda - Área: " + area.getNombre() +
                " - Parque: " + parque.getNombre() +
                " - Vehículo: " + vehiculo.getTipo() +
                " (" + vehiculo.getMatricula() + ")");
    }

    @Override
    public Parque getParque() { return parque; }
}

