public class Prueba2 {
    private int parcial;
    private String aprobado;

    public Prueba2 (int parcial, String aprobado){
        this.parcial = parcial;
        this.aprobado = aprobado;
    }
    
    public void setParcial(int parcial){
        this.parcial = parcial;
    }
    public int getParcial(){
        return parcial;
    }
    public void setAprobado(String aprobado){
        this.aprobado = aprobado;
    }
    public String getAprobado(){
        return aprobado;
    }
}