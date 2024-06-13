import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String palabra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        palabra = scanner.nextLine();
        char []arreglo = new char [palabra.length()];
        for(int i=(palabra.length()-1); i>=0; i--  )
        {
           arreglo[i]=palabra.charAt(i);
            System.out.print(arreglo[i]);
        }
        System.out.println();

 //      Nombres[0]="Rosita";
   //    Nombres[1]="Hugo";

    }
}