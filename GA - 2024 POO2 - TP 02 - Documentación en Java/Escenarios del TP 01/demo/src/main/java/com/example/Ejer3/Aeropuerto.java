package com.example.Ejer3;

/**
 * Representa un aeropuerto que maneja vuelos.
 */
public class Aeropuerto {
    
    private int id;
    private String nombre;
    private String direccion;

    /**
     * Constructor que inicializa una nueva instancia de la clase Aeropuerto.
     * 
     * @param id        El ID del aeropuerto.
     * @param nombre    El nombre del aeropuerto.
     * @param direccion La dirección del aeropuerto.
     */
    public Aeropuerto(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Obtiene el ID del aeropuerto.
     * 
     * @return El ID del aeropuerto.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del aeropuerto.
     * 
     * @param id El nuevo ID del aeropuerto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del aeropuerto.
     * 
     * @return El nombre del aeropuerto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del aeropuerto.
     * 
     * @param nombre El nuevo nombre del aeropuerto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del aeropuerto.
     * 
     * @return La dirección del aeropuerto.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del aeropuerto.
     * 
     * @param direccion La nueva dirección del aeropuerto.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
