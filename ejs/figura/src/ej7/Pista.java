import java.util.ArrayList;
import java.util.List;

public class Pista {
    private int numero;
    private float longitud;
    private String dificultad;
    private final List<Pista> componentes = new ArrayList<>();

    public Pista(int numero, float longitud, String dificultad) {
        this.numero = numero;
        this.longitud = longitud;
        this.dificultad = dificultad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public List<Pista> getComponentes() {
        return componentes;
    }

    public void seComponeDe(Pista otra) {
        if (this == otra) {
            throw new IllegalArgumentException("Una pista no puede componerse de sí misma");
        }
        if (!componentes.contains(otra)) {
            componentes.add(otra);
        }
    }
}
