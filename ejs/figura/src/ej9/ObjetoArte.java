import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class ObjetoArte {
    private int idArte;
    private String titulo;
    private String descripcion;
    private LocalDate anioCreacion;
    private String pais;
    private String cultura;
    private String epoca;
    private String estilo;
    private Pertenencia pertenencia;
    private final List<Exposicion> exposiciones = new ArrayList<>();

    public ObjetoArte(int idArte, String titulo, String descripcion, LocalDate anioCreacion, String pais, String cultura, String epoca, String estilo) {
        this.idArte = idArte;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anioCreacion = anioCreacion;
        this.pais = pais;
        this.cultura = cultura;
        this.epoca = epoca;
        this.estilo = estilo;
    }

    public int getIdArte() {
        return idArte;
    }

    public void setIdArte(int idArte) {
        this.idArte = idArte;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(LocalDate anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Pertenencia getPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(Pertenencia pertenencia) {
        this.pertenencia = pertenencia;
    }

    public List<Exposicion> getExposiciones() {
        return exposiciones;
    }

    public void mostrarInformacion() {
        System.out.println("\nObjeto #" + idArte + ": " + titulo + " (" + pais + ", " + cultura + ", " + epoca + ")");
        System.out.println("Estilo: " + estilo);
        if (pertenencia != null) {
            pertenencia.mostrarPertenencia();
        }
    }
}
