package com.example.Ejer2;

/**
 * Representa los posibles estados en los que puede encontrarse un pedido.
 * 
 * Los estados son los siguientes:
 * <ul>
 *     <li>{@code PENDIENTE}: El pedido ha sido realizado, pero aún no se ha comenzado a preparar.</li>
 *     <li>{@code EN_PREPARACION}: El pedido está en proceso de preparación.</li>
 *     <li>{@code SERVIDO}: El pedido ha sido preparado y entregado al cliente.</li>
 * </ul>
 */
public enum EstadoPedido {
    /** El pedido ha sido realizado, pero aún no se ha comenzado a preparar. */
    PENDIENTE,

    /** El pedido está en proceso de preparación. */
    EN_PREPARACION,

    /** El pedido ha sido preparado y entregado al cliente. */
    SERVIDO
}
