package ej1.Figura;

import ej1.Figura.elipse.Elipse;
import ej1.Figura.poligono.Poligono;

public class Figura {
    private Elipse elipse;
    private Poligono poligono;

    public Elipse getElipse() { return elipse; }
    public void setElipse(Elipse elipse) { this.elipse = elipse; }

    public Poligono getPoligono() { return poligono; }
    public void setPoligono(Poligono poligono) { this.poligono = poligono; }
}
