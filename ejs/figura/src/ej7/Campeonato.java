import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private final List<Prueba> pruebas = new ArrayList<>();

    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public Prueba crearPrueba(String nombre, String tipo, String fechaPrevista, Estacion estacion) {
        Prueba prueba = new Prueba(nombre, tipo, fechaPrevista, estacion);
        pruebas.add(prueba);
        return prueba;
    }
}
