public class Prueba {
    private String prueba;
    private int nota;

    public Prueba(String prueba, int nota){
    this.prueba = prueba;
    this.nota = nota;
    }

    public void setPrueba(String prueba){
        this.prueba = prueba;
    }
    public String getPrueba(){
        return prueba;
    }
    public void nota(int nota){
        this.nota = nota;
    }
    public int getNota(){
        return nota;
    }
}