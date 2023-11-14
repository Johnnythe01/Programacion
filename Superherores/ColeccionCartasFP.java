import java.util.Scanner;

public class ColeccionCartasFP {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        //Creamos toda nuestra coleccion de Superheroes
        Superheroe spiderman = new Superheroe();
        spiderman.nombre = "Spiderman";
        spiderman.descripcion = "El humilde Peter Parker.";
        spiderman.rareza = "comun";
        spiderman.vida = 7;
        spiderman.fuerza = 6;
        String[] habilidadesSpiderman = {"Sentido aracnido", "Telaraña"};
        spiderman.habilidades = habilidadesSpiderman;

        Superheroe thor = new Superheroe();
        thor.nombre = "Thor";
        thor.descripcion = "Hijo de Odin, Dios del trueno";
        thor.rareza = "epico";
        thor.vida = 10;
        thor.fuerza = 9;
        String[] habilidadesThor = {"Volar", "Rayos"};
        thor.habilidades = habilidadesThor;

        spiderman.pintarInformacion();
        thor.pintarInformacion();

        ColeccionSuperheroe marvel = new ColeccionSuperheroe();
        marvel.superheroes = new Superheroe[] {spiderman, thor};

        marvel.pintarInfColeccion();
    }
}