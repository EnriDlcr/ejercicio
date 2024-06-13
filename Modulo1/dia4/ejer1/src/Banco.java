import java.util.ArrayList;
import java.util.Scanner;

class Cliente {
    private String nombre;
    private String numeroCuenta;

    public Cliente(String nombre, String numeroCuenta) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Número de Cuenta: " + numeroCuenta;
    }
}

public class Banco {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar clientes");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el número de cuenta del cliente: ");
                    String numeroCuenta = scanner.nextLine();
                    clientes.add(new Cliente(nombre, numeroCuenta));
                    System.out.println(nombre + " ha sido agregado a la lista de clientes.");
                    break;
                case 2:
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes para atender.");
                    } else {
                        System.out.print("Ingresa el número de cuenta del cliente a atender: ");
                        String cuentaAAtender = scanner.nextLine();
                        boolean encontrado = false;
                        for (int i = 0; i < clientes.size(); i++) {
                            if (clientes.get(i).getNumeroCuenta().equals(cuentaAAtender)) {
                                Cliente atendido = clientes.remove(i);
                                System.out.println(atendido.getNombre() + " ha sido atendido.");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Cliente con número de cuenta " + cuentaAAtender + " no encontrado.");
                        }
                    }
                    break;
                case 3:
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes en la lista.");
                    } else {
                        System.out.println("Clientes en la lista:");
                        for (Cliente cliente : clientes) {
                            System.out.println(cliente);
                        }
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
