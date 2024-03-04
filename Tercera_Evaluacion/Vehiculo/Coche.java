package Tercera_Evaluacion.Vehiculo;

public class Coche extends Vehiculo {

    private int puertas;

    public Coche(int ruedas, String matricula, int puertas) {
        super(ruedas, matricula);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return puertas + " puertas, " + getRuedas() + " ruedas " + "y matricula " + getMatricula();
    }

}