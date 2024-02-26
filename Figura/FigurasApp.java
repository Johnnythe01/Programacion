package Figura;

public class FigurasApp {
    public static void main(String[] args) {
        //Cuadrado cuadrado = new Cuadrado(0);
        Circulo c1 = new Circulo(5);
        Circulo c2 = new Circulo(6);
        Cuadrado q1 = new Cuadrado(2);
        Rectangulo r1 = new Rectangulo(4, 2);

        System.out.println("el área del circulo 1 es:" + c1.calcularArea());
        System.out.println("el área del circulo 2 es:" + c2.calcularArea());
        System.out.println("el perímetro del circulo 1 es:" + c1.calcularPerimetro());
        System.out.println("el perímetro del circulo 2 es:" + c2.calcularPerimetro());
        System.out.println("el área del cuadrado 1 es:" + q1.calcularArea());
        System.out.println("el perímetro del cuadrado 1 es:" + q1.calcularPerimetro());
        System.out.println("el área del rectángulo 1 es:" + r1.calcularArea());
        System.out.println("el perímetro del rectángulo 1 es:" + r1.calcularPerimetro());
        
    }
}