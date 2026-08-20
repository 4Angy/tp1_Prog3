import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private int habitantes;
    private final List<Ciudad> ciudades = new ArrayList<>();
    private Pais pais;

    public Provincia(int habitantes, Pais pais) {
        this.habitantes = habitantes;
        this.pais = pais;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public Pais getPais() {
        return pais;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public Ciudad crearCiudad(int habitantes, float imp1, float imp2, float imp3, float imp4, float imp5, float costosDeMantenimiento) {
        Ciudad ciudad = new Ciudad(habitantes, imp1, imp2, imp3, imp4, imp5, costosDeMantenimiento);
        ciudades.add(ciudad);
        return ciudad;
    }

    public boolean mayoriaEnDeficit() {
        if (ciudades.isEmpty()) {
            return false;
        }
        int enDeficit = 0;
        for (Ciudad c : ciudades) {
            if (c.estaEnDeficit()) {
                enDeficit++;
            }
        }
        return enDeficit > ciudades.size() / 2.0;
    }

    public void mostrarInformacion() {
        System.out.println("  Provincia (" + habitantes + " habitantes) - En déficit: " + mayoriaEnDeficit());
        for (Ciudad c : ciudades) {
            c.mostrarInformacion();
        }
    }
}
