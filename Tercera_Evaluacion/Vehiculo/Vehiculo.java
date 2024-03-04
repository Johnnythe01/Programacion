package Tercera_Evaluacion.Vehiculo;

public abstract class Vehiculo {

    private int ruedas;
    private String matricula;


    public Vehiculo(int ruedas, String matricula) {
        this.ruedas = ruedas;
        this.matricula = matricula;
    }

    public int getRuedas(){
        return ruedas;
    }

    public String getMatricula (){
        return matricula;
    }

    }
    
    /*ruedas: el número de ruedas del vehículo.
    matricula: el número de la matrícula del vehículo.*/