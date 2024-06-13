import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Vendedor {
    private String nombre;
    private float promedioVentas;
    private float montoTotalVentas;

    public Vendedor(String nombre, float promedioVentas, float montoTotalVentas) {
        this.nombre = nombre;
        this.promedioVentas = promedioVentas;
        this.montoTotalVentas = montoTotalVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPromedioVentas() {
        return promedioVentas;
    }

    public float getMontoTotalVentas() {
        return montoTotalVentas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Promedio de Ventas: " + promedioVentas + ", Monto Total de Ventas: " + montoTotalVentas;
    }
}

public class Ventas {
    public static void main(String[] args) {
        Map<String, Vendedor> vendedores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar vendedor");
            System.out.println("2. Mostrar vendedor con mayor y menor promedio de ventas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del vendedor: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el promedio de ventas del vendedor: ");
                    float promedioVentas = scanner.nextFloat();
                    System.out.print("Ingresa el monto total de ventas del vendedor: ");
                    float montoTotalVentas = scanner.nextFloat();
                    scanner.nextLine(); // Consumir la nueva línea
                    vendedores.put(nombre, new Vendedor(nombre, promedioVentas, montoTotalVentas));
                    System.out.println(nombre + " ha sido agregado a la lista de vendedores.");
                    break;
                case 2:
                    if (vendedores.isEmpty()) {
                        System.out.println("No hay vendedores en la lista.");
                    } else {
                        Vendedor maxVendedor = null;
                        Vendedor minVendedor = null;
                        for (Vendedor vendedor : vendedores.values()) {
                            if (maxVendedor == null || vendedor.getPromedioVentas() > maxVendedor.getPromedioVentas()) {
                                maxVendedor = vendedor;
                            }
                            if (minVendedor == null || vendedor.getPromedioVentas() < minVendedor.getPromedioVentas()) {
                                minVendedor = vendedor;
                            }
                        }
                        System.out.println("Vendedor con mayor promedio de ventas: " + maxVendedor);
                        System.out.println("Vendedor con menor promedio de ventas: " + minVendedor);
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }
}
