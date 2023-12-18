package EjercicioPapel;

public class papel {
    private String tipo;
    private int altura;
    private int ancho;

    private String color;
    private boolean reciclado;

    public papel(String tipo, String color, boolean reciclado) {
        this.tipo = tipo;
        this.color = color;
        this.reciclado = reciclado;
    }
}