/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_estructuras;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JOptionPane;
import static no_estructuras.jfmPeriodico.periodico;
import static no_estructuras.jfmPeriodico.txtModCodigoUni;
import static no_estructuras.jfmPeriodico.txtModDescripcion;
import static no_estructuras.jfmPeriodico.txtModEditorial;
import static no_estructuras.jfmPeriodico.txtModEstado;
import static no_estructuras.jfmPeriodico.txtModFecha;
import static no_estructuras.jfmPeriodico.txtModTitulo;

/**
 *
 * @author Rebeca
 */
public class Periodico extends MaterialPrestado implements Serializable,Materiales{
    private String descripcion;
    
    public Periodico() {
        super();
    }

    public Periodico(String descripcion, Date fechaEntrega, Date fechaDevolucion, Cliente cedulaPersona, boolean disponibilidad, String titulo, String editorial, String codigoISBN, String autor, String fechaPublicacion, String genero, String estadoMaterial, String codigoUnidad) {
        super(fechaEntrega, fechaDevolucion, cedulaPersona, disponibilidad, titulo, editorial, codigoISBN, autor, fechaPublicacion, genero, estadoMaterial, codigoUnidad);
        this.descripcion = descripcion;
    }

    public Periodico(String descripcion, String titulo, String editorial, String codigoISBN, String autor, String fechaPublicacion, String genero, String estadoMaterial, String codigoUnidad) {
        super(titulo, editorial, codigoISBN, autor, fechaPublicacion, genero, estadoMaterial, codigoUnidad);
        this.descripcion = descripcion;
    }

    

 
    

    @Override
    public String toString() {
        return "Periodico{"+super.toString() + '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void agregar() {
        try{
        Periodico periodicoNuevo = new Periodico(jfmPeriodico.txtDescripcion.getText(), null, null, null, true,jfmPeriodico.txtTitulo.getText(), jfmPeriodico.txtEditorial.getText(), null, null, jfmPeriodico.txtFecha.getText(), jfmPeriodico.cbxGenro.getSelectedItem().toString(), jfmPeriodico.txtEditorial.getText(),jfmPeriodico. txtCodigoUnidad.getText());
        if (!jfmPeriodico.codigo_unidad_existente(periodicoNuevo.getCodigoUnidad())) {

            if (jfmPeriodico.txtDescripcion.getText().equals("") || jfmPeriodico.txtTitulo.getText().equals("") || jfmPeriodico.txtEditorial.getText().equals("") || jfmPeriodico.txtFecha.getText().equals("") || jfmPeriodico.cbxGenro.getSelectedItem().toString().equals("")|| jfmPeriodico.txtEditorial.getText().equals("") || jfmPeriodico.txtCodigoUnidad.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Se debe completar todos los espacios");

            } else {

                periodico.add(periodicoNuevo);

                No_estructuras.escribirPeriodicoMemoria();
                jfmPeriodico.vaciar();

                jfmPeriodico.mostrarJTable();
                jfmPeriodico.mostrarJTableModficar();
                periodico.get(jfmPeriodico.p).setDisponibilidad(true);
                JOptionPane.showMessageDialog(null, "periodico guardado exitosamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ese codigo de unidad ya existe porfavor cambielo");
        }
    }
    catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Se debe completar todos los espacios");
    }
    }

    @Override
    public void modificar() {
        jfmPeriodico.txtModTitulo.setText(jfmPeriodico.titulo);
        jfmPeriodico.txtModCodigoUni.setText(jfmPeriodico.codigoUnidad);
        jfmPeriodico.txtModEditorial.setText(jfmPeriodico.editorial);
        jfmPeriodico.txtModFecha.setText(jfmPeriodico.fecha);
        jfmPeriodico.txtModDescripcion.setText(jfmPeriodico.descripcion);
        jfmPeriodico.txtModEstado.setText(jfmPeriodico.estado);
    }

    @Override
    public void guardar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    

   
    
}
