package com.example.Ejer2;

/**
 * Representa a un cliente en el sistema.
 * Un cliente tiene un identificador único, nombre, apellido, correo electrónico y una clave.
 * Esta clase permite manejar la información de los clientes.
 */
public class Cliente {
    /** El identificador único del cliente. */
    private int id;

    /** El nombre del cliente. */
    private String nombre;

    /** El apellido del cliente. */
    private String apellido;

    /** El correo electrónico del cliente. */
    private String email;

    /** La clave o contraseña del cliente para acceder al sistema. */
    private String clave;

    /**
     * Constructor por defecto que inicializa una nueva instancia de Cliente sin parámetros.
     */
    public Cliente() {
    }

    /**
     * Constructor que inicializa una nueva instancia de Cliente con nombre, apellido, email y clave.
     * 
     * @param nombre   El nombre del cliente.
     * @param apellido El apellido del cliente.
     * @param email    El correo electrónico del cliente.
     * @param clave    La clave o contraseña del cliente.
     */
    public Cliente(String nombre, String apellido, String email, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.clave = clave;
    }

    /**
     * Obtiene el identificador único del cliente.
     * 
     * @return El ID del cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre El nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del cliente.
     * 
     * @return El apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del cliente.
     * 
     * @param apellido El nuevo apellido del cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     * 
     * @return El correo electrónico del cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del cliente.
     * 
     * @param email El nuevo correo electrónico del cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la clave o contraseña del cliente.
     * 
     * @return La clave del cliente.
     */
    public String getClave() {
        return clave;
    }

    /**
     * Establece la clave o contraseña del cliente.
     * 
     * @param clave La nueva clave del cliente.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Devuelve una representación en forma de cadena del cliente, mostrando su ID, nombre, apellido y correo electrónico.
     * 
     * @return Una cadena que representa la información básica del cliente.
     */
    @Override
    public String toString() {
        return "id de cliente: " + id + ", nombre: " + nombre + ", apellido: " + apellido + ", email: " + email;
    }
}
