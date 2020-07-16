package no_estructuras;

import java.io.Serializable;
import java.util.Date;

public class Actividad implements Serializable {

    private String nombre;
    private Date fecha;
    private String id;
    private String descripcion;
    private int cupos;
    private int cantidad_asistencia;

    public Actividad(String nombre, Date fecha, String id, String descripcion, int cupos,int cantidad_asistenci) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.id = id;
        this.descripcion = descripcion;
        this.cupos = cupos;
        this.cantidad_asistencia=cantidad_asistenci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public int getCantidad_asistencia() {
        return cantidad_asistencia;
    }

    public void setCantidad_asistencia(int cantidad_asistencia) {
        this.cantidad_asistencia = cantidad_asistencia;
    }

    

}
