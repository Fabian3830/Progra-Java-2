package no_estructuras;

import java.io.Serializable;
import java.util.Date;

/*Material apoyo son las computadores o cualquier equipo de este estilo*/
public class MaterialApoyo implements Serializable {

    private String nombre;
    private String marca;
    private String codigo;
    private String descripcion;
    private boolean disponibilidad;
    private Date fechaEntrega;
    private Date fechaDevolucion;
    private String cedula;

    public MaterialApoyo() {
    }

    public MaterialApoyo(String nombre, String marca, String codigo, String descripcion, boolean disponibilidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

  
    

    
    @Override
    public String toString() {
        return "MaterialApoyo{" + "nombre=" + nombre + ", marca=" + marca + ", codigo=" + codigo + ", descripcion=" + descripcion + ", disponibilidad=" + disponibilidad + ", fechaEntrega=" + fechaEntrega + ", fechaDevolucion=" + fechaDevolucion + ", cedula=" + cedula + '}';
    }

    
}
