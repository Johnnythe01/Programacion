package HeroSlay;

public class Carta {
    private String nombre;
    private CartaTipo tipo;
    private int ataque;


public Carta(String nombre, CartaTipo tipo, int ataque) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.ataque = ataque;
    }
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ataque: " + ataque);
    }
}
    /* 1) La clase Carta, poseerá los atributos necesarios para jugar una
partida. Para simplificar el ejercicio, crearemos esta entidad con
solo 3 atributos: Nombre de la carta, Tipo de la carta*, Ataque de
la carta. Además de un método para pintar la información de la
carta.*/