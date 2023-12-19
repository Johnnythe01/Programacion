package CuentaBancaria;

public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double Saldo){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
        public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
        }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
        public double getTipoInteres() {
        return tipoInteres;
    }
    public double getSaldo() {
        return saldo;
    }

}



/*Constructor por defecto
Constructor con todos los parámetros
Constructor copia.
Métodos setters/getters para asignar y obtener los datos de la cuenta.
Métodos ingreso y reintegro. Un ingreso consiste en aumentar el saldo en la cantidad
que se indique. Esa cantidad no puede ser negativa. Un reintegro consiste en disminuir
el saldo en una cantidad pero antes se debe comprobar que hay saldo suficiente. La
cantidad no puede ser negativa. Los métodos ingreso y reintegro devuelven true si la
operación se ha podido realizar o false en caso contrario.
Método transferencia que permita pasar dinero de una cuenta a otra siempre que en la
cuenta de origen haya dinero suficiente para poder hacerla.*/