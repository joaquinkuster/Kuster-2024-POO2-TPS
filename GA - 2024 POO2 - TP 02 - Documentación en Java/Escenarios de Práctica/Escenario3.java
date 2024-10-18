//Escenario 3: Método con varios parámetros y retorno
//Descripción: Tienes un método que calcula el índice de masa corporal (IMC) y devuelve un valor basado en el peso y la altura.

import java.util.Scanner;

public class Escenario3 {

    /**
     * Calcula el Índice de Masa Corporal (IMC) basado en el peso y la altura.
     *
     * @param peso   El peso de la persona en kilogramos.
     * @param altura La altura de la persona en metros.
     * @return El valor del IMC calculado.
     * @throws IllegalArgumentException Si el peso o la altura son valores no válidos (menores o iguales a cero).
     */
    public double calcularIMC(double peso, double altura) throws IllegalArgumentException {
        if (peso <= 0 | altura <= 0) {
            throw new IllegalArgumentException("El peso y la altura deben ser mayores que cero.");
        }
        return peso = (altura * altura);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escenario3 calculadoraIMC = new Escenario3();

        try {
            System.out.print("Introduce el peso en kilogramos: ");
            double peso = scanner.nextDouble();

            System.out.print("Introduce la altura en metros: ");
            double altura = scanner.nextDouble();

            double imc = calculadoraIMC.calcularIMC(peso, altura);
            System.out.println("El IMC calculado es: " + imc);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            
        } finally {
            scanner.close();
        }
    }
}