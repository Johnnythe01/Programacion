package EjerciciosSueltos;

public class sueltos2 {
    private String nombre;
    private String email;
    private String contraseña;
    private boolean esEncriptada;

    public sueltos2 (String nombreUsuario, String emailUsuario, String contraseñaUsuario) {
        nombre = nombreUsuario;
        email = emailUsuario;
        contraseña = contraseñaUsuario;
        esEncriptada = false;
    }
    public void imprimir (){
        System.out.println("el nombe de usuario es: " + nombre);
        System.out.println("el nombe de usuario es: " + email);
        System.out.println("el nombe de usuario es: " + contraseña);
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public String getContraseña() {
        return contraseña;
    }
    public boolean isEsEncriptada() {
        return esEncriptada;
    }

public void setEmail(String email) {
    this.email = email;
}
public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
}
public void desencriptarContraseña {

}
}