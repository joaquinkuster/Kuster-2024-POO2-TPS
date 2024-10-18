package com.example.Ejer2;

/**
 * Representa un plato que se ofrece en un menú de restaurante.
 * Cada plato tiene un identificador único, un nombre, un precio y una categoría.
 */
public class Plato {
    
    /** Identificador único del plato. */
    private int id;

    /** Nombre del plato. */
    private String nombre;

    /** Precio del plato. */
    private float precio;

    /** Categoría del plato, que puede ser ENTRADA, PLATO_PRINCIPAL o POSTRE. */
    private CategoriaPlato categoria;

    /**
     * Constructor por defecto que crea una nueva instancia de Plato sin inicializar sus campos.
     */
    public Plato() {
    }

    /**
     * Constructor que inicializa una nueva instancia de Plato con sus atributos.
     * 
     * @param id        El identificador único del plato.
     * @param nombre    El nombre del plato.
     * @param precio    El precio del plato.
     * @param categoria La categoría del plato.
     */
    public Plato(int id, String nombre, float precio, CategoriaPlato categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Obtiene el identificador único del plato.
     * 
     * @return El identificador del plato.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del plato.
     * 
     * @return El nombre del plato.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el plato.
     * 
     * @param nombre El nuevo nombre del plato.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del plato.
     * 
     * @return El precio del plato.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece un nuevo precio para el plato.
     * 
     * @param precio El nuevo precio del plato.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la categoría del plato.
     * 
     * @return La categoría del plato.
     */
    public CategoriaPlato getCategoria() {
        return categoria;
    }

    /**
     * Establece una nueva categoría para el plato.
     * 
     * @param categoria La nueva categoría del plato.
     */
    public void setCategoria(CategoriaPlato categoria) {
        this.categoria = categoria;
    }

    /**
     * Devuelve una representación en cadena del plato, que incluye su nombre, precio y categoría.
     * 
     * @return Una cadena que representa el plato.
     */
    @Override
    public String toString() {
        return "Plato: " + nombre + ", precio: " + precio + ", categoria: " + categoria;
    }
}
