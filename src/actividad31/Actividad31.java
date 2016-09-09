/* ENUNCIADO
 * Escriba un programa que lea un número entero de 0 a 999. Si el número
 * ingresado no está en ese rango debe informarlo al usuario y terminar el
 * programa. El programa debe calcular e indicar cuántas cifras tiene. Además,
 * debe calcular e indicar centenas, decenas y unidades del número. Resolver el
 * problema con operaciones matemáticas, no utilizar conversión a cadenas de
 * caracteres.
 */
package actividad31;
import java.util.Scanner;
/**
 *
 * @author Enrique A. Martínez Agudelo.
 */
public class Actividad31 {

    /**
     * @param val valor entero necesario para calcular el número de cifras,
     * además de mostrar el valor de la centena, la decena y unidad del mismo.
     */
    public static void dataNum(int val) {
        // Evalua si 'val' es menor al límite '0'.
        if (val < 0) {
            // Finaliza el programa informando que 'val' es menor al límite '0'.
            System.out.println("Error 1: Valor ingresado es menor a '0'.");
            
        // Evalua si 'val' es mayor al límite '999'.
        } else if (val > 999) {
            // Finaliza el programa informando que 'val' es mayor al límite
            // '999'.
            System.out.println("Error 2: Valor ingresado es mayor a '999'.");
            
        // Evalua si 'val' se encuentra dentro del rango [0, 999].
        } else if (val >= 0 && val <= 999) {
            // Declaración de variables unidad, decena, centena y cifras.
            int unidad = val % 10;
            int decena = 0;
            int centena = 0;
            int cifras = 1;
            
            // 'val' almacena el valor entero de la división de sí misma
            // entre 10.
            val /= 10;
            
            // Evalua si 'val' aún guarda un valor mayor a '0'.
            if (val > 0) {
                // 'decena' almacena el reciduo de 'val' entre 10.
                decena = val % 10;
                // 'cifras' incementa en una unidad.
                cifras++;
                
                // 'val' almacena el valor entero de la división de sí misma
                // entre 10.
                val /= 10;
                
                // Evalua si 'val' aún guarda un valor mayor a '0'.
                if (val > 0) {
                    // 'centena' almacena el reciduo de 'val' entre 10.
                    centena = val % 10;
                    // 'cifras' incementa en una unidad.
                    cifras++;
                }
            }
            // Finaliza el programa informando la cantidad de cifras, el valor
            // de la centena, la decena y la unidad de 'val'.
            System.out.println(
                    "El valor ingresado tiene "+cifras+" cifras.\n"
                    +"La centena del valor es: "+centena+".\n"
                    +"La decena del valor es: "+decena+".\n"
                    +"La unidad del valor es: "+unidad+"."
            );
            
        // Si 'val' no pasa ninguna evaluación previa.
        } else {
            // Finaliza el programa informando que 'val' tiene un valor
            // desconocido.
            System.out.println("Error 3: Valor desconosido.");
        }
    }
    
    
    public static void main(String[] args) {
        // Declaración de elemento Scanner.
        Scanner val = new Scanner(System.in);
        
        // Muestra mensaje pidiendo la carga del valor.
        System.out.println("Digite un valor entero entre 0 y 999, a calcular");
        
        // Llamada a la función 'dataNum()' entregando el valor ingresado por
        // teclado.
        dataNum(val.nextInt());
    }
    
}
