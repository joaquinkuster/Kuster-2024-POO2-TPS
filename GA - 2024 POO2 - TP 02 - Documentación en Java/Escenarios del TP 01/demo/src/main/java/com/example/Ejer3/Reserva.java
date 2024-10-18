package com.example.Ejer3;

/**
 * Representa una reserva de vuelo con un número de confirmación, fecha y número de asiento.
 */
public class Reserva {

    private int numeroConfirmacion;
    private String fecha;
    private int numeroAsiento;

    /**
     * Constructor que inicializa una nueva instancia de la clase Reserva.
     * 
     * @param numeroConfirmacion El número de confirmación de la reserva.
     * @param fecha              La fecha de la reserva.
     * @param numeroAsiento      El número de asiento asignado en la reserva.
     */
    public Reserva(int numeroConfirmacion, String fecha, int numeroAsiento) {
        this.numeroConfirmacion = numeroConfirmacion;
        this.fecha = fecha;
        this.numeroAsiento = numeroAsiento;
    }

    /**
     * Obtiene el número de confirmación de la reserva.
     * 
     * @return El número de confirmación.
     */
    public int getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    /**
     * Establece el número de confirmación de la reserva.
     * 
     * @param numeroConfirmacion El nuevo número de confirmación.
     */
    public void setNumeroConfirmacion(int numeroConfirmacion) {
        this.numeroConfirmacion = numeroConfirmacion;
    }

    /**
     * Obtiene la fecha de la reserva.
     * 
     * @return La fecha de la reserva.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la reserva.
     * 
     * @param fecha La nueva fecha de la reserva.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el número de asiento asignado en la reserva.
     * 
     * @return El número de asiento.
     */
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * Establece el número de asiento asignado en la reserva.
     * 
     * @param numeroAsiento El nuevo número de asiento.
     */
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    /**
     * Devuelve una representación en forma de cadena de la reserva.
     * 
     * @return Una cadena que representa la reserva.
     */
    @Override
    public String toString() {
        return "Reserva{" +
               "numeroConfirmacion=" + numeroConfirmacion +
               ", fecha='" + fecha + '\'' +
               ", numeroAsiento=" + numeroAsiento +
               '}';
    }

    /**
     * Verifica si la fecha de la reserva es válida.
     * 
     * @return true si la fecha no es nula ni vacía; false en caso contrario.
     */
    public boolean esFechaValida() {
        return fecha != null && !fecha.trim().isEmpty();
    }

    /**
     * Cambia el número de asiento asignado en la reserva.
     * 
     * @param nuevoNumeroAsiento El nuevo número de asiento.
     */
    public void cambiarAsiento(int nuevoNumeroAsiento) {
        this.numeroAsiento = nuevoNumeroAsiento;
    }
}
