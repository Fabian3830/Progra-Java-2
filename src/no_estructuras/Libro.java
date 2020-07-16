package no_estructuras;

import java.io.Serializable;
import java.util.Date;

public class Libro extends MaterialPrestado implements Serializable {

    private String clasificacionDEWEY;

    public Libro() {
    }

    public Libro(String clasificacionDEWEY, Date fechaEntrega, Date fechaDevolucion,
            Cliente cedulaPersona, boolean disponibilidad, String titulo, String editorial,
            String codigoISBN, String autor, String fechaPublicacion, String genero,
            String estadoMaterial, String codigoUnidad) {
        super(fechaEntrega, fechaDevolucion, cedulaPersona, disponibilidad, titulo, editorial, codigoISBN, autor, fechaPublicacion, genero, estadoMaterial, codigoUnidad);
        this.clasificacionDEWEY = clasificacionDEWEY;
    }

   

    public String getClasificacionDEWEY() {
        return clasificacionDEWEY;
    }

    public void setClasificacionDEWEY(String clasificacionDEWEY) {
        this.clasificacionDEWEY = clasificacionDEWEY;
    }

    @Override
    public String toString() {
        return "Libro{" + super.toString() + "clasificacionDEWEY=" + clasificacionDEWEY + '}';
    }

}
