import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Solicitar el ID del usuario
        /*los Id son:
        director : id = 1 y accede a cualquier piso
        Cardiologo: id= 2 y accede a los pisos 2 y 3
        enfermera:  id= 3 y accede a los pisos 2,3,4
        medico general: id = 4 y accede a los pisos del 1 al 4
        * */
        System.out.print("Ingrese su ID: ");
        int id = scanner.nextInt();
        // Solicitar el piso al que quiere acceder
        System.out.print("Ingrese el piso al que desea acceder: ");
        int piso = scanner.nextInt();

        // Determinar el acceso basado en el ID del usuario y el piso solicitado
        boolean accesoPermitido = false;

        String roll="n/a";
        if (id == 1) {
            // El director puede acceder a cualquier piso
            roll="El Director";
            accesoPermitido = true;
        } else if (id == 2) {
            // El cardiólogo puede acceder solo a los pisos 2 y 3
            roll="El Caridologo";
            if (piso == 2 || piso == 3) {
                accesoPermitido = true;
            }
        } else if (id == 3) {
            // La enfermera puede acceder solo a los pisos 2,3,4
            roll="La Enfermera";
            if (piso == 2 || piso == 3 || piso == 4 ) {
                accesoPermitido = true;
            }
        } else if (id == 4) {
            // El medico general puede acceder a los pisos del 1 al 4
            roll="El Medico General";
            if (piso >= 1 && piso <= 4) {
                accesoPermitido = true;
            }
        }

        // Imprimir el resultado del acceso
        if (accesoPermitido) {

            System.out.println(roll +" tiene acceso permitido al piso " + piso);
        } else {
            System.out.println(roll +" tiene acceso denegado al piso " + piso);
        }

        scanner.close();
    }
}