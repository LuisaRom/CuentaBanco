package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[]arg) {

        Scanner teclado = new Scanner(System.in);

        List<CuentaBancaria> listCuentas = new ArrayList<>();

        CuentaBancaria cuenta1 = new CuentaBancaria("Luisa Romero", 250000, 35795722);
        CuentaBancaria cuenta2 = new CuentaBancaria("Omar Rodirguez", 350000, 24680973);
        CuentaBancaria cuenta3 = new CuentaBancaria("Lucia Snachez", 234000, 49284659);


        listCuentas.add(cuenta1);
        listCuentas.add(cuenta2);
        listCuentas.add(cuenta3);

        System.out.println("INFORMACION INICIAL");

        for (CuentaBancaria cuenta : listCuentas){
            cuenta.mostrarInfo();
        }

        System.out.println("\nOPERACION BANCARIA ");

        System.out.print("Ingrese cantidad a depositar en la cuenta de Luisa Romero: ");
        double depositoLuisa = teclado.nextDouble();
        cuenta1.depositar(depositoLuisa);

        System.out.print("Ingrese cantidad a retirar de la cuenta de Mario Rodriguez: ");
        double retiroOmar = teclado.nextDouble();
        cuenta2.retirar(retiroOmar);

        System.out.print("Ingrese cantidad a depositar en la cuenta de Lucia Sanchez: ");
        double depositoLucia = teclado.nextDouble();
        cuenta3.depositar(depositoLucia);

        System.out.print("Ingrese cantidad a retirar de la cuenta de Lucia Sanchez: ");
        double retiroLucia = teclado.nextDouble();
        cuenta3.retirar(retiroLucia);

        System.out.print("Ingrese cantidad a retirar de la cuenta de Luisa Romero: ");
        double retiroLuisa = teclado.nextDouble();
        cuenta1.retirar(retiroLuisa);

        System.out.println("\nINFORMACIÓN ACTUALIZADA");
        for (CuentaBancaria cuenta : listCuentas) {
            cuenta.mostrarInfo();
        }

        teclado.close();
    }
}





