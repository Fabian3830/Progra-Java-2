/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_estructuras;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rebeca
 */
public class Revista extends MaterialPrestado implements Serializable{
    private String descripcion;
    
    public Revista() {
        super();
    }

    public Revista(String descripcion, Date fechaEntrega, Date fechaDevolucion, Cliente cedulaPersona, boolean disponibilidad, String titulo, String editorial, String codigoISBN, String autor, String fechaPublicacion, String genero, String estadoMaterial, String codigoUnidad) {
        super(fechaEntrega, fechaDevolucion, cedulaPersona, disponibilidad, titulo, editorial, codigoISBN, autor, fechaPublicacion, genero, estadoMaterial, codigoUnidad);
        this.descripcion = descripcion;
    }

    public Revista(String descripcion, String titulo, String editorial, String codigoISBN, String autor, String fechaPublicacion, String genero, String estadoMaterial, String codigoUnidad) {
        super(titulo, editorial, codigoISBN, autor, fechaPublicacion, genero, estadoMaterial, codigoUnidad);
        this.descripcion = descripcion;
    }

    

 
    

    @Override
    public String toString() {
        return "Revista{"+super.toString() + '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

   
    
}
