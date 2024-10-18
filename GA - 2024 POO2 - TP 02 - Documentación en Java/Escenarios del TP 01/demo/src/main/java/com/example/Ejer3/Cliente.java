package com.example.Ejer3;

/**
 * Representa un cliente con información personal como nombre, apellido, email y clave de acceso.
 */
public class Cliente {

    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String clave;

    /**
     * Constructor que inicializa una nueva instancia de la clase Cliente.
     * 
     * @param id       El ID único del cliente.
     * @param nombre   El nombre del cliente.
     * @param apellido El apellido del cliente.
     * @param email    El correo electrónico del cliente.
     * @param clave    La clave de acceso del cliente.
     */
    public Cliente(int id, String nombre, String apellido, String email, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.clave = clave;
    }

    /**
     * Obtiene el ID del cliente.
     * 
     * @return El ID del cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del cliente.
     * 
     * @param id El nuevo ID del cliente.
     */
    public void setId(int id) {
        this.id = id;
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
     * Obtiene la clave de acceso del cliente.
     * 
     * @return La clave de acceso del cliente.
     */
    public String getClave() {
        return clave;
    }

    /**
     * Establece la clave de acceso del cliente.
     * 
     * @param clave La nueva clave de acceso del cliente.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Devuelve una representación en forma de cadena de la información del cliente.
     * 
     * @return Una cadena que representa al cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", apellido='" + apellido + '\'' +
               ", email='" + email + '\'' +
               '}';
    }

    /**
     * Actualiza el nombre del cliente.
     * 
     * @param nuevoNombre El nuevo nombre del cliente.
     */
    public void actualizarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    /**
     * Actualiza el apellido del cliente.
     * 
     * @param nuevoApellido El nuevo apellido del cliente.
     */
    public void actualizarApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }

    /**
     * Verifica si el correo electrónico proporcionado es válido.
     * 
     * @param email El correo electrónico a validar.
     * @return true si el correo electrónico es válido; false en caso contrario.
     */
    public static boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
}
