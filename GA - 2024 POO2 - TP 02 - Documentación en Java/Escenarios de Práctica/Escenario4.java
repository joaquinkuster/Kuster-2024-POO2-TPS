/* Escenario 4: Método que lanza múltiples excepciones
Descripción: Tienes un método que abre un archivo y lo lee, pero puede lanzar excepciones si el archivo no existe o si hay un error de entrada/salida.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Clase Escenario4 que contiene un método para leer archivos de texto.
 */
public class Escenario4 {

    /**
     * Lee un archivo línea por línea y muestra su contenido en la consola.
     *
     * @param nombreArchivo el nombre del archivo que se va a leer
     * @throws FileNotFoundException si el archivo no existe
     * @throws IOException si ocurre un error de entrada/salida durante la lectura
     */
    public void leerArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
        File archivo = new File(nombreArchivo);
        
        // Bloque try-with-resources para cerrar automáticamente el BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea); // Imprime cada línea del archivo
            }
        }
    }

    /**
     * Método principal que intenta leer un archivo y captura las excepciones.
     *
     * @param args los argumentos de línea de comando
     */
    public static void main(String[] args) {
        Escenario4 lector = new Escenario4();
        
        try {
            lector.leerArchivo("archivo.txt");
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no fue encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}