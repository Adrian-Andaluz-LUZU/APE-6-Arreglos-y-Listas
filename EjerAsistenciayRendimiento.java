
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int suma = 0;
        int aprobados = 0;
        int reprobados = 0;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        n = entrada.nextInt();

        while (n <= 0) {
            System.out.print("Ingrese una cantidad valida: ");
            n = entrada.nextInt();
        }

        int[] notas = new int[n];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Ingrese la nota del estudiante "
                    + (i + 1) + " (0-20): ");

            notas[i] = entrada.nextInt();

            while (notas[i] < 0 || notas[i] > 20) {
                System.out.print("Nota invalida. Ingrese nuevamente: ");
                notas[i] = entrada.nextInt();
            }

            suma += notas[i];
        }

        double promedio = (double) suma / n;

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] >= 14) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("\n===== RESULTADOS DEL CURSO =====");

        System.out.printf("Promedio general: %.2f%n", promedio);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

        System.out.println("\nEstudiantes con notas debajo del promedio:");

        boolean encontrado = false;

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] < promedio) {
                System.out.println("Estudiante " + (i + 1)
                        + " - Nota: " + notas[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Ningun estudiante esta debajo del promedio.");
        }

        entrada.close();
    }
}

