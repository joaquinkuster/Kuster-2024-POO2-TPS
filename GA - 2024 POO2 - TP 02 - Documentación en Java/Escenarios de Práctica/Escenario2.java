//Escenario 2: Método obsoleto con sugerencia de uso alternativo
//Descripción: Tienes un método que ha quedado obsoleto, y quieres documentarlo para que no sea utilizado, sugiriendo un nuevo método.

import java.util.Scanner;

public class Escenario2 {

    /**
     * Este método ha quedado obsoleto. 
     * 
     * @param a El primer número.
     * @param b El segundo número.
     * @return La suma de a y b.
     * @deprecated Este método está obsoleto porque no maneja correctamente ciertos casos. 
     *             Utiliza {@link #sumar(int, int, int)} en su lugar.
     */
    @Deprecated
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Este es el nuevo método recomendado para sumar números enteros.
     * 
     * @param a El primer número.
     * @param b El segundo número.
     * @param c El tercer número (puede ser 0 si no se usa).
     * @return La suma de a, b y c.
     */
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escenario2 calculadora = new Escenario2();

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Introduce el tercer número (puede ser 0 si no se usa): ");
        int c = scanner.nextInt();

        // Usando el método obsoleto (habrá un aviso de obsolescencia)
        System.out.println("Suma usando el método obsoleto: " + calculadora.sumar(a, b));

        // Usando el nuevo método recomendado
        System.out.println("Suma usando el nuevo método: " + calculadora.sumar(a, b, c));

        scanner.close();
    }
}