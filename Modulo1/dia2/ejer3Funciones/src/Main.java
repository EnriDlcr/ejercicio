// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc= 0;

        System.out.println("Elija una opcion");
        System.out.println("1) Hacer una suma");
        System.out.println("2) Hacer una resta");
        System.out.println("3) Hacer una  multiplicacion");
        System.out.println("4) Hacer una division");
        System.out.println("Elija su opcion:");
        Scanner scanner = new Scanner(System.in);
        opc = scanner.nextInt();
        switch (opc){
            case  1:
                System.out.println("la suma de 18.2 + 12.3 ="+ suma(18.2,12.3));
                break;
            case  2:
                System.out.println("la suma de 18.2 - 12.3 ="+ resta(18.2,12.3));
                break;
            case  3:
                System.out.println("la suma de 18.2 * 12.3 ="+ producto(18.2,12.3));
                break;
            case  4:
                System.out.println("la suma de 18.2 / 12.3 ="+ cociente(18.2,12.3));
                break;
            default:
                System.out.println("Opc no valida");
                break;


        }


    }

   public static double suma(double a, double b){
     return a+b;
    }
    public static  double resta(double a, double b){
        return a-b;
    }
    public static double producto(double a, double b){
        return a*b;
    }

    public static double cociente(double a, double b){
        return a/b;
    }



}



