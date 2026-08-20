package Lugar;

import Individuos.Visitante;

import java.util.ArrayList;
import java.util.List;

public class Entrada {
    private int numero;              // número de la entrada (1..n)
    private String ubicacion;
    private String horario;
    private List<Visitante> visitas;    // registros de visitas

    public Entrada(int numero, String ubicacion, String horario) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.visitas = new ArrayList<>();
    }

    public void registrarVisita(Visitante visita) {
        visitas.add(visita);
    }

    public int getNumero() { return numero; }
    public String getUbicacion() { return ubicacion; }
    public String getHorario() { return horario; }
    public List<Visitante> getVisitas() { return visitas; }

}

