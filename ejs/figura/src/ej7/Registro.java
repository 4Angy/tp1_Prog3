public class Registro {
    private String codigo;
    private String fechas;
    private float tiempo;
    private int posicion;
    private final Prueba prueba;
    private Participante participante;
    private Grupo grupo;

    public Registro(String codigo, String fechas, float tiempo, int posicion, Prueba prueba) {
        this.codigo = codigo;
        this.fechas = fechas;
        this.tiempo = tiempo;
        this.posicion = posicion;
        this.prueba = prueba;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
