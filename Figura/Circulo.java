package Figura;

public class Circulo extends Figura{

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo (double r){
        radio = r;
    }

    @Override
    public double calcularArea() {
        return radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}