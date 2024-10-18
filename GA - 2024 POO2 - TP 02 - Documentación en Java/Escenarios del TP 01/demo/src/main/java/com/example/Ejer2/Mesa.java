package com.example.Ejer2;

/**
 * Representa una mesa en un restaurante u otro tipo de establecimiento.
 * Cada mesa tiene un identificador único y una descripción.
 */
public class Mesa {

    /** Identificador único de la mesa. */
    private int id;

    /** Descripción de la mesa, por ejemplo, ubicación o características. */
    private String descripcion;

    /**
     * Constructor por defecto de la clase Mesa.
     * Crea una nueva instancia de Mesa sin inicializar sus campos.
     */
    public Mesa() {
    }

    /**
     * Constructor que inicializa una nueva instancia de Mesa con una descripción.
     * 
     * @param descripcion La descripción de la mesa.
     */
    public Mesa(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el identificador único de la mesa.
     * 
     * @return El identificador de la mesa.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene la descripción de la mesa.
     * 
     * @return La descripción de la mesa.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece una nueva descripción para la mesa.
     * 
     * @param descripcion La nueva descripción de la mesa.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve una representación en cadena de la mesa, que incluye su identificador y descripción.
     * 
     * @return Una cadena que representa la mesa.
     */
    @Override
    public String toString() {
        return "Mesa: " + id + ", descripcion: " + descripcion;
    }
}
