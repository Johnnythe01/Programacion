public class ColeccionSuperheroe {

    public Superheroe[] superheroes;
    public String propietario;
    public String fecha;

    /* Constructor vacio */
    public void coleccionSuperheroe() {

    }
    // Metodos de nuestra coleccion

    /**
    * Pinta la info de todos los heroes con mas fuerza que el valor de @fuerza
    * @param fuerza
    */
    public void pintarInfColeccion(){
        int i = 0;
        while (i < superheroes.length) {
            //if(superheroes[i].fuerza > fuerza)
            //(superheroes [i].pintarInfColeccion();
            i++;
        }
    }
}
