import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaFifo {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar persona a la fila");
            System.out.println("2. Atender persona de la fila");
            System.out.println("3. Mostrar fila");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    cola.add(nombre);
                    System.out.println(nombre + " ha sido agregado a la fila.");
                    break;
                case 2:
                    if (cola.isEmpty()) {
                        System.out.println("La fila está vacía. No hay nadie para atender.");
                    } else {
                        String atendido = cola.poll();
                        System.out.println(atendido + " ha sido atendido.");
                    }
                    break;
                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("La fila está vacía.");
                    } else {
                        System.out.println("Personas en la fila: " + cola);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }
}

