
package no_estructuras;

import java.io.Serializable;

/*Material tiene lo necesario para almacenar un libro en sistema*/

public class Material implements Serializable{
    private String titulo;
    private String editorial;
    private String codigoISBN;//Es lo mismo que "codigoMaterial"
    private String autor;
    private String fechaPublicacion;
    private String genero;
    private String estadoMaterial;//Pequeña descripción del estado
    private String codigoUnidad;//Anteriormente codigo prestamo

    public Material() {
    }

    public Material(String titulo, String editorial, String codigoISBN, String autor, String fechaPublicacion, String genero, String estadoMaterial, String codigoUnidad) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.codigoISBN = codigoISBN;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
        this.estadoMaterial = estadoMaterial;
        this.codigoUnidad = codigoUnidad;
    }

    public String getCodigoUnidad() {
        return codigoUnidad;
    }

    public void setCodigoUnidad(String codigoUnidad) {
        this.codigoUnidad = codigoUnidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoMaterial() {
        return estadoMaterial;
    }

    public void setEstadoMaterial(String estadoMaterial) {
        this.estadoMaterial = estadoMaterial;
    }

  
    @Override
    public String toString() {
        return "Material{" + "titulo=" + titulo + ", editorial=" + editorial + ", codigoISBN=" + codigoISBN + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion + ", genero=" + genero + ", estadoMaterial=" + estadoMaterial + ", codigoUnidad=" + codigoUnidad + '}';
    }


 
    
}
