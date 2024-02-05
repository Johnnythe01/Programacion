package HeroSlay;

import java.util.List;
import java.util.ArrayList;

public class Main {
public static void main (String[] args) {
    Personaje Heroe = new Personaje ("Heroe", 10);
    Personaje Villano = new Personaje ("Villano", 10);

    List<Carta> mazo = new ArrayList<>();
    Carta carta1 = new Carta ("Puño", CartaTipo.ATAQUE, 7);
    Carta carta2 = new Carta ("Shock", CartaTipo.STUN, 5);
    Carta carta3 = new Carta ("Luz", CartaTipo.CURA, 6);

    ArrayList<Carta> mazoPersonaje = new ArrayList<>();
    mazoPersonaje.add(carta1);
    mazoPersonaje.add(carta2);
    mazoPersonaje.add(carta3);
    Heroe.imprimirInformacion();
    Villano.imprimirInformacion();

    while (Heroe.getVida() > 0) {
        System.out.println("Héroe! prepara tus cartas, ha aparecido un peligroso villano frente a ti!");

    }

    }   
}

/*1) Mostraremos la información de ambos jugadores.
2) Elegiremos aleatoriamente que jugador jugará primero la ronda.
3) Mostraremos del Mazo del jugador 2 cartas aleatorias.
4) El jugador en cuestión utilizará una de estas dos cartas.
5) Se aplicará el efecto de la carta. Ya sea sobre el mismo jugador (si
es de curación) o sobre el jugador enemigo (si es de ataque).
6) Si la carta no ha sido un ATURDIR, el siguiente jugador realizará
los puntos 3, 4 y 5. */