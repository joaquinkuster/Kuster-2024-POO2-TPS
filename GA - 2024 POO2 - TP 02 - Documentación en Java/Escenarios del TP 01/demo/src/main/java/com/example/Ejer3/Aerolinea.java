package com.example.Ejer3;

/**
 * Representa una aerolínea con un identificador y un nombre.
 */
public class Aerolinea {
    
    private int id;
    private String nombre;

    /**
     * Constructor que inicializa una nueva instancia de la clase Aerolinea.
     * 
     * @param id     El identificador de la aerolínea.
     * @param nombre El nombre de la aerolínea.
     */
    public Aerolinea(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador de la aerolínea.
     * 
     * @return El identificador de la aerolínea.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador de la aerolínea.
     * 
     * @param id El nuevo identificador de la aerolínea.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la aerolínea.
     * 
     * @return El nombre de la aerolínea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la aerolínea.
     * 
     * @param nombre El nuevo nombre de la aerolínea.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en forma de cadena de la aerolínea.
     * 
     * @return Una cadena que representa la aerolínea.
     */
    @Override
    public String toString() {
        return "Aerolínea{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               '}';
    }

    /**
     * Compara esta aerolínea con otra para verificar si son iguales.
     * 
     * @param otra La otra aerolínea a comparar.
     * @return true si ambas aerolíneas tienen el mismo id; false en caso contrario.
     */
    @Override
    public boolean equals(Object otra) {
        if (this == otra) return true;
        if (!(otra instanceof Aerolinea)) return false;
        Aerolinea aerolinea = (Aerolinea) otra;
        return id == aerolinea.id;
    }

    /**
     * Devuelve un código hash basado en el identificador de la aerolínea.
     * 
     * @return Un código hash para esta aerolínea.
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}