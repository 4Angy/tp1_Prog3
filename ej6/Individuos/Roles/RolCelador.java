package Individuos.Roles;

import Lugar.Entrada;
import Lugar.Parque;

public class RolCelador implements Rol {
    private Parque parque;
    private Entrada entrada;

    public RolCelador(Parque parque, Entrada entrada) {
        this.parque = parque;
        this.entrada = entrada;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Celador - Parque: " + parque.getNombre() +
                " - Entrada Nº: " + entrada.getNumero());
    }

    @Override
    public Parque getParque() { return parque; }
}
