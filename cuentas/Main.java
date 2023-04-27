package cuentas;

import cuentas.CCuenta;

/**
 * @author Noelia Bermudez
 * @version 1.0
 * @since ???
 */


public class Main {

    CCuenta cuenta1;

    /**
     Este método ejecuta la operativa de la cuenta bancaria con un valor de cantidad dado
     Al darle por parametro una cantidad crea una cuenta con la cual se crea una varbiable para guardar el saldo y mostrarlo
     seguidamente intenta retirar una cantidad dando fallo en el caso que no se pueda y seguidamente intenta ingresar una
     cantidad dada por parametro dando error al no poder
     @param cantidad El valor de cantidad a utilizar para la operativa de la cuenta bancaria.
     */


    public void operativa_cuenta(float cantidad){

// Declaración de variables
        double saldoActual;

// Inicialización de la cuenta bancaria
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

// Obtención del saldo actual
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual );

// Retiro de una cantidad de la cuenta bancaria
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

// Ingreso de una cantidad en la cuenta bancaria
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

}
