package com.example.Ejer3;

/**
 * Representa una ciudad con un nombre y un identificador único.
 */
public class Ciudad {
    
    private int id;
    private String nombre;

    /**
     * Constructor que inicializa una nueva instancia de la clase Ciudad.
     * 
     * @param id     El ID único de la ciudad.
     * @param nombre El nombre de la ciudad.
     */
    public Ciudad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID de la ciudad.
     * 
     * @return El ID de la ciudad.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la ciudad.
     * 
     * @param id El nuevo ID de la ciudad.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la ciudad.
     * 
     * @return El nombre de la ciudad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la ciudad.
     * 
     * @param nombre El nuevo nombre de la ciudad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en forma de cadena de la ciudad.
     * 
     * @return Una cadena que representa la ciudad.
     */
    @Override
    public String toString() {
        return "Ciudad{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               '}';
    }

    /**
     * Compara esta ciudad con otra para verificar si son iguales.
     * 
     * @param otra La otra ciudad a comparar.
     * @return true si ambas ciudades tienen el mismo id; false en caso contrario.
     */
    @Override
    public boolean equals(Object otra) {
        if (this == otra) return true;
        if (!(otra instanceof Ciudad)) return false;
        Ciudad ciudad = (Ciudad) otra;
        return id == ciudad.id;
    }

    /**
     * Devuelve un código hash basado en el identificador de la ciudad.
     * 
     * @return Un código hash para esta ciudad.
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
