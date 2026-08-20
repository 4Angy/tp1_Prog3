package Especies;

public class Ominivoro extends Animal{
    public Ominivoro(String nombreCientifico, String nombreVulgar, String periodoCelo) {
        super(nombreCientifico, nombreVulgar, periodoCelo);
    }

    @Override
    public boolean puedeComer(Especie especie) {
        return (especie instanceof Animal || especie instanceof Vegetal);
    }
}
