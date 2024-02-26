public class Circulo {

    private double radio = 1.0;
    private String color = "rojo";

    public Circulo (double radio) {
        this.radio = radio;
        color = "rojo";

        //METODOS
        public void getRadio () {
            return radio;

          public double getArea () {
            return Math.PI * radio*radio;

          public double getColor () {
            return color;

          public void setColor (String nuevoColor) {
            color = nuevoColor;
        }
    }
}
        }
    }
}

public class CirculoApp {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(5.0);
        Circulo c2 = new Circulo(6.0);
        System.out.println("Radio: " + c2.getRadio());
    }
}