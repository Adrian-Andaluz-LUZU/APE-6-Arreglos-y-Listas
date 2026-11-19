import java.util.Scanner;

public class ControlGastosSemanales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] gastos = new double[7];
        double sumaTotal = 0;

        // 1. Registrar los gastos diarios de una semana (7 días)
        System.out.println("Registro de gastos diarios de la semana:");
        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Ingrese el gasto del día " + (i + 1) + ": ");
            gastos[i] = sc.nextDouble();
            sumaTotal += gastos[i];
        }

        // 2. Calcular el promedio diario
        double promedioDiario = sumaTotal / gastos.length;
        System.out.println("\nGasto total: " + sumaTotal);
        System.out.println("Promedio diario: " + promedioDiario);

        // 3. Aplicar aumento del 10% a los días que superen el promedio y contar cuántos fueron
        int diasConIncremento = 0;
        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedioDiario) {
                gastos[i] = gastos[i] * 1.10; // Aumento del 10%
                diasConIncremento++;
            }
        }

        // 4. Mostrar el arreglo actualizado en orden inverso
        System.out.println("\n--- Arreglo actualizado en orden inverso ---");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.println("Día " + (i + 1) + ": " + gastos[i]);
        }

        // 5. Indicar cuántos días sufrieron dicho incremento
        System.out.println("\nCantidad de días que sufrieron el incremento: " + diasConIncremento);

        sc.close();
    }
}
