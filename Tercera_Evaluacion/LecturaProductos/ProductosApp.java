package Tercera_Evaluacion.LecturaProductos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ProductosApp {
    public static void main (String[] args) throws FileNotFoundException, IOException{
        HashMap<Integer, Producto> inventario = new HashMap<>();

        String pathAbsoluto = "C:\\Users\\alumne-DAM\\productos.txt";
        BufferedReader br = new BufferedReader(new FileReader(pathAbsoluto));

        String text = br.readLine();
        while (text != null){
            String[] linia = text.split(",");

            System.out.println(linia[0]);
            System.out.println(linia[1]);
            System.out.println(linia[2]);
            text = br.readLine();
        }
        System.out.println("por favor, introduce un código de producto: ");
        Scanner scanner = new Scanner (System.in);
        
    }
}