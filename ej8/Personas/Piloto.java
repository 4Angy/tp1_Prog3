package Personas;

import Aeronaves.TipoAvion;

import java.util.LinkedHashSet;
import java.util.Set;

public class Piloto extends Persona{
   private int numeroLicencia;
   private String restricciones;
    private Set<TipoAvion> tiposAutorizados = new LinkedHashSet<>();
    public Piloto(String nombre, String direccion, String telefono, int numeroSeguroSocial, int numeroLicencia, String restricciones, Set<TipoAvion> tiposAutorizados) {
        super(nombre, direccion, telefono, numeroSeguroSocial);
        this.numeroLicencia = numeroLicencia;
        this.restricciones = restricciones;
        this.tiposAutorizados = tiposAutorizados;
    }

    public Set<TipoAvion> getTiposAutorizados() {
        return tiposAutorizados;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setTiposAutorizados(Set<TipoAvion> tiposAutorizados) {
        this.tiposAutorizados = tiposAutorizados;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Piloto: " + getNombre() + ", Dirección: " + getDireccion()
                + ", Teléfono: " + getTelefono() + ", Número de Seguro Social: " + getNumeroSeguroSocial()
                + ", Tipos Autorizados: " + tiposAutorizados + ", Número de Licencia: " + numeroLicencia + ", Restricciones: " + restricciones);
    }
}
