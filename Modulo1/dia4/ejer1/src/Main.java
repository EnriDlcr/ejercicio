import java.util.ArrayList;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //declaramos el arraylist myNumeros
        ArrayList<Integer> myNumeros = new ArrayList<>();
        //llenamos la lista con numeros del 1 al 100
        for (int i = 1; i <= 100; i++) {
            myNumeros.add(i);
        }

        // Solicitamos al usuario que ingrese un número entre 2 y 7
        Scanner scanner = new Scanner(System.in);
        int divisor = 0;
        while (true) {
            System.out.print("Ingrese un número entre 2 y 7: ");
            divisor = scanner.nextInt();
            if (divisor >= 2 && divisor <= 7) {
                break;
            } else {
                System.out.println("El número debe estar entre 2 y 7. Por favor, intente nuevamente.");
            }
        }
        scanner.close();

        // Mostrar los números que son divisibles por el número ingresado por el usuario
        System.out.println("Números divisibles por " + divisor + ":");
        for (int num : myNumeros) {
            if (num % divisor == 0) {
                System.out.println(num);
            }

        }
    }
}
