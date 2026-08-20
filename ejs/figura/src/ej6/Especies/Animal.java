package Especies;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal extends Especie{
    private List<Especie> dieta=new ArrayList<>();
    private String periodoCelo;

    public Animal(String nombreCientifico, String nombreVulgar,String periodoCelo) {
        super(nombreCientifico, nombreVulgar);
        this.periodoCelo=periodoCelo;
    }

    public String getPeriodoCelo() {
        return periodoCelo;
    }

    public void setPeriodoCelo(String periodoCelo) {
        this.periodoCelo = periodoCelo;
    }

    public List<Especie> getDieta() {
        return dieta;
    }

    public void setDieta(List<Especie> dieta) {
        this.dieta = dieta;
    }

    public void agregarAlimento(Especie especie) {
        if (puedeComer(especie) && !especie.getNombreCientifico().equals(this.getNombreCientifico())) {
            dieta.add(especie);
        }
    }
    public abstract boolean puedeComer(Especie especie);
    @Override
    public void mostrarInfo() {
        System.out.println(getNombreVulgar() + " (" + getNombreCientifico() + ")");
        System.out.println("Periodo de celo: " + periodoCelo);
        System.out.println("Dieta:");
        dieta.forEach(e -> System.out.println(" - " + e.getNombreVulgar()));
    }
}
