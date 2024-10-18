package com.example.Ejer1;

import java.util.HashSet;

/**
 * Clase que representa un autor de libros.
 */
public class Autor {
    private int id;
    private String nombre;
    private HashSet<Libro> libros;

    /**
     * Constructor de la clase Autor.
     * 
     * @param id     el identificador del autor
     * @param nombre el nombre del autor
     * @param libros la lista de libros escritos por el autor
     */
    public Autor(int id, String nombre, HashSet<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.libros = libros;
    }

    /**
     * Obtiene la lista de libros escritos por el autor.
     * 
     * @return la lista de libros
     */
    public HashSet<Libro> getLibros() {
        return libros;
    }

    /**
     * Agrega un nuevo libro a la lista de libros del autor.
     * 
     * @param libro el libro a agregar
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Muestra la información del autor.
     */
    public void mostrarInformacion() {
        System.out.println("Autor: " + nombre + ", Libros: " + libros.size());
    }
}
