package Diagrama_Orientada_Objetos;

import java.sql.Date;
import java.util.List;

class Reserva {
    private String id;
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Automovil> coches;
    private double preciototal;
    private boolean entregado;

    public Reserva(String id, Cliente cliente, Date fechaInicio, Date fechaFin, List<Automovil> coches, double preciototal, boolean entregado) {
        this.id = id;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.coches = coches;
        this.preciototal = preciototal;
        this.entregado = entregado;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id='" + id + '\'' +
                ", cliente=" + cliente +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", coches=" + coches +
                ", preciototal=" + preciototal +
                ", entregado=" + entregado +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Automovil> getCoches() {
        return coches;
    }

    public void setCoches(List<Automovil> coches) {
        this.coches = coches;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPrecioTotal(double preciototal) {
        this.preciototal = preciototal;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
