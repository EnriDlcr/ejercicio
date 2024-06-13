
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        // Lista de nombres
        List<String> names = Arrays.asList("Laura", "Betty", "Carlos","David", "Roque");

        // Letra por la cual queremos filtrar
        char filtroChar = 'O';

        // Usando Streams para transformar, filtrar y ordenar
        List<String> result = names.stream()
                .map(String::toUpperCase) // Transformar a mayúsculas
                .filter(name -> name.contains(String.valueOf(filtroChar))) // Filtrar por la letra específica
                .sorted() // Ordenar los nombres
                .collect(Collectors.toList()); // Recoger el resultado en una lista

        // Imprimir el resultado final
        //result.forEach(System.out::println);
        String output = result.stream()
                .collect(Collectors.joining("\n")); //concatenamos con el metodo joining
        System.out.println(output);


    }
}
