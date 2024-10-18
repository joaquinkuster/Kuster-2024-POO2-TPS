package com.example.Ejer1;

import java.util.Date;

/**
 * Clase que representa un préstamo de un libro.
 */
public class Prestamo {
    private int id;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Usuario usuario;
    private Libro libro;

    /**
     * Constructor de la clase Prestamo.
     * 
     * @param id             el identificador del préstamo
     * @param fechaPrestamo  la fecha del préstamo
     * @param fechaDevolucion la fecha de devolución
     * @param usuario        el usuario que realizó el préstamo
     * @param libro          el libro prestado
     */
    public Prestamo(int id, Date fechaPrestamo, Date fechaDevolucion, Usuario usuario, Libro libro) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.usuario = usuario;
        this.libro = libro;
    }

    /**
     * Extiende la fecha de devolución del préstamo.
     * 
     * @param nuevaFecha la nueva fecha de devolución
     */
    public void extenderDevolucion(Date nuevaFecha) {
        this.fechaDevolucion = nuevaFecha;
    }

    /**
     * Muestra la información del préstamo.
     */
    public void mostrarInformacion() {
        System.out.println("Préstamo ID: " + id + ", Usuario: " + usuario.getNombreCompleto() + ", Libro: " + libro.getTitulo());
    }

    /**
     * Verifica si el préstamo está vencido.
     * 
     * @return true si el préstamo está vencido, false en caso contrario
     */
    public boolean estaVencido() {
        Date hoy = new Date();
        return fechaDevolucion.before(hoy);
    }
}

