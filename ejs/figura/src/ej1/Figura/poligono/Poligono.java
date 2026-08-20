package ej1.Figura.poligono;

import ej1.Figura.poligono.cuadrilatero.Cuadrilatero;
import ej1.Figura.poligono.punto.Lado;

public abstract class Poligono {

    private Triangulo triangulo;
    private Cuadrilatero cuadrilatero;
    private Lado lado;


    public Triangulo getTriangulo() { return triangulo; }
    public void setTriangulo(Triangulo triangulo) { this.triangulo = triangulo; }

    public Cuadrilatero getCuadrilatero() { return cuadrilatero; }
    public void setCuadrilatero(Cuadrilatero cuadrilatero) { this.cuadrilatero = cuadrilatero; }

    public Lado getLado() { return lado; }
    public void setLado(Lado lado) { this.lado = lado; }

}
