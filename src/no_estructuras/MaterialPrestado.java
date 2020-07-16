
package no_estructuras;

import java.io.Serializable;
import java.util.Date;


public class MaterialPrestado extends Material implements Serializable{
    private Date fechaEntrega;
    private Date fechaDevolucion;
    private Cliente cedulaPersona;
    private boolean disponibilidad;
    
    public MaterialPrestado() {
    }

    public MaterialPrestado(Date fechaEntrega, Date fechaDevolucion, Cliente cedulaPersona, boolean disponibilidad, String titulo, String editorial, String codigoISBN, String autor, String fechaPublicacion, String genero, String estadoMaterial, String codigoUnidad) {
        super(titulo, editorial, codigoISBN, autor, fechaPublicacion, genero, estadoMaterial, codigoUnidad);
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
        this.cedulaPersona = cedulaPersona;
        this.disponibilidad = disponibilidad;
    }


    public MaterialPrestado(String titulo, String editorial, String codigoISBN, String autor, String fechaPublicacion, String genero, String estadoMaterial, String codigoUnidad) {
        super(titulo, editorial, codigoISBN, autor, fechaPublicacion, genero,estadoMaterial, codigoUnidad);
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


    public Cliente getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(Cliente cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

  

    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
