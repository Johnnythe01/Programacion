public class Superheroe {

    public String nombre;
    public String descripcion;
    public String[] habilidades;
    public String rareza; // Comun, Epico, Legendario
    public String tipo;
    public int fuerza; // De 0 a 10
    public int vida; // De 0 a 10

    public Superheroe(String nombre, int fuerza, int vida) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = vida;
        this.rareza = "comun";
    }

    public Superheroe() {
        this.rareza = "comun";
    }

    // Metodos utiles para los superheroes
    public void pintarInformacion() {
        System.out.println(nombre + " - " + descripcion);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Vida: " + vida);

    }
}
