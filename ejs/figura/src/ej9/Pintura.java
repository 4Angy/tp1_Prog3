import java.time.LocalDate;

public class Pintura extends ObjetoArte {
    private String tipoPintura;
    private String soporte;

    public Pintura(int idArte, String titulo, String descripcion, LocalDate anioCreacion, String pais, String cultura, String epoca, String estilo, String tipoPintura, String soporte) {
        super(idArte, titulo, descripcion, anioCreacion, pais, cultura, epoca, estilo);
        this.tipoPintura = tipoPintura;
        this.soporte = soporte;
    }

    public String getTipoPintura() {
        return tipoPintura;
    }

    public void setTipoPintura(String tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
