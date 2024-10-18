package com.example.Ejer3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Representa un vuelo con un identificador, fecha y hora de salida, y fecha y hora de llegada.
 */
public class Vuelo {
    
    private int id;
    private String fechaHoraSalida;
    private String fechaHoraLlegada;

    /**
     * Constructor que inicializa una nueva instancia de la clase Vuelo.
     * 
     * @param id               El identificador del vuelo.
     * @param fechaHoraSalida  La fecha y hora de salida del vuelo.
     * @param fechaHoraLlegada La fecha y hora de llegada del vuelo.
     */
    public Vuelo(int id, String fechaHoraSalida, String fechaHoraLlegada) {
        this.id = id;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    /**
     * Obtiene el identificador del vuelo.
     * 
     * @return El identificador del vuelo.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del vuelo.
     * 
     * @param id El nuevo identificador del vuelo.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha y hora de salida del vuelo.
     * 
     * @return La fecha y hora de salida.
     */
    public String getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    /**
     * Establece la fecha y hora de salida del vuelo.
     * 
     * @param fechaHoraSalida La nueva fecha y hora de salida.
     */
    public void setFechaHoraSalida(String fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    /**
     * Obtiene la fecha y hora de llegada del vuelo.
     * 
     * @return La fecha y hora de llegada.
     */
    public String getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    /**
     * Establece la fecha y hora de llegada del vuelo.
     * 
     * @param fechaHoraLlegada La nueva fecha y hora de llegada.
     */
    public void setFechaHoraLlegada(String fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    /**
     * Devuelve una representación en forma de cadena del vuelo.
     * 
     * @return Una cadena que representa el vuelo.
     */
    @Override
    public String toString() {
        return "Vuelo{" +
               "id=" + id +
               ", fechaHoraSalida='" + fechaHoraSalida + '\'' +
               ", fechaHoraLlegada='" + fechaHoraLlegada + '\'' +
               '}';
    }

    /**
     * Calcula y devuelve la duración del vuelo en horas.
     * 
     * @return La duración del vuelo en horas.
     */
    public long duracionVuelo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime salida = LocalDateTime.parse(fechaHoraSalida, formatter);
        LocalDateTime llegada = LocalDateTime.parse(fechaHoraLlegada, formatter);
        Duration duracion = Duration.between(salida, llegada);
        return duracion.toHours();
    }

    /**
     * Verifica si la fecha y hora de salida son válidas.
     * 
     * @return true si la fecha y hora de salida no son nulas ni vacías; false en caso contrario.
     */
    public boolean esFechaSalidaValida() {
        return fechaHoraSalida != null && !fechaHoraSalida.trim().isEmpty();
    }
}
