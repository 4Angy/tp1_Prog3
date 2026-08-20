import java.time.LocalDate;

public class Escultura extends ObjetoArte {
    private String material;
    private float altura;
    private float peso;

    public Escultura(int idArte, String titulo, String descripcion, LocalDate anioCreacion, String pais, String cultura, String epoca, String estilo, String material, float altura, float peso) {
        super(idArte, titulo, descripcion, anioCreacion, pais, cultura, epoca, estilo);
        this.material = material;
        this.altura = altura;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
