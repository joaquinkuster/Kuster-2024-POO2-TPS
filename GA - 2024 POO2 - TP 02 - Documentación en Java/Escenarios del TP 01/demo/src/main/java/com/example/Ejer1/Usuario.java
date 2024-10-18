package com.example.Ejer1;

/**
 * Clase que representa un usuario.
 */
public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String clave;
    private Biblioteca biblioteca;

    /**
     * Constructor de la clase Usuario.
     * 
     * @param id         el identificador del usuario
     * @param nombre     el nombre del usuario
     * @param apellido   el apellido del usuario
     * @param email      el correo electrónico del usuario
     * @param clave      la clave del usuario
     * @param biblioteca la biblioteca asociada al usuario
     */
    public Usuario(int id, String nombre, String apellido, String email, String clave, Biblioteca biblioteca) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.clave = clave;
        this.biblioteca = biblioteca;
    }

    /**
     * Obtiene el nombre completo del usuario.
     * 
     * @return el nombre completo
     */
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    /**
     * Cambia la clave del usuario.
     * 
     * @param nuevaClave la nueva clave
     */
    public void cambiarClave(String nuevaClave) {
        this.clave = nuevaClave;
    }

    /**
     * Muestra la información del usuario.
     */
    public void mostrarInformacion() {
        System.out.println("Usuario: " + getNombreCompleto() + ", Email: " + email);
    }
}