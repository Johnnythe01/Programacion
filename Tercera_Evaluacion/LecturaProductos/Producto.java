package Tercera_Evaluacion.LecturaProductos;

public class Producto {
    public int codigo;
    public String nombre;
    public double precio;

    public void producto (int codigo, String nombre, double precio){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}