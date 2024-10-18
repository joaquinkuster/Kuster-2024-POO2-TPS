package com.example.Ejer2;

/**
 * Representa las diferentes categorías de un plato dentro de un menú.
 * Estas categorías pueden ser usadas para clasificar los platos en un menú de restaurante.
 * 
 * <ul>
 *   <li>{@link #ENTRADA} - Un plato ligero que se sirve al comienzo de una comida.</li>
 *   <li>{@link #PLATO_PRINCIPAL} - El plato principal, que constituye la parte más sustancial de la comida.</li>
 *   <li>{@link #POSTRE} - El plato dulce que se sirve al final de la comida.</li>
 * </ul>
 * 
 * Esta enumeración ayuda a organizar el menú y los tipos de platos que se pueden ofrecer.
 */
public enum CategoriaPlato {
    /**
     * Representa la categoría de entrada. Es un plato que se sirve al inicio de una comida.
     */
    ENTRADA,

    /**
     * Representa la categoría de plato principal. Es el plato principal de una comida.
     */
    PLATO_PRINCIPAL,

    /**
     * Representa la categoría de postre. Es un plato dulce que se sirve al final de una comida.
     */
    POSTRE
}
