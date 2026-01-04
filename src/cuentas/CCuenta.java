package cuentas;

public class CCuenta {

    // Atributos encapsulados
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    // Constructor por defecto
    public CCuenta() { }

    // Constructor con parámetros
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCuenta() { return cuenta; }
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double getTipoInterés() { return tipoInterés; }
    public void setTipoInterés(double tipoInterés) { this.tipoInterés = tipoInterés; }

    // Devuelve el saldo actual
    public double estado() { return saldo; }

    // Ingresa dinero en la cuenta
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    // Retira dinero de la cuenta
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
