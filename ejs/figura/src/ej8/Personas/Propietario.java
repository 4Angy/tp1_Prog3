package Personas;

public class Propietario extends Persona{
    public Propietario(String nombre, String direccion, String telefono, int numeroSeguroSocial) {
        super(nombre, direccion, telefono, numeroSeguroSocial);
    }


    @Override
    public void mostrarInformacion() {
        System.out.println("Propietario: " + getNombre() + ", Dirección: " + getDireccion()
                + ", Teléfono: " + getTelefono() + ", Número de Seguro Social: " + getNumeroSeguroSocial());
    }
}
