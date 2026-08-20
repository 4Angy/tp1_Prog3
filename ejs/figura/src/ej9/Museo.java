import java.util.ArrayList;
import java.util.List;

public class Museo {
    private final List<ObjetoArte> objetosArte = new ArrayList<>();
    private final List<Exposicion> exposiciones = new ArrayList<>();

    public List<ObjetoArte> getObjetosArte() {
        return objetosArte;
    }

    public List<Exposicion> getExposiciones() {
        return exposiciones;
    }

    public void agregarObjetoArte(ObjetoArte objeto) {
        objetosArte.add(objeto);
    }

    public void agregarExposicion(Exposicion exposicion) {
        exposiciones.add(exposicion);
    }

    public void mostrarInformacion() {
        System.out.println("=== Colección del museo ===");
        for (ObjetoArte objeto : objetosArte) {
            objeto.mostrarInformacion();
        }
    }
}
