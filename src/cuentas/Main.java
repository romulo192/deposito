package cuentas;

public class Main {

    public static void main(String[] args) {
        // Crear la cuenta
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Llamar al método que hace las operaciones
        operativa_cuenta(cuenta1, 695f);
    }

    // Método que realiza las operaciones con la cuenta
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        // Mostrar saldo actual
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Intentar retirar dinero
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }

        // Intentar ingresar dinero
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
