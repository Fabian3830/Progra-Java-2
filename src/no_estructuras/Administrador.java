package no_estructuras;

import java.io.Serializable;

public class Administrador extends Persona implements Serializable {

    String Nombre_cuenta;
    String Contrasena_cuenta;

    public Administrador(String Nombre_cuenta, String Contrasena_cuenta, String nombre, String cedula, String email, String telefono, String direccion) {
        super(nombre, cedula, email, telefono, direccion);
        this.Nombre_cuenta = Nombre_cuenta;
        this.Contrasena_cuenta = Contrasena_cuenta;
    }

    public Administrador() {
    }

    public String getNombre_cuenta() {
        return Nombre_cuenta;
    }

    public void setNombre_cuenta(String Nombre_cuenta) {
        this.Nombre_cuenta = Nombre_cuenta;
    }

    public String getContrasena_cuenta() {
        return Contrasena_cuenta;
    }

    public void setContrasena_cuenta(String Contrasena_cuenta) {
        this.Contrasena_cuenta = Contrasena_cuenta;
    }

    public boolean anadirAdministrador() {

        return this.Nombre_cuenta.equals("") || this.Contrasena_cuenta.equals("")
                || this.getCedula().equals("") || this.getNombre().equals("")
                || this.getTelefono().equals("") || this.getDireccion().equals("")||this.getEmail().equals("");

    }

    public void eliminarAdministrador() {
       
    }

    public void anadirUsuario() {

    }

    @Override
    public String toString() {
        return "Administrador{" + "Nombre_cuenta=" + Nombre_cuenta + ", Contrasena_cuenta=" + Contrasena_cuenta + " " + super.toString() + '}';
    }

}
