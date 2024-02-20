package Examen_Evaluacion2;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa la lista de Artistas.
 * Debereis programar cada uno de los métodos con su funcionalidad.
 * Debereis crear el enum EstiloMusical y la classe Artista según el enuncuado.
 * Autor: 
 */
public class ColeccionArtistas {
    
    List<Artista> artistas = new ArrayList<>();
    
    /* No modificar */
    public ColeccionArtistas(List<Artista> artistas){
        this.artistas = artistas;
    }
    
    /* No modificar */
    public ColeccionArtistas(){
        this.artistas = new ArrayList<>();
    }
    
    //Debeis implementar los siguientes métodos:
    
    /**
     * Añade un nuevo artista a la colección.
     * El nuevo artista vendrá dado por parámetros.
     */
    public void añadirArtista(Artista artista){
        Artista artista2 = artista;
    }
    
    /**
     * Pinta la información de todos los artistas de tu colección.
     * Pista: Utilizar artisa.pintarInformacion()
     */
    public void pintarColeccion(){
        Artista.pintarInformacion();
    }
    
    /**
     * Pinta por consola la información de un artista a partir de su nombre.
     * Se supone que no habrá varios artistas con el mismo nombre.
     */
    public void pintarArtistaPorNombre(String nilMoliner){
        Artista.getNombre artista1
        System.out.println(artista1);
    }
    
    /**
     * Encuentra y devuelve el Artista de tu colección,
     * a partir del nombre de su canción más destacada.
     * Si no encuentra la canción, debe devolver null.
     */
    public Artista artistaPorCancion(String RUMine){
        Artista.getCancion artista1
        System.out.println(artista1);
        return null;
    }
    
    /**
     * Devuelve todos los artistas de tu colección, 
     * que coincidan con el estilo musical pasado por parámetros.
     * Si no encuentra ningún artista, debe devolver una lista vacia.
     */
    public List<Artista> artistasPorEstilo(EstiloMusical ROCK){
        //...
        return new ArrayList<>();
    }
    
    /**
     * Devuelve el artista mas escuchado de tu colección.
     * Si no encuentra ningún artista, devolver null.
     */
    public Artista artistaMasEscuchado(String top1){
        //...
        return null;
    }
    
    /**
     * Imprime por pantalla todos los tipos de estilos musicales de la colección.
     * Importante: No deben aparecer repetidos.
     */
    public void pintarEstilosMusicales(){
        //...
    }
    
}