package HeroSlay;

import java.util.List;
import java.util.ArrayList;

public class Main {
public static void main (String[] args) {
    List<Carta> mazo = new ArrayList<>();
    Carta carta1 = new Carta ("Puño", CartaTipo.ATAQUE, 7);
    Carta carta2 = new Carta ("Shock", CartaTipo.STUN, 5);
    Carta carta3 = new Carta ("Luz", CartaTipo.CURA, 6);

    ArrayList<Carta> mazoPersonaje = new ArrayList<>();
    mazoPersonaje.add(carta1);
    mazoPersonaje.add(carta2);
    }

    
}