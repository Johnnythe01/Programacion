package Figura;

public class Rectangulo extends Figura {

    private double base;
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(double b, double a) {
        base = b;
        altura = a;
    }

    @Override
    public double calcularArea() {
        
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}