package Especies;

public class Herbivoro extends Animal{
    public Herbivoro(String nombreCientifico, String nombreVulgar, String periodoCelo) {
        super(nombreCientifico, nombreVulgar, periodoCelo);
    }

    @Override
    public boolean puedeComer(Especie especie) {
        return especie instanceof Vegetal;
    }
}
