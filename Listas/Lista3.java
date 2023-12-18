package Listas;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Lista3 {
    public static void main(String[] args) {
        List<String> dias = new ArrayList<>();
        {
            dias.add("Lunes");
            dias.add("Martes");
            dias.add("Miercoles");
            dias.add("Jueves");
            dias.add("Viernes");

            dias.add(4, "Juernes");

            List<String> listaDos = new ArrayList<>(dias);
            System.out.println(dias);

            for (String dia : dias)
                ;
            encontrado = dia.toUpperCase().equals("lunes".toUpperCase());
        }
    }
}