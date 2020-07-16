package no_estructuras;

import java.io.Serializable;
import java.util.Date;

public class Cliente extends Persona implements Serializable {

    private boolean moroso;
    private MaterialPrestado libroPrestado;
    private MaterialPrestado revistaPrestado;
    private MaterialPrestado periodicoPrestado;
    private Date fecha_sancion;
    private MaterialApoyo material_prestado;
    String id_actividad;
    boolean asisten_a_algo;
    
    public Cliente() {
    }

    public Cliente(String id_actividad,boolean moroso, MaterialPrestado libroPrestado, Date fecha_sancion, String nombre, String cedula, String email, String telefono, String direccion) {
        super(nombre, cedula, email, telefono, direccion);
        this.moroso = moroso;
        this.libroPrestado = libroPrestado;
        this.fecha_sancion = fecha_sancion;
        this.id_actividad=id_actividad;
         this.asisten_a_algo=false;
    }

    public MaterialApoyo getMaterial_prestar() {
        return material_prestado;
    }

    public void setMaterial_prestar(MaterialApoyo material_prestar) {
        this.material_prestado = material_prestar;
    }

    public MaterialPrestado getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(MaterialPrestado libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    public Date getFecha_sancion() {
        return fecha_sancion;
    }

    public void setFecha_sancion(Date fecha_sancion) {
        this.fecha_sancion = fecha_sancion;
    }

    public String getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(String id_actividad) {
        this.id_actividad = id_actividad;
    }

    public boolean isAsisten_a_algo() {
        return asisten_a_algo;
    }

    public void setAsisten_a_algo(boolean asisten_a_algo) {
        this.asisten_a_algo = asisten_a_algo;
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "moroso=" + moroso + ", libroPrestado=" + libroPrestado + ", revistaPrestado=" + revistaPrestado + ", periodicoPrestado=" + periodicoPrestado + ", fecha_sancion=" + fecha_sancion + ", material_prestado=" + material_prestado + '}';
    }

    public MaterialPrestado getRevistaPrestado() {
        return revistaPrestado;
    }

    public void setRevistaPrestado(MaterialPrestado revistaPrestado) {
        this.revistaPrestado = revistaPrestado;
    }

    public MaterialPrestado getPeriodicoPrestado() {
        return periodicoPrestado;
    }

    public void setPeriodicoPrestado(MaterialPrestado periodicoPrestado) {
        this.periodicoPrestado = periodicoPrestado;
    }

    public MaterialApoyo getMaterial_prestado() {
        return material_prestado;
    }

    public void setMaterial_prestado(MaterialApoyo material_prestado) {
        this.material_prestado = material_prestado;
    }

}
