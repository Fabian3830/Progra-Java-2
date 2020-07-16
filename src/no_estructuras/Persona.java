package no_estructuras;

import java.io.Serializable;

public class Persona implements Serializable{

    private String nombre;
    private String cedula;
    private String email;
    private String telefono;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombre, String cedula, String email, String telefono, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

    
    
}
