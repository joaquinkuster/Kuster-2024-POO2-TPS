package com.example.Ejer1;

import java.util.HashSet;

/**
 * Clase que representa un libro.
 */
public class Libro {
    private int id;
    private String titulo;
    private int numeroPaginas;
    private EstadoLibro estado;
    private HashSet<Autor> autores;
    private Biblioteca biblioteca;

    /**
     * Constructor de la clase Libro.
     * 
     * @param id          el identificador del libro
     * @param titulo      el título del libro
     * @param numeroPaginas el número de páginas del libro
     * @param estado      el estado del libro (Prestado o Disponible)
     * @param autores     la lista de autores del libro
     * @param biblioteca  la biblioteca donde se encuentra el libro
     */
    public Libro(int id, String titulo, int numeroPaginas, EstadoLibro estado, HashSet<Autor> autores, Biblioteca biblioteca) {
        this.id = id;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.estado = estado;
        this.autores = autores;
        this.biblioteca = biblioteca;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return el título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Cambia el estado del libro (Prestado o Disponible).
     * 
     * @param nuevoEstado el nuevo estado del libro
     */
    public void cambiarEstado(EstadoLibro nuevoEstado) {
        this.estado = nuevoEstado;
    }

    /**
     * Muestra la información del libro.
     */
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + ", Estado: " + estado + ", Número de páginas: " + numeroPaginas);
    }
}

/**
 * Enumeración que representa el estado de un libro.
 */
enum EstadoLibro {
    PRESTADO,
    DISPONIBLE
}
