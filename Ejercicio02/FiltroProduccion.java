import java.util.Scanner;

public class FiltroProduccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] piezas = new int[10];

        // Ingreso de datos
        for (int i = 0; i < piezas.length; i++) {
            System.out.print("Piezas fabricadas en el turno " + i + ": ");
            piezas[i] = sc.nextInt();
        }

        int sumaPares = 0;
        int contadorImparesMayores = 0;
        int sumaTotal = 0;

        // Recorrido único del arreglo
        for (int i = 0; i < piezas.length; i++) {
            sumaTotal += piezas[i];

            // 1) Suma de piezas en índices pares (0, 2, 4...)
            if (i % 2 == 0) {
                sumaPares += piezas[i];
            }

            // 2) Turnos con cantidad impar y mayor a 15
            if (piezas[i] % 2 != 0 && piezas[i] > 15) {
                contadorImparesMayores++;
            }
        }

        // 3) Promedio general
        double promedio = (double) sumaTotal / piezas.length;

        System.out.println("Suma de piezas en índices pares: " + sumaPares);
        System.out.println("Turnos con producción impar y mayor a 15: " + contadorImparesMayores);
        System.out.printf("Promedio general de producción: %.2f%n", promedio);

        sc.close();
    }
}