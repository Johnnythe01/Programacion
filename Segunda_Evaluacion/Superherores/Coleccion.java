public class Coleccion {
    
    public Superheroe[] superheroes;
    public String propietario;
    public String fecha;
    
    /* Constructor vacio */
    public Coleccion(){
    }
    
    //Metodos de nuestra coleccion:
    
    /**
     * Pinta la info de todos los heroes.
     */
    public void pintarInfColeccion(){
        int i = 0;
        while(i < superheroes.length){
            superheroes[i].pintarInformacion();
            i++;
        }
    }
    
    public int pintarColeccion {
        int i = 0;
        System.out.println("La fuerza maxima es: " + fuerzaMaxima);
        return fuerzaMaxima;
    }

    
    public int obtenerVidaMaxima (){
        int vidaMaxima = 0;
        String nombre = "";
        int i = 0;
        while (i < superheroes.length) {
            if (superheroes [i].vida > vidaMaxima);
            vidaMaxima = superheroes [i]
        }
    }

    public int nLegen (){
        int = 0;
        while (i < superheroes );
    }

    /**
     * Pinta la info de todos los heroes con mas 
     * fuerza que el valor de @fuerza.
     * @param fuerza 
     */
    public void pintarInfColeccion(int fuerza){
        int i = 0;
        while(i < superheroes.length){
            if(superheroes[i].fuerza > fuerza){
                superheroes[i].pintarInformacion();
            }
            
            i++;
        }
    }
}