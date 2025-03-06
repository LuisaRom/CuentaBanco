package org.example;


public class CuentaBancaria {


    private String Titular;
    private double Saldo;
    private int NumCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo, int numCuenta) {
        Titular = titular;
        Saldo = saldo;
        NumCuenta = numCuenta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        NumCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "Titular='" + Titular + '\'' +
                ", Saldo=" + Saldo +
                ", NumCuenta=" + NumCuenta +
                '}';
    }


    public void depositar (double cantidad){
        if (cantidad > 1){
            Saldo += cantidad;
            System.out.println("Deposito exitoso");
        }else
            System.out.println("Deposito denegado");
    }

    public void retirar (double cantidad){
        if (cantidad > 1 && cantidad <= Saldo){
            Saldo -= cantidad;
                    System.out.println("Retiro exitoso");
        } else {
            System.out.println("Retiro denegado");
        }
    }

    public void mostrarInfo(){
        System.out.println("INFORMACION CUENTA");
        System.out.println("Titular:" + Titular);
        System.out.println("Saldo:" + Saldo);
        System.out.println("Numero Cuenta:" + NumCuenta);
    }


}
