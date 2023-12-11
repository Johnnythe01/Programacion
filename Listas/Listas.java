package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> semana = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miercoles"));
        System.out.println("Lista original: " + semana);
        semana.remove(0);
        if (!semana.isEmpty()) {
            System.out.println("Dia: " + semana.get(0));
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    public static void ejercicioSemana() {
        List<String> semana = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miercoles"));

        System.out.println("Recorriendo con for-each:");
        for (String dia : semana) {
            System.out.println(dia);
        }

        System.out.println("Recorriendo con forEach:");
        semana.forEach(dia -> System.out.println(dia));
    }
}