import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner (System.in);

        System.out.print("Introduzca la base del triangulo: ");
        double base = Scanner.nextDouble();

        System.out.print("Introduzca la altura del triangulo: ");
        double altura = Scanner.nextDouble();
        
        double area = base * altura / 2;
        
        System.out.println("el area del triangulo es: " + area );
        
    }
}
