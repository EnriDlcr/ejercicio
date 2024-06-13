import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class ejer2Hash {
    public static void main(String[] args) {
        String nombre;
        String sexo;
        String correo;

        Scanner scanner = new Scanner(System.in);
        int numeroDatos=0;
        System.out.println("Ingrese cuantos usuarios");
        numeroDatos= scanner.nextInt();
        scanner.nextLine();
        //scanner.close();
        //scanner = new Scanner(System.in);
        String Reg="";

        TreeSet<String> myDataSet = new TreeSet<String>();
        for(int i=0; i<numeroDatos; i++)
        {
            System.out.println("Ingrese Nombre");
            nombre= scanner.nextLine();
            System.out.println("Ingrese sexo");
            sexo = scanner.nextLine();
            System.out.println("Ingrese Correo");
            correo = scanner.nextLine();
            Reg="Nombre: " + nombre + ", Sexo: " + sexo + ", Correo: " + correo +"@gmail.com";
            myDataSet.add(Reg);
        }
        for (String myDato : myDataSet){
            System.out.print(myDato+"\n");
        }

        System.out.println();

    }

}


