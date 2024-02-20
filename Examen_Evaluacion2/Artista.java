package Examen_Evaluacion2;

public class Artista {
    private String nombre;
    private void Enum estilo;
    public Artista(String nombre, EstiloMusical pop, String oyentes, String pais) {
        this.nombre = nombre;
        this.cancion = pop;
        this.oyentes = oyentes;
        this.pais = pais;
    }

    private String cancion;
    private String oyentes;
    private String pais;

    public Artista (String nombre, EstiloMusical rock, String cancion, int i, String pais) {
        System.out.println(nombre + rock + cancion + i + pais);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getEnum() {
        return Enum;
    }

    public void setEnum(void enum1) {
        Enum = enum1;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getOyentes() {
        return oyentes;
    }

    public void setOyentes(String oyentes) {
        this.oyentes = oyentes;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static void pintarInformacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pintarInformacion'");
    }

}