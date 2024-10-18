package com.example.Ejer2;

/**
 * Representa un restaurante, que tiene un identificador único, un nombre y una dirección.
 */
public class Restaurante {
    
    /** Identificador único del restaurante. */
    private int id;

    /** Nombre del restaurante. */
    private String nombre;

    /** Dirección del restaurante. */
    private String direccion;

    /**
     * Constructor por defecto que crea una nueva instancia de Restaurante sin inicializar sus campos.
     */
    public Restaurante() {
    }

    /**
     * Constructor que inicializa una nueva instancia de Restaurante con su nombre y dirección.
     * 
     * @param nombre    El nombre del restaurante.
     * @param direccion La dirección del restaurante.
     */
    public Restaurante(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Obtiene el identificador único del restaurante.
     * 
     * @return El identificador del restaurante.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del restaurante.
     * 
     * @return El nombre del restaurante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el restaurante.
     * 
     * @param nombre El nuevo nombre del restaurante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del restaurante.
     * 
     * @return La dirección del restaurante.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece una nueva dirección para el restaurante.
     * 
     * @param direccion La nueva dirección del restaurante.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve una representación en cadena del restaurante, que incluye su nombre y dirección.
     * 
     * @return Una cadena que representa el restaurante.
     */
    @Override
    public String toString() {
        return "Nombre del restaurante: " + nombre + ", direccion: " + direccion;
    }
}
