package Tercera_Evaluacion.Vehiculo;

public class VehiculosApp {
    public static void main(String[] args) {
        Coche Audi = new Coche(4, "457589H", 2);
        Moto Yamaha = new Moto(2, "165589H");

        System.out.println("El Audi TTS tiene " + Audi + " ruedas");
        System.out.println("La Yamaha R6 tiene " + Yamaha + " ruedas");
    }
}
