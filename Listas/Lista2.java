package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista2 {
    private static void ejercicio2Arrays(){
        List<Integer> numeros = new ArrayList<>(
            Arrays.asList(1,2,3,4,5));
        
        int suma = 0;
        Integer n = 0;
        for(int i = 0; i<numeros.size(); i++){

            if(n%2 == 0){ //Si n es par:
                suma += n*2; //multiplica por dos y suma
            }else {
                suma = suma +n; //suma
            }
        }
        System.out.println("El resultado es " + suma);
    }
}
