import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private int codigo;
    private String entrenador;
    private final List<Participante> participantes = new ArrayList<>();

    public Grupo(int codigo, String entrenador) {
        this.codigo = codigo;
        this.entrenador = entrenador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }
}
