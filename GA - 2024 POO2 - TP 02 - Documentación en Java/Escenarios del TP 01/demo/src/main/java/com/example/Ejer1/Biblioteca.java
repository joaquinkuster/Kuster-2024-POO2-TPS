package com.example.Ejer1;

/**
 * Clase que representa una biblioteca.
 */
public class Biblioteca {
    private int id;
    private String nombre;
    private String direccion;

    /**
     * Constructor de la clase Biblioteca.
     * 
     * @param id        el identificador de la biblioteca
     * @param nombre    el nombre de la biblioteca
     * @param direccion la dirección de la biblioteca
     */
    public Biblioteca(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Obtiene el nombre de la biblioteca.
     * 
     * @return el nombre de la biblioteca
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece la dirección de la biblioteca.
     * 
     * @param direccion la nueva dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Imprime la información de la biblioteca.
     */
    public void imprimirInfo() {
        System.out.println("Biblioteca: " + nombre + ", Dirección: " + direccion);
    }
}

