package HeroSlay;

import java.util.List;

public class Personaje {
    private String nombre;
    private int vida = 10;
    private List<Carta> mazo;
    private int ronda = 3;

    public Personaje(String nombre, int vida, List<Carta> mazo) {
        this.nombre = nombre;
        this.vida = vida;
        this.mazo = mazo;
    }
    public void imprimirInformacion() {
        System.out.println("Nombre del personaje: " + nombre);
        System.out.println("Vida del personaje: " + vida);
    }
    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }
    public int getRonda() {
        return ronda;
    }
    
}



/*La clase Personaje poseerá los siguientes atributos:
Nombre del personaje, Vida del personaje y Mazo del personaje**.
Los métodos recomendados para esta clase se describen más adelante.
** El mazo será representado por una lista de cartas. */