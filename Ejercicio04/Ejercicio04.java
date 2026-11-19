import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = {14, 7, 25, 3, 18, 7, 30};
        int numBuscar;
        int contador = 0;
        int posicion = -1;

        System.out.println("Arreglo: 14, 7, 25, 3, 18, 7, 30");
        System.out.print("Ingrese un numero: ");
        numBuscar = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numBuscar) {
                contador++;

                if (posicion == -1) {
                    posicion = i;
                }
            }
        }

        if (posicion != -1) {
            System.out.println("El numero aparece " + contador + " veces.");
            System.out.println("Su primera posicion es: " + posicion);
        } else {
            System.out.println("No existe");
            System.out.println("Posicion = " + posicion);
        }

        sc.close();
    }
}
