package Tercera_Evaluacion.Figura;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

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
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return base * 2 + altura * 2;
    }
}