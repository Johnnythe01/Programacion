package Figura;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double ar = this.lado*this.lado;
        return ar;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}