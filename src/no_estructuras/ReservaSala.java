package no_estructuras;

import java.io.Serializable;
import java.util.Date;

public class ReservaSala implements Serializable {

    private Date hora_Reserva;
    private Date hora_devuelta;
    private Cliente cliente;
    boolean disponible;

    public ReservaSala(Date hora_Reserva, Date hora_devuelta,boolean disponible) {
        this.hora_Reserva = hora_Reserva;
        this.hora_devuelta = hora_devuelta;
        this.disponible=disponible;
    }

    public ReservaSala(Date hora_Reserva, Date hora_devuelta, Cliente cliente, boolean disponible) {
        this.hora_Reserva = hora_Reserva;
        this.hora_devuelta = hora_devuelta;
        this.cliente = cliente;
        this.disponible = disponible;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    public ReservaSala() {
    }

    
    
    public Date getHora_Reserva() {
        return hora_Reserva;
    }

    public void setHora_Reserva(Date hora_Reserva) {
        this.hora_Reserva = hora_Reserva;
    }

    public Date getHora_devuelta() {
        return hora_devuelta;
    }

    public void setHora_devuelta(Date hora_devuelta) {
        this.hora_devuelta = hora_devuelta;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "ReservaSala{" + "hora_Reserva=" + hora_Reserva + ", hora_devuelta=" + hora_devuelta + ", cliente=" + cliente + ", disponible=" + disponible + '}';
    }

     

}
