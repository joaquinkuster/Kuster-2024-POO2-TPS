package com.example.Ejer2;

import java.util.Date;

/**
 * Representa un pedido realizado por un cliente en un restaurante.
 * Cada pedido tiene un identificador único, un estado y una hora de creación.
 */
public class Pedido {

    /** Identificador único del pedido. */
    private int id;

    /** Estado actual del pedido, que puede ser PENDIENTE, EN_PREPARACION o SERVIDO. */
    private EstadoPedido estado;

    /** Hora y fecha en que el pedido fue creado. */
    private Date horaCreacion;

    /**
     * Constructor por defecto que crea una nueva instancia de Pedido sin inicializar sus campos.
     */
    public Pedido() {
    }

    /**
     * Constructor que inicializa una nueva instancia de Pedido con un estado y una hora de creación.
     * 
     * @param estado       El estado actual del pedido.
     * @param horaCreacion La hora y fecha en que el pedido fue creado.
     */
    public Pedido(EstadoPedido estado, Date horaCreacion) {
        this.estado = estado;
        this.horaCreacion = horaCreacion;
    }

    /**
     * Obtiene el identificador único del pedido.
     * 
     * @return El identificador del pedido.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el estado actual del pedido.
     * 
     * @return El estado del pedido.
     */
    public EstadoPedido getEstado() {
        return estado;
    }

    /**
     * Establece un nuevo estado para el pedido.
     * 
     * @param estado El nuevo estado del pedido.
     */
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la hora y fecha en que el pedido fue creado.
     * 
     * @return La hora de creación del pedido.
     */
    public Date getHoraCreacion() {
        return horaCreacion;
    }

    /**
     * Establece una nueva hora de creación para el pedido.
     * 
     * @param horaCreacion La nueva hora de creación del pedido.
     */
    public void setHoraCreacion(Date horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    /**
     * Devuelve una representación en cadena del pedido, que incluye su estado y hora de creación.
     * 
     * @return Una cadena que representa el pedido.
     */
    @Override
    public String toString() {
        return "Pedido con estado: " + estado + ", hora de creacion: " + horaCreacion;
    }
}
