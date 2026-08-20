package Personas;

public class Mecanico extends Persona{
    private float salario;
    private String turno;
    public Mecanico(String nomre, String direccion, String telefono, int numeroSeguroSocial, float salario, String turno) {
        super(nomre, direccion, telefono, numeroSeguroSocial);
        this.salario = salario;
        this.turno = turno;
    }




    @Override
    public void mostrarInformacion() {
        System.out.println("Mecánico: " + getNombre() + ", Dirección: " + getDireccion() + ", Teléfono: " + getTelefono() + ", Salario: " + salario + ", Turno: " + turno);
    }
}
