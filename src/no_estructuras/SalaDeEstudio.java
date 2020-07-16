package no_estructuras;

import java.io.Serializable;
import java.util.Arrays;

public class SalaDeEstudio implements Serializable {

    private String sala_ID;
    private int tamanoSala;//Cantidad de personas
    private String descripcion_de_sala;
    private ReservaSala horarios[];

    public SalaDeEstudio(String numSala, int tamañoSala, String descripcion) {
        this.sala_ID = numSala;
        this.tamanoSala = tamañoSala;
        this.descripcion_de_sala = descripcion;
    }

    public SalaDeEstudio(String sala_ID, int tamanoSala, String descripcion_de_sala, ReservaSala[] horarios) {
        this.sala_ID = sala_ID;
        this.tamanoSala = tamanoSala;
        this.descripcion_de_sala = descripcion_de_sala;
        this.horarios = horarios;
    }

    
    public SalaDeEstudio() {
    }

    public String getSala_ID() {
        return sala_ID;
    }

    public void setSala_ID(String sala_ID) {
        this.sala_ID = sala_ID;
    }

    public int getTamanoSala() {
        return tamanoSala;
    }

    public void setTamanoSala(int tamanoSala) {
        this.tamanoSala = tamanoSala;
    }

    public String getDescripcion_de_sala() {
        return descripcion_de_sala;
    }

    public void setDescripcion_de_sala(String descripcion_de_sala) {
        this.descripcion_de_sala = descripcion_de_sala;
    }

    public ReservaSala[] getHorarios() {
        return horarios;
    }

    public void setHorarios(ReservaSala[] horarios) {
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        return "SalaDeEstudio{" + "sala_ID=" + sala_ID + ", tamanoSala=" + tamanoSala + ", descripcion_de_sala=" + descripcion_de_sala + ", horarios=" + Arrays.toString(horarios) + '}';
    }

}
