package Individuos;

import Individuos.Roles.Rol;

import java.util.ArrayList;
import java.util.List;

public class Personal {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private float sueldo;
    private String nroSegSocial;
    private List<Rol> roles;

    public Personal(String dni, String nombre, String direccion, String telefono, float sueldo, String nroSegSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.nroSegSocial = nroSegSocial;
        this.roles = new ArrayList<>();
    }

    public void agregarRol(Rol rol) {
        roles.add(rol);
    }

    public void mostrarInfo() {
        System.out.println("Personal: " + nombre + " (" + dni + ")");
        System.out.println("Dirección: " + direccion + " | Tel: " + telefono);
        System.out.println("Sueldo: $" + sueldo + " | Nº SS: " + nroSegSocial);
        for (Rol rol : roles) {
            rol.mostrarRol();
        }
    }
}

