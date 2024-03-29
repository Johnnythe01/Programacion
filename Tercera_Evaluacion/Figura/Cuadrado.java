package Tercera_Evaluacion.Figura;

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
        return this.lado*this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}