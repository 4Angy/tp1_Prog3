import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Evento {
    private LocalDate fecha;
    private int duracion; // duración en horas
    private int numParticipantes;
    private List<Material> materiales;
    private List<Comisario> comisarios;

    public Evento(LocalDate fecha, int duracion, int numParticipantes) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.numParticipantes = numParticipantes;
        this.materiales = new ArrayList<>();
        this.comisarios = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public List<Material> getMateriales() {
        return Collections.unmodifiableList(materiales);
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales == null ? new ArrayList<>() : new ArrayList<>(materiales);
    }

    public List<Comisario> getComisarios() {
        return Collections.unmodifiableList(comisarios);
    }

    public void setComisarios(List<Comisario> comisarios) {
        this.comisarios = comisarios == null ? new ArrayList<>() : new ArrayList<>(comisarios);
    }

    public int getNumeroComisarios() {
        return comisarios.size();
    }

    public void agregarComisario(Comisario c) {
        if (c == null) return;
        if (!comisarios.contains(c)) {
            comisarios.add(c);
            c.agregarEvento(this); // sincroniza la relación N:M
        }
    }

    public void quitarComisario(Comisario c) {
        if (c == null) return;
        if (comisarios.remove(c)) {
            c.quitarEvento(this); // sincroniza la relación N:M
        }
    }

    public void agregarMaterial(Material m) {
        if (m == null) return;
        if (!materiales.contains(m)) {
            materiales.add(m);
            m.agregarEvento(this); // sincroniza la relación N:M
        }
    }

    public void quitarMaterial(Material m) {
        if (m == null) return;
        if (materiales.remove(m)) {
            m.quitarEvento(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Evento:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Duración: " + duracion + " horas");
        System.out.println("Número de participantes: " + numParticipantes);
        System.out.println("Número de comisarios: " + getNumeroComisarios());
        System.out.println("Materiales:");
        if (materiales.isEmpty()) System.out.println("  (ninguno)");
        else for (Material m : materiales) System.out.println(" - " + m.getNombre());
        System.out.println("Comisarios:");
        if (comisarios.isEmpty()) System.out.println("  (ninguno)");
        else for (Comisario c : comisarios) System.out.println(" - " + c.getNombre());
    }
}

