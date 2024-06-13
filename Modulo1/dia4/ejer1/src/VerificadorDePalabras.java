import java.util.Scanner;

public class VerificadorDePalabras{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        try {
            verificarPalabra(palabra);
            System.out.println("La palabra ingresada es válida: " + palabra);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Fin Ejecucion");
            scanner.close();
        }
    }

    public static void verificarPalabra(String palabra) throws Exception {
        if (palabra.contains("#")) {
            throw new Exception("La palabra contiene el carácter '#'.");
        }
    }
}
