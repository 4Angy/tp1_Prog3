import java.util.ArrayList;
import java.util.List;

public class Sede {
    private int numComplejos;
    private float presupuestoAproximado;
    private List<Complejo> complejos; // composición

    public Sede(int numComplejos, float presupuestoAproximado, List<Complejo> complejos) {
        this.numComplejos = numComplejos;
        this.presupuestoAproximado = presupuestoAproximado;
        this.complejos = new ArrayList<>();
        this.numComplejos =numComplejos;
    }

    public int getNumComplejos() {
        return complejos.size();
    }

    public void setNumComplejos(int numComplejos) {
        this.numComplejos = numComplejos;
    }

    public float getPresupuestoAproximado() {
        return presupuestoAproximado;
    }

    public void setPresupuestoAproximado(float presupuestoAproximado) {
        this.presupuestoAproximado = presupuestoAproximado;
    }

    public List<Complejo> getComplejos() {
        return complejos;
    }

    public void setComplejos(List<Complejo> complejos) {
        this.complejos = complejos;
    }
    public void agregarComplejo(Complejo c) {
        complejos.add(c);
    }
    public void mostrarInfo() {
        System.out.println("Número de complejos: " + numComplejos);
        System.out.println("Presupuesto aproximado: " + presupuestoAproximado);
        System.out.println("Información de los complejos:");
        for (Complejo c : complejos) {
            c.mostrarInfo();
        }
    }
}

