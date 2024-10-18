//Escenario 1: Método que lanza una excepción
//Descripción: Tienes un método que divide dos números, pero puede lanzar una excepción si el divisor es cero.

import java.util.Scanner;

public class Escenario1 {

    /**
     * Divide dos números enteros.
     *
     * @param dividendo El número que se va a dividir.
     * @param divisor   El número por el cual se va a dividir.
     * @return El resultado de la división.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero. Intente con otro dividiendo");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escenario1 calculadora = new Escenario1();

        try {
            System.out.print("Introduce el dividendo: ");
            double dividendo = scanner.nextInt();

            System.out.print("Introduce el divisor: ");
            double divisor = scanner.nextInt();

            System.out.println("Resultado: " + calculadora.dividir(dividendo, divisor));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}