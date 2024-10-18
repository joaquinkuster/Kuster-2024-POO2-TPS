package com.example.Ejer3;

/**
 * Representa un avión con una capacidad máxima de pasajeros.
 */
public class Avion {
    
    private int id;
    private int capacidadMaxima;

    /**
     * Constructor que inicializa una nueva instancia de la clase Avion.
     * 
     * @param id             El ID del avión.
     * @param capacidadMaxima La capacidad máxima de pasajeros del avión.
     */
    public Avion(int id, int capacidadMaxima) {
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Obtiene el ID del avión.
     * 
     * @return El ID del avión.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del avión.
     * 
     * @param id El nuevo ID del avión.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la capacidad máxima de pasajeros del avión.
     * 
     * @return La capacidad máxima de pasajeros del avión.
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Establece la capacidad máxima de pasajeros del avión.
     * 
     * @param capacidadMaxima La nueva capacidad máxima de pasajeros del avión.
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Devuelve una representación en forma de cadena del avión.
     * 
     * @return Una cadena que representa el avión.
     */
    @Override
    public String toString() {
        return "Avion{" +
               "id=" + id +
               ", capacidadMaxima=" + capacidadMaxima +
               '}';
    }

    /**
     * Compara este avión con otro para verificar si son iguales.
     * 
     * @param otro El otro avión a comparar.
     * @return true si ambos aviones tienen el mismo id; false en caso contrario.
     */
    @Override
    public boolean equals(Object otro) {
        if (this == otro) return true;
        if (!(otro instanceof Avion)) return false;
        Avion avion = (Avion) otro;
        return id == avion.id;
    }

    /**
     * Devuelve un código hash basado en el identificador del avión.
     * 
     * @return Un código hash para este avión.
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
