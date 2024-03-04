package Tercera_Evaluacion.Vehiculo;

public class VehiculosApp {
    public static void main(String[] args) {
        Coche Audi = new Coche(4, "7839 LML.", 2);
        Moto Yamaha = new Moto(2, "7321 KCJ.");

        System.out.println("EL Audi tiene: " + Audi.toString());
        System.out.println("La Yamaha tiene: " + Yamaha.toString());
    }
}