package Figura;

public class FigurasApp {
    public static void main(String[] args) {
        //Cuadrado cuadrado = new Cuadrado(0);
        Circulo  c1 = new Circulo(5);
        Circulo  c2 = new Circulo(6);

        System.out.println(c1.calcularArea());
        System.out.println(c2.calcularArea());
    }
    
}