// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario los casos favorables
        System.out.print("Ingresa el número de casos favorables: ");
        int casosFavorables = scanner.nextInt();

        // Solicitamos al usuario los casos posibles
        System.out.print("Ingresa el número de casos posibles: ");
        int casosPosibles = scanner.nextInt();

        // Calculamos la probabilidad
        double probabilidad = (double) casosFavorables / casosPosibles;
        // Mostramos el resultado
        System.out.println("La probabilidad es: " + probabilidad);
*/
                // Definimos los  números a comparar
                int num1 = 20;
                int num2 = 30;
                int num3 = 141;
                int num4 = 23;

                // Variable para almacenar el mayor valor
                int mayor = num1;

        // Usamos if anidado para encontrar el mayor valor
        if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
            mayor = num2;
        } else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
            mayor = num3;
        } else {
            mayor = num4;
        }

                // Imprimimos el mayor valor en la consola
                System.out.println("El mayor valor es: " + mayor);
    }
}



