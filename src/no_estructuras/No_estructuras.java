package no_estructuras;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import static no_estructuras.jfmRevista.revistaLista;

public class No_estructuras {

//Interfaz tamaño 840x630
    public static void main(String[] args) {
        jfmIniciarSesion is = new jfmIniciarSesion();
        is.setVisible(true);
        cargar_libros();
        cargar_clientes();
        cargar_salas();
        cargar_materiales();
        cargar_actividades();

        Thread verificar_morosos_libros = new Thread() {
            //<editor-fold defaultstate="collapsed" desc="moreadores y desmoreadores">

            @Override
            public void run() {

                while (true) {
                    try {
                        //cada minuto revisa si hay morosos
                        Thread.sleep(20000);
                        revisar();
                        el_desmoreador();
                        el_des_reservador();
                        acabar_actividad();
                    } catch (InterruptedException e) {
                    }
                }

            }

            public void acabar_actividad() {
                Date fecha_actual = new Date();
                for (int i = 0; i < jfmActividades.actividades.size(); i++) {
                    //si la fecha actual esta despues de la fecha de sancion
                    if (fecha_actual.after(jfmActividades.actividades.get(i).getFecha())) {

                        cliente_libera_asistencia(jfmActividades.actividades.get(i).getId());
                       jfmActividades.actividades.remove(i);
                       escribir_actividades();
                    }
                }

            }

            public void cliente_libera_asistencia(String i) {

                for (int j = 0; j < jfmClientes.clientes.size(); j++) {

                    if (jfmClientes.clientes.get(j).isAsisten_a_algo()) {

                       jfmClientes.clientes.get(j).setAsisten_a_algo(false);
                       jfmClientes.clientes.get(j).setId_actividad(null);
                         
                    }
                }
                escribir_clientes();
            }

            ///va a ver si ya un usuario ya cumplio su tiempo de multa
            public void el_desmoreador() {

                for (int i = 0; i < jfmClientes.clientes.size(); i++) {
                    //si hay un cliente moroso *Y* no debe ningun material *Y* tiene una fecha de sancion siga
                    if (jfmClientes.clientes.get(i).isMoroso() == true && (jfmClientes.clientes.get(i).getLibroPrestado() == null)
                            && (jfmClientes.clientes.get(i).getMaterial_prestar()
                            == null) && (jfmClientes.clientes.get(i).getFecha_sancion() != null)) {

                        //  System.out.println("entro a ver un moroso");
                        Date fecha_actual = new Date();
                        //si la fecha actual esta despues de la fecha de sancion
                        if (fecha_actual.after(jfmClientes.clientes.get(i).getFecha_sancion())) {
                            jfmClientes.clientes.get(i).setFecha_sancion(null);
                            jfmClientes.clientes.get(i).setMoroso(false);

                            escribir_clientes();

                            //  System.out.println("se desmorizo " + jfmClientes.clientes.get(i).getNombre());
                        }

                    } else {
                        //System.out.println("este no se puede desmorizar");
                    }
                }
            }

            ////castear
            public void revisar() {

                //System.out.println("entra al casteo");
                for (int i = 0; i < jfmClientes.clientes.size(); i++) {

                    //si el cliente tiene un libro prestado AND(Y) tiene ninguna fecha de sancion siga
                    if (jfmClientes.clientes.get(i).getLibroPrestado() != null && (jfmClientes.clientes.get(i).getFecha_sancion() == null)) {
                        //si el cliente no es moroso siga
                        if ((jfmClientes.clientes.get(i).isMoroso() == false)) {

                            //<editor-fold defaultstate="collapsed" desc="casteo">
                            if (jfmClientes.clientes.get(i).getLibroPrestado() instanceof Libro) {
                                moreador_libros_tarde(i);

                            } else if (jfmClientes.clientes.get(i).getLibroPrestado() instanceof Revista) {

                            }
                            //</editor-fold>

                        }
                    } else if (jfmClientes.clientes.get(i).getMaterial_prestar() != null && (jfmClientes.clientes.get(i).getFecha_sancion() == null)) {

                        if ((jfmClientes.clientes.get(i).isMoroso() == false)) {

                            revisar_material_moreador(i);

                        }

                    } else {
                        //       System.out.println("ya es moroso o no tiene nada prestado");
                    }

                }

            }

            //este metodo revisa quien no devuelve un material y lo vuelve moroso
            public void moreador_libros_tarde(int i) {

                Date end = jfmClientes.clientes.get(i).getLibroPrestado().getFechaDevolucion();
                Date now = new Date();
                //si la fecha actual
                if (now.after(end)) {

                    jfmClientes.clientes.get(i).setMoroso(true);
                    Calendar calendario = Calendar.getInstance();
                    calendario.setTime(now);
                    calendario.add(Calendar.MINUTE, 2);
                    Date multa = calendario.getTime();
                    jfmClientes.clientes.get(i).setFecha_sancion(multa);

                    escribir_clientes();
                }

            }

            public void revisar_Revista() {
            }

            public void revisar_material_moreador(int i) {

                try {
                    // System.out.println("llega a revisar");
                    Date end = jfmClientes.clientes.get(i).getMaterial_prestar().getFechaDevolucion();
                    Date now = new Date();
                    //si la fecha actual
                    if (now.after(end)) {

                        jfmClientes.clientes.get(i).setMoroso(true);
                        Calendar calendario = Calendar.getInstance();
                        calendario.setTime(now);
                        calendario.add(Calendar.MINUTE, 2);
                        Date multa = calendario.getTime();
                        jfmClientes.clientes.get(i).setFecha_sancion(multa);

                        //<editor-fold defaultstate="collapsed" desc="save">
                        escribir_clientes();

                        //</editor-fold>
                    }

                } catch (Exception e) {
                }
            }

//</editor-fold>
            public void el_des_reservador() {
                for (int i = 0; i < jfmSalas.salas.size(); i++) {

                    for (int j = 0; j < jfmSalas.salas.get(i).getHorarios().length; j++) {

                        //si no esta disponible y hay un cliente usando una sala
                        if (jfmSalas.salas.get(i).getHorarios()[j].isDisponible() == false) {

                            Date begin = new Date();
                            Date end = jfmSalas.salas.get(i).getHorarios()[j].getHora_devuelta();
                            if (begin.after(end)) {
                                jfmSalas.salas.get(i).getHorarios()[j].setHora_devuelta(null);
                                jfmSalas.salas.get(i).getHorarios()[j].setHora_Reserva(null);
                                jfmSalas.salas.get(i).getHorarios()[j].setDisponible(true);
                                jfmSalas.salas.get(i).getHorarios()[j].setCliente(null);

                                escribir_salas();
                            }

                        }

                    }

                }

            }

        };

        verificar_morosos_libros.start();
        HiloSocket enviar = new HiloSocket();
        enviar.start();
    }

    public static void cargar_clientes() {
        try {
            FileInputStream archivo = new FileInputStream("clientes.stm");
            try (ObjectInputStream leedor = new ObjectInputStream(archivo)) {
                jfmClientes.clientes = (ArrayList<Cliente>) leedor.readObject();

                leedor.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    public static void escribir_clientes() {

        try {
            FileOutputStream archivo = new FileOutputStream("clientes.stm");
            try (ObjectOutputStream escritor = new ObjectOutputStream(archivo)) {
                escritor.writeObject(jfmClientes.clientes);
                escritor.close();
            }

        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
        }

    }

    public static void escribir_Libros() {

        try {
            FileOutputStream archivo = new FileOutputStream("libros.stm");
            try (ObjectOutputStream escritor = new ObjectOutputStream(archivo)) {
                escritor.writeObject(jfmLibros.libros);
                escritor.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("escribir libros " + e);
        } catch (IOException ex) {
            System.out.println("escribir libros " + ex);
        }

    }

    public static void cargar_libros() {
        try {
            FileInputStream archivo = new FileInputStream("libros.stm");
            try (ObjectInputStream leedor = new ObjectInputStream(archivo)) {
                jfmLibros.libros = (ArrayList<Libro>) leedor.readObject();
                leedor.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("cargarlibros " + e);
        }

    }

    public static void cargar_salas() {
        try {
            FileInputStream archivo = new FileInputStream("salas.stm");
            try (ObjectInputStream leedor = new ObjectInputStream(archivo)) {
                jfmSalas.salas = (ArrayList<SalaDeEstudio>) leedor.readObject();

                leedor.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    static void escribir_salas() {

        try {
            FileOutputStream archivo = new FileOutputStream("salas.stm");
            try (ObjectOutputStream escritor = new ObjectOutputStream(archivo)) {
                escritor.writeObject(jfmSalas.salas);
                escritor.close();
            }

        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
        }

    }

    public static void cargar_materiales() {
        try {
            FileInputStream archivo = new FileInputStream("material.stm");
            try (ObjectInputStream leedor = new ObjectInputStream(archivo)) {
                jfmMaterialApoyo.materiales = (ArrayList<MaterialApoyo>) leedor.readObject();

                leedor.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    static void escribir_material() {

        try {
            FileOutputStream archivo = new FileOutputStream("material.stm");
            try (ObjectOutputStream escritor = new ObjectOutputStream(archivo)) {
                escritor.writeObject(jfmMaterialApoyo.materiales);
                escritor.close();
            }

        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
        }

    }

    public static void escribirRevistaMemoria() {

        try {
            FileOutputStream archivo = new FileOutputStream("revista.stm");
            try (ObjectOutputStream escritor = new ObjectOutputStream(archivo)) {
                escritor.writeObject(revistaLista);
                escritor.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("escribir revista" + e);
        } catch (IOException ex) {
            System.out.println("escribir revista" + ex);
        }

    }

    public static void cargarColaRevistaMemoria() {
        try {
            FileInputStream archivo = new FileInputStream("revista.stm");
            try (ObjectInputStream leedor = new ObjectInputStream(archivo)) {
                revistaLista = (ArrayList<Revista>) leedor.readObject();
                leedor.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("cargar cola revistas" + e);
        }

    }

    public static void escribirPeriodicoMemoria() {

        try {
            FileOutputStream archivo = new FileOutputStream("periodico.stm");
            try (ObjectOutputStream escritor = new ObjectOutputStream(archivo)) {
                escritor.writeObject(jfmPeriodico.periodico);
                escritor.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("escribir periodico" + e);
        } catch (IOException ex) {
            System.out.println("escribir periodico" + ex);
        }

    }

    public static void cargarPeriodicoMemoria() {
        try {
            FileInputStream archivo = new FileInputStream("periodico.stm");
            try (ObjectInputStream leedor = new ObjectInputStream(archivo)) {
                jfmPeriodico.periodico = (ArrayList<Periodico>) leedor.readObject();
                leedor.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("cargar cola periodico" + e);
        }

    }

    public static void escribir_actividades() {

        try {
            FileOutputStream archivo = new FileOutputStream("activid.stm");
            try (ObjectOutputStream escritor = new ObjectOutputStream(archivo)) {
                escritor.writeObject(jfmActividades.actividades);
                escritor.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("escribir  actividades" + e);
        } catch (IOException ex) {
            System.out.println("escribir  actividades" + ex);
        }

    }

    public static void cargar_actividades() {
        try {
            FileInputStream archivo = new FileInputStream("activid.stm");
            try (ObjectInputStream leedor = new ObjectInputStream(archivo)) {
                jfmActividades.actividades = (ArrayList<Actividad>) leedor.readObject();
                leedor.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" actividades  **" + e);
        }

    }

}
