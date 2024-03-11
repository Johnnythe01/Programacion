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

        String pathAbsoluto = "C:\\Users\\alumne-DAM\\Desktop\\productos.txt";
        BufferedReader br = new BufferedReader(new FileReader(pathAbsoluto));

        String linea = br.readLine();
        while (linea != null){
            String[] partesLinea = linea.split(",");

            
            Producto producto = new Producto ();
            producto.setCodigo(Integer.valueOf(partesLinea[0]));
            producto.setNombre(partesLinea[1]);
            producto.setPrecio(Double.valueOf(partesLinea[2]));

            inventario.put(producto.getCodigo(), producto);

            linea = br.readLine();
        
        }
        
        System.out.println("por favor, introduce un código de producto: ");
        Scanner scanner = new Scanner (System.in);
        
    }
}