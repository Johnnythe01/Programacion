package EjerciciosSueltos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sueltos1 {
    public static void main(String[] args) {

        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Mar");
        listaNombres.add("Marta");
        listaNombres.add("Maria");
        listaNombres.add("Joan");
        //String nombres[] = { "Mar", "Maria", "Marta", "Pep" };
        final Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un nombre de esta lista: ");
        final String nombre = sc.nextLine();

        listaNombres.contains(nombre);

        boolean encontrado = listaNombres.contains(nombre);

        if (encontrado) {
            System.out.println("Se ha encontrado el nombre: " + nombre);
            System.out.println(":)");
        } else {
            System.out.println("No se ha encontrado el nombre");
            System.out.println(":(");
        }
    }
}