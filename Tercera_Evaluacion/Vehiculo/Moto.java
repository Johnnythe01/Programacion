package Tercera_Evaluacion.Vehiculo;

public class Moto extends Vehiculo{

    public Moto(int ruedas, String matricula) {
        super(ruedas, matricula);    
    }

    @Override
    public String toString() {
        return getRuedas() + " ruedas, " + "y matricula " + getMatricula();
    }

}