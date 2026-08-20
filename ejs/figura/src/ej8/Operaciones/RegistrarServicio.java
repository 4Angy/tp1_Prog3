package Operaciones;

import java.util.ArrayList;
import java.util.List;

public class RegistroServicios {
    private List<Servicio> servicios = new ArrayList<>();

    public boolean agregarServicio(Servicio nuevo) {
        for (Servicio s : servicios) {
            if (s.esIgual(nuevo)) {
                System.out.println("Error: servicio duplicado para el mismo avión, fecha y tipo de trabajo.");
                return false;
            }
        }
        servicios.add(nuevo);
        return true;
    }
    public List<Servicio> getServicios() {
        return servicios;
    }
    public void mostrarServicios() {
        if (servicios.isEmpty()) {
            System.out.println("No hay servicios registrados.");
        } else {
            for (Servicio s : servicios) {
                s.mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }
}
