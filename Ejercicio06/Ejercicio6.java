
import java.util.Arrays;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Declarar el arreglo original
        int[] datos = {14, 7, 25, 3, 18};

        // Crear una copia real del arreglo
        int[] copia = Arrays.copyOf(datos, datos.length);

        // Ordenar solamente la copia
        Arrays.sort(copia);

        // Mostrar ambos arreglos
        System.out.println("Arreglo original: " + Arrays.toString(datos));
        System.out.println("Arreglo ordenado: " + Arrays.toString(copia));

        // Obtener el segundo número mayor
        int segundoMayor = copia[copia.length - 2];

        System.out.println("Segundo número mayor: " + segundoMayor);

        // Buscar la posición del número 14
        int posicion = Arrays.binarySearch(copia, 14);

        System.out.println("Posición del número 14 en la copia: " + posicion);
    }
}
