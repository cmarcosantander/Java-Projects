//Importaciones de clases
import java.util.Scanner;
import java.util.Arrays;

public class BusquedaBinariaMS {
    public static void main(String[] args) throws Exception {
        
        //Inicializamos la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitamos que el usuario ingrese el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Ingreso de cada elemento de acuerdo al tamaño por parte del usuario
        for (int i = 0; i < size; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Elementos ingresados: " + Arrays.toString(array));

        System.out.print("Ingrese el elemento a buscar: ");
        int number_search = scanner.nextInt();

        int result = busquedaBinaria(array, number_search);

        if (result != -1)
            System.out.println("El elemento " + number_search + " está en el índice " + result);
        else
            System.out.println("El elemento " + number_search + " no está presente en el arreglo.");

        // Cerrar el scanner
        scanner.close();
    }

    public static int busquedaBinaria(int [] arr, int number_search){
        int left = 0;
        int right = arr.length - 1;
        
        // Bucle de búsqueda binaria
        while(left <= right){
            int result = left + (right - left)/2; // Índice medio del rango de búsqueda

            if (arr[result] == number_search)
            return result;

            // Si el objetivo es mayor, ignoramos la mitad izquierda
            if (arr[result] < number_search)
                left = result + 1;
            // Si el objetivo es menor, ignoramos la mitad derecha
            else
                right = result - 1;
        }
        // Si el objetivo no está presente en el arreglo
        return -1;
    }
}
