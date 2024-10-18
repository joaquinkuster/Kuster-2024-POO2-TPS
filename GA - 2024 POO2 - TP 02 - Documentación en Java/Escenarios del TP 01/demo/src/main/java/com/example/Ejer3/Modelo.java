package com.example.Ejer3;

/**
 * Representa un modelo de avión con un ID único y un nombre.
 */
public class Modelo {

    private int id;
    private String nombre;

    /**
     * Constructor que inicializa una nueva instancia de la clase Modelo.
     * 
     * @param id     El ID único del modelo.
     * @param nombre El nombre del modelo.
     */
    public Modelo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del modelo.
     * 
     * @return El ID del modelo.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del modelo.
     * 
     * @param id El nuevo ID del modelo.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del modelo.
     * 
     * @return El nombre del modelo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del modelo.
     * 
     * @param nombre El nuevo nombre del modelo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en forma de cadena del modelo.
     * 
     * @return Una cadena que representa el modelo.
     */
    @Override
    public String toString() {
        return "Modelo{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               '}';
    }

    /**
     * Verifica si el nombre del modelo es válido.
     * 
     * @return true si el nombre no es nulo ni vacío; false en caso contrario.
     */
    public boolean esNombreValido() {
        return nombre != null && !nombre.trim().isEmpty();
    }

    /**
     * Cambia el nombre del modelo.
     * 
     * @param nuevoNombre El nuevo nombre del modelo.
     */
    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}
