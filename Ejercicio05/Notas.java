public class Notas {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        int[] notas = {15, 8, 18, 11};

        int posMax = 0;
        int posMin = 0;
        int suma = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notas[posMax]) {
                posMax = i;
            }
            if (notas[i] < notas[posMin]) {
                posMin = i;
            }
            suma = suma + notas[i];
        }

        double promedio = (double) suma / notas.length;

        System.out.println("Mayor: " + nombres[posMax] + " - " + notas[posMax]);
        System.out.println("Menor: " + nombres[posMin] + " - " + notas[posMin]);
        System.out.printf("Promedio: %.2f", promedio);
    }
}