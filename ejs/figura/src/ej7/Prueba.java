public class Prueba {
    private String nombre;
    private String tipo;
    private String fechaPrevista;
    private String ganador;
    private float tiempoGanador;
    private final Estacion estacion;

    public Prueba(String nombre, String tipo, String fechaPrevista, Estacion estacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaPrevista = fechaPrevista;
        this.estacion = estacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaPrevista() {
        return fechaPrevista;
    }

    public void setFechaPrevista(String fechaPrevista) {
        this.fechaPrevista = fechaPrevista;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public float getTiempoGanador() {
        return tiempoGanador;
    }

    public void setTiempoGanador(float tiempoGanador) {
        this.tiempoGanador = tiempoGanador;
    }

    public Estacion getEstacion() {
        return estacion;
    }
}
